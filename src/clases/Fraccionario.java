/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author rmorales1
 */
public class Fraccionario {
   private int numerador;
   private int denominador;
   
   public Fraccionario(int numerador, int denominador) throws DenominadorCeroException{
       this.numerador=numerador;
       this.denominador=denominador;
       if(denominador == 0){
           throw new DenominadorCeroException();
       }
   }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccionario suma(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador + this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num,den);
        return f;
     }
    
     public Fraccionario resta(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador - this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num,den);
        return f;
     }
   
}
