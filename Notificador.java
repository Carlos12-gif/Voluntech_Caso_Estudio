package gestion.participacion;

public class Notificador {
    public void enviarCorreoConfirmacion(int idUsuario, int idProyecto, String estado) {
        System.out.println("Notificación enviada a usuario " + idUsuario +
                ": Inscripción a proyecto " + idProyecto + ", estado: " + estado);
    }
}