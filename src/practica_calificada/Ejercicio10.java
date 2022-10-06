/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_calificada;
import java.util.Scanner;
/**
 *
 * @author Coms By ASUS
 */
public class Ejercicio10 {
       public static void main(String[]args) { 
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros "); 
        int elementos = dato.nextInt(); 
        int[] n = new int[elementos];
        System.out.println("Ingrese los números a ordenar ");
        for(int a = 0; a < n.length; a++) { 
        n[a] = dato.nextInt();
     } 
       int orden = 0; for(int b = 1; b < n.length; b++) {
       for(int c = 0; c < n.length - b; c++) {
       if(n[c] > n[c+1]) {
       orden = n[c]; n[c] = n[c+1]; n[c+1] = orden;
     } } 
    } 
     for(int i = 0; i <n.length; i++) { 
     System.out.print(n[i] + " ");
    } 
  }
}
