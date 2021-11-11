package com.upemor.grafoponderado;

import lombok.Getter;
import lombok.Setter;

/** @author cerimice **/

@Getter
@Setter
public class Etiqueta{
    
    private Nodo nodo; /* Nodo predecesor */
    private double distancia; /* Distancia acumulada */
    
    public Etiqueta(){
        nodo = null;
        distancia = 0;
    }
    
    public Etiqueta(Nodo nodo,double distancia){
        this.nodo = nodo;
        this.distancia = distancia;
    }
    
    @Override
    public String toString(){
        return "["+nodo+","+distancia+"]";
    }
}
