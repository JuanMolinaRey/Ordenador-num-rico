package factoria.juanantonio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca los números seguidos de un enter e introduzca 'fin' para terminar):");

        while (true) {
            String input = entradaDatos.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido o 'fin' para terminar.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se han introducido números.");
            entradaDatos.close();
            return;
        }

        System.out.println("¿Cómo quieres ordenar la cadena numérica? (ascendente/descendente)");
        String decision = entradaDatos.nextLine();

        if (decision.equalsIgnoreCase("ascendente")) {
            Collections.sort(numeros);
            System.out.println("Tus números ordenados ascendent1emente son:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        } else if (decision.equalsIgnoreCase("descendente")) {
            Collections.sort(numeros, Collections.reverseOrder());
            System.out.println("Tus números ordenados descendentemente son:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        }
        else{
            System.out.println("Opción no válida. Por favor, elija 'ascendente' o 'descendente'.");
        }

        entradaDatos.close();
    }
}
