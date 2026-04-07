public class Magia extends Carta implements Activable {

    public Magia(String nombreCarta) {
        super(nombreCarta, TipoCarta.MAGIA, true);
    }

    public void usar(Jugador jugadorActual, Jugador jugadorRival) {
        activar(jugadorActual, jugadorRival);
    }

    public void activar(Jugador jugadorActual, Jugador jugadorRival) {
        // efecto simple
        System.out.println("Activaste " + getNombreCarta());

        jugadorActual.robarCarta();
        jugadorActual.robarCarta();
    }
}