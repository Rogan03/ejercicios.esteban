/*
        System.out.println("Ingresa un número entero.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ingresa otro número entero.");
        int num2 = leer.nextInt();
        
        if(num1>=25 || num2>=25)
        System.out.println("Uno o ambos números son mayor o igual a 25.");
        
    
        else{
            System.out.println("Los números son menores a 25.");  
        }}
}
        ////------------------------------------
        System.out.println("Elija el tipo de motor.");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Usted ha elegido la bomba de agua.");
                break;
            case 2:
                System.out.println("Usted ha elegido la bomba de gasolina.");
                break;
            case 3:
                System.out.println("Usted ha elegido la bomba de hormigón");
                break;
            case 4:
                System.out.println("Usted ha elegido la bomba de pasta alimenticia");
                break;
            default:
                System.out.println("Opción errónea.");
        }}}  
////------------------------------
     System.out.println("Ingrese su nota.");
        Scanner leer = new Scanner(System.in);
        int nota;
        do {
            nota = leer.nextInt();
            if (nota > 10 || nota < 0) {
                System.out.println("Nota incorrecta, vuelva a ingresarla.");
            }
        } while (nota > 10 || nota < 0);
        System.out.println("Nota correcta.");
    }
///////--------------------------------
  System.out.println("Ingrese 20 números.");
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;
        for (int i=0; i<=20; i++){
           numero = leer.nextInt();
           if(numero==0){
               System.out.println("Se ha encontrado el número cero.");
           break;
          }
           if(numero>0){
           suma+=numero;
           }
        }
        System.out.println("El total es: " + suma);
/////----------------------------------------
   int numero;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número.");
            numero = leer.nextInt();
            if (numero<=20 && numero>=1){
                System.out.print(numero);
                for (int j= 0; j < numero; j++) {
                    System.out.print(" *");
                }
                System.out.println(" ");
                System.out.println("-----------");
            }
            else {
                System.out.println("Debe estar entre 1 y 20 unidades.");
            }
        }

    }
 */         
 /*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ejerciciosdia3;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class ejerciciosdeteoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
}
