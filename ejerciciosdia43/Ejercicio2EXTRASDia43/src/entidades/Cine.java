/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Cine {
    private String peliActual = "La leyenda de Palalong";
    private int publico;
    private int edadMin = 9;
    private int precio = 1500;
    
    public void generarPublico() {
        this.publico = (int) (Math.random()*48);
    }

    public Cine() {
    }

    public Cine(int publico) {
        this.publico = publico;
    }

    public String getPeliActual() {
        return peliActual;
    }

    public void setPeliActual(String peliActual) {
        this.peliActual = peliActual;
    }

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peliActual=" + peliActual + ", publico=" + publico + ", edadMin=" + edadMin + ", precio=" + precio + '}';
    }
}

