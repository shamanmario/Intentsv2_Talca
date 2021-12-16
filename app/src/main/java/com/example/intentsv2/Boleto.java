package com.example.intentsv2;

import java.io.Serializable;

public class Boleto implements Serializable {

    private int numero1, numero2, numero3;

    public Boleto(){
        numero1 = 0;
        numero2 = 0;
        numero3 = 0;
    }

    public Boleto(int numero1, int numero2, int numero3){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public String ObtenerNumeros(){
        return numero1+" - "+numero2+" - "+numero3;
    }
}
