package com.upemor.arbolbinario;

import lombok.Getter;
import lombok.Setter;

/** @author cerimice **/

@Getter
@Setter
public class Nodo{
    
    private long id;
    
    private String nombre;
    
    private Nodo izquierdo;
    private Nodo derecho;
    
    public Nodo(){
        id = 0;
        nombre = "";
        izquierdo = null;
        derecho = null;
    }
    
    public Nodo(long id,String nombre){
        this.id = id;
        this.nombre = nombre;
        izquierdo = null;
        derecho = null;
    }
    
    @Override
    public String toString(){
        return "("+id+")";
    }
    
}
