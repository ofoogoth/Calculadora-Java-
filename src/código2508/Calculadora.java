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
public class Calculadora {
    //Atributos
    public double iOperadorA;
    public double iOperadorB;
    //Constructor Vacío
    public Calculadora()
    {
        this.iOperadorA = 10;
        this.iOperadorB = 8;
    }
//Constructor
    public Calculadora(double iOperadorA, double iOperadorB) {
        this.iOperadorA = iOperadorA;
        this.iOperadorB = iOperadorB;
    }

    public double getiOperadorA() {
        return iOperadorA;
    }

    public void setiOperadorA(double iOperadorA) {
        this.iOperadorA = iOperadorA;
    }

    public double getiOperadorB() {
        return iOperadorB;
    }

    public void setiOperadorB(double iOperadorB) {
        this.iOperadorB = iOperadorB;
    }
    
    
    public double Suma()
    {
        return iOperadorA + iOperadorB;
    }
    
    public double Resta()
    {
        return iOperadorA - iOperadorB;
    }
    
    public double Multiplicacion()
    {
        return iOperadorA * iOperadorB;
    }
    
    public double Division()
    {
         return iOperadorA / iOperadorB;
    }
//    public int Resultado(){
//    
//    };
    
}
