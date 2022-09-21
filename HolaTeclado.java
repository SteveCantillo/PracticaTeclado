/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTeclado;

/**
 *
 * @author steve
 */
public class HolaTeclado {
    public static void main( String args[]) {
        String nombre;
        int edad;
        
        System.out.println("Dime tu nombre: ");
        nombre = Teclado.LeeCadena();
        
        System.out.println( "Dime tu edad: ");
        edad = Teclado.LeeEntero();
        
        System.out.println( "Hola " + nombre + ", tienes " + edad + " años");
    }
    
}
