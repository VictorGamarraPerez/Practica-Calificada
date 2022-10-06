/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_calificada;
import java.util.*;
/**
 *
 * VICTOR GAMARRA
 */
public class Ejercicio9 {
    public static void main(String []args){ 
       Scanner dato = new Scanner(System.in); 
       int c=0; int a; float m =0;
       System.out.println("Ingresar la cantidad de atletas");
       c = dato.nextInt(); String atleta[] = new String[c];
       float tiempo[] = new float[c];
       for( a=0;a<c;a++){ 
       System.out.println("Ingrese el nombre del atleta");
       atleta[a] = dato.next();
       System.out.println("Ingrese el tiempo del recorrido");
       tiempo[a] = dato.nextFloat();
    } 
    for (int i = 1; i < tiempo.length; i++) { 
    if (m > tiempo[i]) { m = tiempo[i]; 
    }else{ 
        m = tiempo[i];            
        System.out.println("El ganador es el atleta con el tiempo "+m);            }
    } 
  } 
}
