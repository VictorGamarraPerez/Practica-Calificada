/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_calificada;
import java.util.Scanner;
/**
 *
 * VICTOR GAMARRA
 */
public class Ejercicio8 {
    
    public static void main(String[]args){
        double descuento = 0;
        double montototal = 0;
        double venta = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de la venta");
        venta = entrada.nextDouble();
        System.out.println("La venta es de: "+venta);
        if(venta>= 1200){
            descuento = venta * .17;
        }
        else{
            if(venta>= 1000){
                descuento=venta *0.20;
            }
            else{
                if(venta<1000){
                    descuento=0;
                }
            }
        }
        System.out.println("El descuento es de: "+descuento);
        montototal = venta-descuento;
        System.out.println("El monto total de la venta es de: "+montototal);
    }
    
}
