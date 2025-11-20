package gestion.participacion;

import java.util.Date;

public class Certificado {
    private int idVoluntario;
    private double horasTotales;
    private Date fechaEmision;
    private String codigoValidacion;

    public Certificado(int idVoluntario, double horasTotales) {
        this.idVoluntario = idVoluntario;
        this.horasTotales = horasTotales;
    }

    public String generarCertificadoDigital() {
        this.fechaEmision = new Date();
        this.codigoValidacion = java.util.UUID.randomUUID().toString();
        return "Certificado emitido. Código: " + codigoValidacion;
    }
}