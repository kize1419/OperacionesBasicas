/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Propietario
 */
public class Operaciones {
    private int a;
    private int b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int suma(){
        return a + b;
    }
    
    public int resta(){
        return a - b;
    }
    
    public int multiplicacion(){
        return a * b;
    }
    
    public double division(){
        return (double) a/b;
    }    
}
