package administracion.sistema;

public class Organizacion {
    private int id;
    private String nombre;
    private String estado;

    public Organizacion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estado = "Activa";
    }

    public String getNombre() { return nombre; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}