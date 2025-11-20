package core.usuario;

import java.util.List;
import gestion.participacion.Certificado;

public class Voluntario extends Usuario {
    private List<String> intereses;
    private String disponibilidad;
    private double horasAcumuladas;

    public Voluntario(int id, String email, String passwordHash, List<String> intereses, String disponibilidad) {
        super(id, email, passwordHash, "Voluntario");
        this.intereses = intereses;
        this.disponibilidad = disponibilidad;
        this.horasAcumuladas = 0.0;
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Voluntario: " + email + ", Horas Acumuladas: " + horasAcumuladas);
    }

    public boolean registrarPerfil(int edad) {
        if (edad < 16) {
            System.out.println("Registro fallido: edad mínima 16 años.");
            return false;
        }
        return true;
    }

    public Certificado descargarCertificado() {
        Certificado cert = new Certificado(this.id, this.horasAcumuladas);
        System.out.println("Solicitando certificado digital...");
        return cert;
    }

    public double getHorasAcumuladas() { return horasAcumuladas; }
    public void agregarHoras(double horas) { this.horasAcumuladas += horas; }
    public List<String> getIntereses() { return intereses; }
}