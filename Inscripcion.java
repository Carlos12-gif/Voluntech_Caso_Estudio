package gestion.participacion;

import java.util.Date;

public class Inscripcion {
    private int id;
    private int idVoluntario;
    private int idProyecto;
    private Date fechaSolicitud;
    private String estado; // Pendiente, Aprobado, Rechazado

    public Inscripcion(int id, int idVoluntario, int idProyecto, Date fechaSolicitud) {
        this.id = id;
        this.idVoluntario = idVoluntario;
        this.idProyecto = idProyecto;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = "Pendiente";
    }

    public void aprobar(Notificador notificador) {
        this.estado = "Aprobado";
        notificador.enviarCorreoConfirmacion(idVoluntario, idProyecto, "Aprobada");
    }

    public void rechazar(Notificador notificador) {
        this.estado = "Rechazado";
        notificador.enviarCorreoConfirmacion(idVoluntario, idProyecto, "Rechazada");
    }

    // Método necesario para que App.java pueda crear la Asistencia
    public int getId() {
        return id;
    }

    public int getIdProyecto() { return idProyecto; }
    public String getEstado() { return estado; }
}