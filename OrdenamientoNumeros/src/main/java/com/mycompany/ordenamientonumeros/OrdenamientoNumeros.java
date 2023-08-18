/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;
import java.util.Arrays;

public class OrdenamientoNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("==========================================");
        System.out.println("======== Algoritmo De Ordenamiento =======");
        System.out.println("==========================================");
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el numero" + (i+1) + "; ");
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        
    }
    {
        
    }
    }
