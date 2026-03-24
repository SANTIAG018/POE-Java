public class Carta {
    public abstract class Carta {

    private String nombre;
    private short ataque;
    private short defensa;
    private TipoCarta tipo;
    private Estrellas estrellas;
    private boolean visible;

    public Carta() {
    }

    public Carta(String nombre, short ataque,
        short defensa, TipoCarta tipo, Estrellas estrellas,
        boolean visible) {

        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
        this.estrellas = estrellas;
        this.visible = visible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getAtaque() {
        return ataque;
    }

    public void setAtaque(short ataque) {
        this.ataque = ataque;
    }

    public short getDefensa() {
        return defensa;
    }

    public void setDefensa(short defensa) {
        this.defensa = defensa;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }

    public Estrellas getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Estrellas estrellas) {
        this.estrellas = estrellas;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public enum Estrellas {
        UNA, DOS, TRES, CUATRO, CINCO,
        SEIS, SIETE, OCHO, NUEVE, DIEZ,
        ONCE, DOCE
    }
}
}
