package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        //Creando Scanner
        Scanner input = new Scanner(System.in);
        //Declarando variables
        int numero1, numero2,resultado=0;
        
        //Mostrar mensaje
        System.out.println("Ingrese el numero a multiplicar: ");
        numero1=input.nextInt();
        System.out.println("Ingrese el numero a multiplicar: ");
        numero2=input.nextInt();
        
        while(numero2<0){
      
        resultado=resultado + numero1;   
      numero2++;
        }
        
        
        
        //Mostrar el resultado final
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }
    
}
