
import java.util.Scanner;

public class Juego {

    private Jugador j1;
    private Jugador j2;
    private Scanner sc;

    public Juego(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
        sc = new Scanner(System.in);
    }

    public void iniciar() {

        // robar 5 cartas
        for (int i = 0; i < 5; i++) {
            j1.robarCarta();
            j2.robarCarta();
        }

        boolean turnoJ1 = Math.random() < 0.5;
        boolean primerTurno = true;

        while (j1.getVida() > 0 && j2.getVida() > 0) {

            Jugador actual = turnoJ1 ? j1 : j2;
            Jugador rival = turnoJ1 ? j2 : j1;

            System.out.println("\n-----------------------");
            System.out.println("turno de " + actual.getNombre());
            System.out.println("vida: " + actual.getVida());
            System.out.println("vida rival: " + rival.getVida());

            actual.robarCarta();

            System.out.println("mano:");
            for (int i = 0; i < actual.getMano().size(); i++) {
                System.out.println(i + " - " + actual.getMano().get(i).getNombre());
            }

            System.out.println("1. jugar carta");
            System.out.println("2. atacar");
            int op = sc.nextInt();

            if (op == 1 && actual.getMano().size() > 0) {
                System.out.println("elige carta:");
                int pos = sc.nextInt();
                actual.jugarCarta(pos, rival);
            }

            // solo 1 ataque por turno
            actual.atacar(rival, primerTurno);

            primerTurno = false;
            turnoJ1 = !turnoJ1;
        }

        System.out.println("\n======================");
        if (j1.getVida() <= 0)
            System.out.println("Gano " + j2.getNombre());
        else
            System.out.println("Gano " + j1.getNombre());
    }
}