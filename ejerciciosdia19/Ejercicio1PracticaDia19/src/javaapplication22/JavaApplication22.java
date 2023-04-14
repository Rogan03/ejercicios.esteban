
package javaapplication22;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class JavaApplication22 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double efectivo;
        CuentaBancariaServicio sb = new CuentaBancariaServicio();
        
        CuentaBancaria Cliente1 = sb.crearCuenta();
        
        
        
         int var;
        
        
        do{
            System.out.println("ingrese opcion\n 1-ingresar dinero\n 2-retirar dinero \n3-extraccion rapída\n4consultar saldo\n5-consultar datos\n6-salir");
       
           var = leer.nextInt();
        switch (var) {
            case 1:
                System.out.println("ingrese efectivo a depositar");
                efectivo = leer.nextDouble();
                sb.ingresar(efectivo, Cliente1);
                break;
            case 2:
                System.out.println("ingrese efectivo a retirar");
                efectivo = leer.nextDouble();
                sb.retirar(efectivo, Cliente1);
                break;
            case 3:
                System.out.println("ingrese efectivo para la extraccion rapida");
                efectivo = leer.nextDouble();
                sb.extraccionRapida(efectivo, Cliente1);
                break;
            case 4:
                sb.consultarSaldo(Cliente1);
                break;
            case 5:
                sb.consultarDatos(Cliente1);
                break;
            case 6:
                break;
            default:
                System.out.println("opcion incorrecta");
               // /System.out.println("ingrese otra opcion");
        }
        }while(var!=6);
        
    }
    
}
