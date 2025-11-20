package core.proyecto;

public class Proyecto {
    private int id;
    private String nombre;
    private int idCoordinador;
    private String requisitos;
    private int cuposDisponibles;
    private int inscritos;
    private String estado;

    public Proyecto(int id, String nombre, int idCoordinador, String requisitos, int cuposDisponibles) {
        this.id = id;
        this.nombre = nombre;
        this.idCoordinador = idCoordinador;
        this.requisitos = requisitos;
        this.cuposDisponibles = cuposDisponibles;
        this.inscritos = 0;
        this.estado = "Activo";
    }

    public int obtenerCuposDisponibles() { return cuposDisponibles - inscritos; }
    public void agregarInscrito() { this.inscritos++; }
    public void actualizarEstado(String nuevoEstado) { this.estado = nuevoEstado; }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
}