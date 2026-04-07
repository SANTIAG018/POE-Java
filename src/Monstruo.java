// representa una carta de monstruo
public class Monstruo extends Carta {

    private int ataque;
    private int defensa;
    private int nivel;

    public Monstruo(String nombre, int ataque, int defensa, int nivel) {
        super(nombre, TipoCarta.MONSTRUO);
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void usar(Jugador actual, Jugador rival) {
        actual.invocar(this);
        System.out.println("Invocaste " + getNombre());
    }
}