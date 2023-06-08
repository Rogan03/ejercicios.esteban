/*
 */
package ejercicio4practicadia52.entidades;

import ejercicio4practicadia52.entidades.interfaces.calculosFormas;

/**
 *
 * @author Esteban
 */
public class ClasePadre implements calculosFormas {

    protected double numPi = Math.PI;
    protected double rad;
    protected double base;
    protected double altura;
    protected double diametro;

    @Override
    public void calcularAreaCir() {
        double res = numPi * Math.pow(rad, 2);
        System.out.println("Area Circulo " + res);
    }

    @Override
    public void calcularAreaRec() {
        double res = base * altura;
        System.out.println("Area Rectangulo " +res);
    }

    @Override
    public void calcularPerCir() {
        double res = numPi * diametro;
        System.out.println("Perimetro Circulo " +res);
    }

    @Override
    public void calcularPerRec() {
        double res = (base + altura) * 2;
        System.out.println("Perimetro Rectangulo " +res);
    }

    public double getNumPi() {
        return numPi;
    }

    public void setNumPi(double numPi) {
        this.numPi = numPi;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public ClasePadre() {
    }

    public ClasePadre(double rad, double base, double altura, double diametro) {
        this.rad = rad;
        this.base = base;
        this.altura = altura;
        this.diametro = diametro;
    }

}
