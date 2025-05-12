/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author J.Pallarés
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: "+ calc.sumar(1, 2));
        System.out.println("Resta: " + calc.restar(5, 2));
    }
    
}
