/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejercicioaprendizaje5;

import java.util.Scanner;

public class EjercicioAprendizaje5 {
    public static void main(String[] args) {
        double num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        num = entrada.nextDouble();
        
        System.out.println("Su doble es "+(num*2)+" su triple es "+(num*3)+" y su raiz cuadrada es "+Math.sqrt(num));
    }
    
}
