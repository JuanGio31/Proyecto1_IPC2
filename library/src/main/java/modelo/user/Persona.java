package modelo.user;

/**
 *
 * @author giovanic
 */
public class Persona {

    private int codigo;
    private String nombre;
    private String userName;
    private String password;
    private String email;

    public Persona(int codigo, String nombre, String userName, String password, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
