/*
Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Espectador {

    private int ID;
    private int edad;
    private int dinero;
    private int fila;
    private String columna;

    public Espectador() {
    }

    public Espectador(int ID, int edad, int dinero, int fila, String columna) {
        this.ID = ID;
        this.edad = edad;
        this.dinero = dinero;
        this.fila = fila;
        this.columna = columna;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }


    @Override
    public String toString() {
        return "Espectador{" + "ID=" + ID + ", edad=" + edad + ", dinero=" + dinero + '}';
    }

}
