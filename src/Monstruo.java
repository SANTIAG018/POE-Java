public class Monstruo extends Carta {

    public Monstruo() {
    }

    public Monstruo(String nombre, short ataque, short defensa, Estrellas estrellas, boolean visible) {
        super(nombre, ataque, defensa, TipoCarta.MONSTRUO, estrellas, visible);
    }

    public void atacar() {
        System.out.println(getNombre() + " ataca con " + getAtaque() + " puntos");
    }
}