package modelo.user;

/**
 *
 * @author giovanic
 */
public class Recepcionista extends Persona {

    private int biblioteca;

    public Recepcionista(int biblioteca, int codigo, String nombre, String userName, String password, String email) {
        super(codigo, nombre, userName, password, email);
        this.biblioteca = biblioteca;
    }

    public int getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(int biblioteca) {
        this.biblioteca = biblioteca;
    }

}
