// cartas magicas con efectos simples
public class Magia extends Carta implements Activable {

    public Magia(String nombre) {
        super(nombre, TipoCarta.MAGIA);
    }

    public void usar(Jugador actual, Jugador rival) {
        activar(actual, rival);
    }

    public void activar(Jugador actual, Jugador rival) {

        System.out.println("Usaste " + getNombre());

        if (getNombre().equals("Curacion")) {
            actual.aumentarVida(1000);
        } else if (getNombre().equals("Fuerza")) {
            if (actual.tieneMonstruos()) {
                actual.aumentarAtaque(500);
            }
        } else {
            // robo de cartas
            actual.robarCarta();
            actual.robarCarta();
        }
    }
}