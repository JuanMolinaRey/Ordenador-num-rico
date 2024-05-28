package factoria.juanantonio;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            

        System.out.println("~~~~~~~~Ordenador de Números.~~~~~~~~~~");

        System.out.println("-Introduzca la cantidad de números a ordenar: ");
 
        int cantidadNumeros= scanner.nextInt();

        int numeros [] = {cantidadNumeros};
        
         
        Arrays.sort(numeros);

        String A = "Ascendente";
        String D = "Descendente";

        System.out.println("¿De que forma quieres que se coloquen los números? " +A+ " o " +D+" : ");

        //if () {

         for (int i = 0; i < numeros.length; i++) {
         System.out.println(""+numeros[i]);

        }
         for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(""+numeros[i]);
   
           }
//}

     }
 }
    
