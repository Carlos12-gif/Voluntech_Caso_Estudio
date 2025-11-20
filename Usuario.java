package core.usuario;

public abstract class Usuario implements PerfilUsuario {
    protected int id;
    protected String email;
    protected String passwordHash;
    protected String rol;

    public Usuario(int id, String email, String passwordHash, String rol) {
        this.id = id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getRol() { return rol; }
}