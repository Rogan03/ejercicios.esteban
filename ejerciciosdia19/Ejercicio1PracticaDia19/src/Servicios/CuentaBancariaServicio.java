/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author JAVIER ESPINDOLA
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.println("ingrese numero de cuenta");
        int numero = leer.nextInt();

        System.out.println("ingrese dni");
        long dni = leer.nextLong();

        System.out.println("ingrese saldo");
        double saldo = leer.nextDouble();

        CuentaBancaria nuevoCliente = new CuentaBancaria(numero, dni, saldo);

        return nuevoCliente;

    }

    public void ingresar(double efectivo, CuentaBancaria cliente) {

        cliente.setSaldoActual(cliente.getSaldoActual() + efectivo);
        System.out.println("se ingreso correcotamente, su saldo altual es " + cliente.getSaldoActual());

    }

    public void retirar(double efectivo, CuentaBancaria cliente) {

        if (cliente.getSaldoActual() > efectivo) {
            cliente.setSaldoActual(cliente.getSaldoActual() - efectivo);
            System.out.println("efectivo retirado " + efectivo + "su saldo actual es " + cliente.getSaldoActual());
        } else {
            System.out.println("su saldo es inferior a lo solicitado ,su retiro fue de " + cliente.getSaldoActual());
            cliente.setSaldoActual(0);
        }

    }

    public void extraccionRapida(double efectivo, CuentaBancaria cli) {

        if (efectivo <= cli.getSaldoActual() * .2) {
            // retirar(efectivo, cli);
            cli.setSaldoActual(cli.getSaldoActual() - efectivo);
            System.out.println("efectivo retirado " + efectivo + "su saldo actual es " + cli.getSaldoActual());
        } else {
            System.out.println("no se puede retirar efectivo mayor al 20%");
        }

    }

    public void consultarSaldo(CuentaBancaria c) {
        System.out.println("su saldo es: " + c.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cli) {

        // System.out.println(cli.toString());
        System.out.println("Datos del cliente \nN° Cuenta: " + cli.getNumeroCeunta()
                + "\nN° DNI: " + cli.getDniCliente()
                + "\nSaldo Actual" + cli.getSaldoActual());

    }

}
