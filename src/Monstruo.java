public class Monstruo extends Carta {

    private int puntosAtaque;
    private int puntosDefensa;
    private int nivel;

    public Monstruo(String nombreCarta, int puntosAtaque, int puntosDefensa, int nivel) {
        super(nombreCarta, TipoCarta.MONSTRUO, true);
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.nivel = nivel;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void usar(Jugador jugadorActual, Jugador jugadorRival) {
        // aqui se invoca el monstruo
        jugadorActual.invocarMonstruo(this);
        System.out.println("Invocaste a " + getNombreCarta());
    }
}