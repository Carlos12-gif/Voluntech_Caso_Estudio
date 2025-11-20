package administracion.sistema;

import core.usuario.Usuario;

public class Administrador extends Usuario {
    public Administrador(int id, String email, String passwordHash) {
        super(id, email, passwordHash, "Administrador");
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Administrador del Sistema: " + email);
    }

    public void gestionarUsuario(Usuario usuario, String accion) {
        System.out.println("Admin " + this.id + ": " + accion + " usuario " + usuario.getId());
    }

    public void gestionarOrganizacion(Organizacion org, String accion) {
        org.setEstado(accion.equals("activar") ? "Activa" : "Desactivada");
        System.out.println("Organización " + org.getNombre() + " ahora está: " + org.getEstado());
    }
}