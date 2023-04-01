package javaapplication11;

import java.util.Scanner;

public class Ejercicio6PracticaDia9 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int control=0;
        int [] vectorFila= new int [3];
        int [] vectorCol= new int [3];
        int [][] matriz= new int [3][3];
        
        System.out.println("Ingrese los valores de la matriz cuadrada:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                num= leer.nextInt();
                while (num<1 || num>9) {
                    System.out.println("Error. Ingrese un número entre 1 y 9: ");
                    num= leer.nextInt();
                }
                matriz[i][j]= num; //asigna valor matriz
            }
        }
        System.out.println("Matriz ingresada: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //Diagonal principal
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (i==j) {
                    cont1= cont1+ matriz[i][j];
                }
            }
        }    
        //Diagonal secundaria
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if ((i+j)==2) {
                    cont2= cont2+ matriz[i][j];
                }
            }
        }    
        //Suma de filas
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                cont3= cont3+ matriz[i][j];
            }
            vectorFila[i]= cont3;
            cont3=0;
        }    
        //Suma de columnas
        for (int j=0; j<3; j++) {
            for (int i=0; i<3; i++) {
                cont4= cont4+ matriz[i][j];
            }
            vectorCol[j]= cont4;
            cont4=0;
        }    
        //Verificar igualdad en filas y columnas
        for (int i=0; i<3; i++) {
            if (vectorFila[i]!=vectorCol[i]) {
                control++;
            }
        }
        //verificar igualdad de diagonales
        if (cont1!=cont2) {
            control++;
        }
        //verificar igualdad entre cualquier posición de uno de los vectores y las diagonales
        if (vectorCol[0]!=cont1) { //cont1 es diagonal principal
            control++;
        }
        if (control==0) {
            System.out.println("Es un cuadrado mágico.");
        }
        else {
            System.out.println("No es un cuadrado mágico.");
        }
    }
}