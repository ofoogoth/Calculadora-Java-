/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código2508;

/**
 *
 * @author dtorres9
 */
public class Código2508 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Calculadora c1 = new Calculadora(6,5);
        Calculadora cDefecto = new Calculadora();
        System.out.println("Por Defecto");
        System.out.println(cDefecto.Suma());
        System.out.println(cDefecto.Resta());
        System.out.println(cDefecto.Multiplicacion());
        System.out.println(cDefecto.Division());
        System.out.println("Con valores");
        System.out.println(c1.Suma());
        System.out.println(c1.Resta());
        System.out.println(c1.Multiplicacion());
        System.out.println(c1.Division());
    }
    
}

