package Entidad;

import java.util.Scanner;

public class Juego {
    private int intentos; 
    private int victoria1;
    private int victoria2;
    
    public Juego() {
    }

    public Juego(int intentos, int victoria1) {
        this.intentos = intentos;
        this.victoria1 = victoria1;
        this.victoria2 = victoria2;
    }
    
    public void iniciarJuego(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num=leer.nextInt();
        int adv;
        int cont=0;
        
        do{
            System.out.println("Intente adivinar el número ingresado: ");
            adv=leer.nextInt();
            if(adv==num){
                System.out.println("Ganaste");
                victoria2++;
            }
            else if (adv<num){
                System.out.println("Es más alto");
            }
            else {
                System.out.println("Es más bajo");
            }
            cont++;
            
        } while (adv!=num && cont<3);
        intentos= cont;
        if(adv!=num) {
            victoria1++;
        }
        
    }

    @Override
    public String toString() {
        return "Juego{" + "intentos=" + intentos + ", victoria1=" + victoria1 + ", victoria2=" + victoria2 + '}';
    }

    
}
