public class App {

    public static void main(String[] args) {

        Mazo mazo1 = new Mazo();
        Mazo mazo2 = new Mazo();

        mazo1.llenarMazo();
        mazo2.llenarMazo();

        Jugador j1 = new Jugador("Santiago", mazo1);
        Jugador j2 = new Jugador("Carlos", mazo2);

        Juego juego = new Juego(j1, j2);
        juego.iniciar();
    }
}