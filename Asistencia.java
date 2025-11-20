package gestion.participacion;

import core.usuario.Voluntario;
import java.util.Date;

public class Asistencia {
    private int id;
    private int idInscripcion;
    private Date fecha;
    private double horasRegistradas;
    private String estado;

    public Asistencia(int id, int idInscripcion, Date fecha, double horasRegistradas) {
        this.id = id;
        this.idInscripcion = idInscripcion;
        this.fecha = fecha;
        this.horasRegistradas = horasRegistradas;
        this.estado = "Pendiente";
    }

    public boolean validarHoras(boolean coordinadorAprueba, Voluntario voluntario) {
        if (coordinadorAprueba) {
            this.estado = "Aprobado";
            voluntario.agregarHoras(this.horasRegistradas);
            System.out.println("Horas de asistencia aprobadas y contabilizadas.");
            return true;
        } else {
            this.estado = "Rechazado";
            return false;
        }
    }

    public double getHorasRegistradas() { return horasRegistradas; }
    public String getEstado() { return estado; }
}