package com.upemor.grafoponderado;

import lombok.Getter;
import lombok.Setter;

/** @author cerimice **/

@Setter
@Getter
public class Adyacencia{
    
    private Nodo nodo;
    private int valor;
    
    public Adyacencia(){
        nodo = null;
        valor = 1;
    }
    
    public Adyacencia(Nodo nodo, double costo){
        this.nodo = nodo;
        this.valor = (int)costo;
    }
    
    @Override
    public String toString(){
        return "["+nodo+","+valor+"]";
    }
}
