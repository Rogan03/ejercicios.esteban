/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Revolver {
    private int posAct, posAgua;
    private boolean moja2;
    
    public void llenarRevolver() {
        posAct = (int) (Math.random() * 6+1);
        posAgua = (int) (Math.random() * 6+1);
    }
    
    public void mojar() {
        if (posAct == posAgua) {
            moja2=true;
            System.out.println("TE MOJASTE!");
        }
        else if (posAct >= 6) {
            posAct=0;
        }
        else {
            moja2=false;
            posAct++;
        }
    }

    public Revolver() {
    }

    public Revolver(int posAct, int posAgua, boolean moja2) {
        this.posAct = posAct;
        this.posAgua = posAgua;
        this.moja2 = moja2;
    }

    public int getPosAct() {
        return posAct;
    }

    public void setPosAct(int posAct) {
        this.posAct = posAct;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public boolean isMoja2() {
        return moja2;
    }

    public void setMoja2(boolean moja2) {
        this.moja2 = moja2;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posAct=" + posAct + ", posAgua=" + posAgua + '}';
    }
    
}
