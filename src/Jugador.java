import java.util.ArrayList;

// representa al jugador
public class Jugador {

    private String nombre;
    private int vida;
    private Mazo mazo;
    private ArrayList<Carta> mano;
    private ArrayList<Monstruo> campo;

    public Jugador(String nombre, Mazo mazo) {
        this.nombre = nombre;
        this.mazo = mazo;
        this.vida = 8000;
        mano = new ArrayList<Carta>();
        campo = new ArrayList<Monstruo>();
    }

    public void robarCarta() {
        Carta c = mazo.robar();

        if (c == null) {
            vida = 0;
            System.out.println(nombre + " pierde por quedarse sin cartas");
        } else {
            mano.add(c);
        }
    }

    public void invocar(Monstruo m) {
        campo.add(m);
    }

    public boolean tieneMonstruos() {
        return campo.size() > 0;
    }

    public void aumentarAtaque(int valor) {
        if (campo.size() > 0) {
            Monstruo m = campo.get(0);
            System.out.println("Aumentaste ataque de " + m.getNombre());
        }
    }

    public void jugarCarta(int pos, Jugador rival) {
        Carta c = mano.remove(pos);
        c.usar(this, rival);
    }

    public void atacar(Jugador rival, boolean primerTurno) {

        if (primerTurno) {
            System.out.println("No puedes atacar en el primer turno");
            return;
        }

        if (campo.size() == 0) {
            System.out.println("No tienes monstruos");
            return;
        }

        Monstruo atacante = campo.get(0);

        if (rival.campo.size() == 0) {
            rival.recibirDanio(atacante.getAtaque());
            System.out.println("Ataque directo!");
        } else {
            Monstruo defensor = rival.campo.get(0);

            if (atacante.getAtaque() > defensor.getDefensa()) {
                int danio = atacante.getAtaque() - defensor.getDefensa();
                rival.campo.remove(0);
                rival.recibirDanio(danio);
                System.out.println("Destruiste el monstruo");
            } else {
                System.out.println("No lo destruiste");
            }
        }
    }

    public void recibirDanio(int d) {
        vida -= d;
        if (vida < 0) vida = 0;
    }

    public void aumentarVida(int v) {
        vida += v;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public ArrayList<Monstruo> getCampo() {
        return campo;
    }
}