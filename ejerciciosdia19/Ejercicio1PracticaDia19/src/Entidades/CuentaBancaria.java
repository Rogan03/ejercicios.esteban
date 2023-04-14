/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author JAVIER ESPINDOLA
 */
public class CuentaBancaria {
    
    private int numeroCeunta;
    private long  dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCeunta, long dniCliente, double saldoActual) {
        this.numeroCeunta = numeroCeunta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCeunta() {
        return numeroCeunta;
    }

    public void setNumeroCeunta(int numeroCeunta) {
        this.numeroCeunta = numeroCeunta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCeunta=" + numeroCeunta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
}
