public abstract class Carta {

    private String nombreCarta;
    private TipoCarta tipoCarta;
    private boolean estaVisible;

    public Carta(String nombreCarta, TipoCarta tipoCarta, boolean estaVisible) {
        this.nombreCarta = nombreCarta;
        this.tipoCarta = tipoCarta;
        this.estaVisible = estaVisible;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public boolean isEstaVisible() {
        return estaVisible;
    }

    public abstract void usar(Jugador jugadorActual, Jugador jugadorRival);
}