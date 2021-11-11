package com.upemor.grafoponderado;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import lombok.Getter;

/** @author cerimice **/
public class GrafoPonderado{
    
    @Getter private List<Nodo> nodos;
    
    public GrafoPonderado(){
        nodos = new ArrayList<>();
    }
    
    public void addNodo(Nodo ...lista){
        for(Nodo nodo:lista)
            nodos.add(nodo);
    }
    
    public String getListaAdyacencia(){
        String lista = "\n";
        for(Nodo nodo:nodos){
            lista += nodo+" -> ";
            for(Adyacencia adyacencia:nodo.getAdyacencias())
                lista += adyacencia+", ";
            lista+="\n";
        }
        return lista+"\n";
    }
    
    public String getCaminoMasCorto(Nodo inicio, Nodo destino){
        
        for(Nodo nodo:nodos){
            nodo.setVisitado(false);
            nodo.setEtiqueta(null);
        }
        
        inicio.setVisitado(true);
        inicio.setEtiqueta(new Etiqueta(null,0)); /* <- Creamos etiqueta de inicio */
        PriorityQueue<Nodo> cola = new PriorityQueue<>();
        cola.add(inicio);
        
        Nodo actual;
        while(!cola.isEmpty()){
            actual = cola.poll();
            for(Adyacencia adyacencia:actual.getAdyacencias()){
                
                /* Gestión de adyacencias */
                if(!adyacencia.getNodo().isVisitado()){
                    adyacencia.getNodo().setVisitado(true);
                    cola.add(adyacencia.getNodo());
                }
                
                /* Gestión de las etiquetas */
                Etiqueta etiqueta = new Etiqueta(
                        actual
                        ,actual.getEtiqueta().getDistancia()+adyacencia.getValor()
                );
                
                if(adyacencia.getNodo().getEtiqueta() == null){
                    adyacencia.getNodo().setEtiqueta(etiqueta);
                }else{
                    if(etiqueta.getDistancia() < adyacencia.getNodo().getEtiqueta().getDistancia()){
                        adyacencia.getNodo().setEtiqueta(etiqueta);
                    }
                }
            }
        }
        
        String camino = inicio+" -> "+destino+" => Inicio -> ";
        Nodo nodo = destino;
        while(nodo != null){
            camino += nodo + " -> ";
            nodo = nodo.getEtiqueta().getNodo();
        }
        return camino+= "final = "+ destino.getEtiqueta().getDistancia();
    }
    
}
