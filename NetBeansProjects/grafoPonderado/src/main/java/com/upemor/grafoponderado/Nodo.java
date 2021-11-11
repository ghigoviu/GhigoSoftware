package com.upemor.grafoponderado;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/** @author cerimice **/

@Setter
@Getter
public class Nodo implements Comparable<Nodo>{
    
    private String nombre;
    private long dato;
    private boolean visitado;
    private Etiqueta etiqueta;
    
    private List<Adyacencia> adyacencias;
    
    public Nodo(){
        nombre = "";
        dato = 0;
        visitado = false;
        etiqueta = null;
        adyacencias = new ArrayList<>();
    }
    
    public Nodo(String nombre,long dato){
        this.nombre = nombre;
        this.dato = dato;
        visitado = false;
        etiqueta = null;
        adyacencias = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public void addAdyacencias(Adyacencia ...lista){
        for(Adyacencia adyacencia:lista)
            this.adyacencias.add(adyacencia);
    }

    @Override
    public int compareTo(Nodo t){
        if(etiqueta == null) return 0;
        if(t.getEtiqueta() == null) return 0;
        if(t.getEtiqueta().getDistancia() > etiqueta.getDistancia())
            return 1;
        else
            return -1;
    }
}
