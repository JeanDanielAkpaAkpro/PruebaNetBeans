

package com.mycompany.firivacholi;
import java.util.Scanner;

public class Firivacholi {

    public static void main(String[] args) {
        System.out.println("WE ARE GONNA INICIALIZE THE PROGRAMM");
        System.out.println("We are gonna show the fibonachi serie");
        int num1;
        int num2;
        int suma;
        int contador;
        num1=1;
        num2=1;
        Scanner nextEscaner = new Scanner (System.in);
        System.out.println("Introduce el número de elementos a mostrar");
        contador = nextEscaner.nextInt();   
        System.out.println("" + num1);
        System.out.println("" + num2);
        for (int i=0; i<contador-2;i++){
            suma=num1+num2;
            System.out.println("" + suma);
            num1=num2;
            num2=suma;
            
        }
    }
}
