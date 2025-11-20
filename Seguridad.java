package administracion.sistema;

public class Seguridad {
    public static String encriptarPassword(String password) {
        return "HASHED_" + password.toUpperCase();
    }

    public static boolean verificarEmail(String email) {
        System.out.println("Verificación por correo enviada a: " + email);
        return true;
    }
}