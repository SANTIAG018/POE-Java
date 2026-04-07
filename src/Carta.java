// clase base de todas las cartas
public abstract class Carta {

    private String nombre;
    private TipoCarta tipo;

    public Carta(String nombre, TipoCarta tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    // cada carta hace algo diferente
    public abstract void usar(Jugador actual, Jugador rival);
}