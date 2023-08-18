/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;
import java.util.Arrays;

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        // Ingreso de los cinco números
        System.out.println("===================================================");
        System.out.println("=============  Algoritmo De Ordenamiento ==========");
        System.out.println("===================================================");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Ordenamiento de los números
        Arrays.sort(numeros);
        
        // Mostrar los números ordenados de menor a mayor
        System.out.println("==================================");
        System.out.println("Números ordenados de menor a mayor:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}
