/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Carta {

    private int num;
    private String palo;

    public void definirCarta() {
        this.num = (int) (Math.random() * 12 + 1);
        int aux = (int) (Math.random() * 4 + 1);

        if (aux == 1) {
            this.palo = "espada";
        }
        if (aux == 2) {
            this.palo = "bastos";
        }
        if (aux == 3) {
            this.palo = "oro";
        }
        if (aux == 4) {
            this.palo = "copa";
        }
    }

    public Carta() {
    }

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }

}
