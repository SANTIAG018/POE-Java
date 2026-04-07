
import java.util.ArrayList;
import java.util.Collections;

// maneja las cartas
public class Mazo {

    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<Carta>();
    }

    public void llenarMazo() {

        // 30 monstruos
        for (int i = 0; i < 30; i++) {
            cartas.add(new Monstruo("Guerrero " + i, 1000 + i * 10, 900, 4));
        }

        // 10 magias
        cartas.add(new Magia("Curacion"));
        cartas.add(new Magia("Fuerza"));

        for (int i = 0; i < 8; i++) {
            cartas.add(new Magia("Robo"));
        }

        Collections.shuffle(cartas);
    }

    public Carta robar() {
        if (cartas.size() == 0) return null;
        return cartas.remove(0);
    }
}