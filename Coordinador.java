package core.usuario;

import core.proyecto.Proyecto;

public class Coordinador extends Usuario {
    private int idOrganizacion;

    public Coordinador(int id, String email, String passwordHash, int idOrganizacion) {
        super(id, email, passwordHash, "Coordinador");
        this.idOrganizacion = idOrganizacion;
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Coordinador: " + email + ", Org ID: " + idOrganizacion);
    }

    public Proyecto crearProyecto(int idProyecto, String nombre, String requisitos, int cupos) {
        Proyecto nuevoProyecto = new Proyecto(idProyecto, nombre, this.id, requisitos, cupos);
        System.out.println("Proyecto " + nombre + " creado.");
        return nuevoProyecto;
    }

    public void aprobarSolicitud(int idInscripcion) {
        System.out.println("Aprobando solicitud de inscripción " + idInscripcion);
    }
}