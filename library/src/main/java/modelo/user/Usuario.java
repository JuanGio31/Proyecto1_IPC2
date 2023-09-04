package modelo.user;

/**
 *
 * @author giovanic
 */
public class Usuario extends Persona {

    private float saldoInicial;

    public Usuario(float saldoInicial, int codigo, String nombre, String userName, String password, String email) {
        super(codigo, nombre, userName, password, email);
        this.saldoInicial = saldoInicial;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

}
