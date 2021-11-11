package com.upemor.grafoponderado;

/** @author cerimice **/
public class Main{
    public static void main(String[] args){
        
        GrafoPonderado  grafoPonderado = new GrafoPonderado();
        
        Nodo nodo1 = new Nodo("1",1);
        Nodo nodo2 = new Nodo("2",2);
        Nodo nodo3 = new Nodo("3",3);
        Nodo nodo4 = new Nodo("4",4);
        Nodo nodo5 = new Nodo("5",5);
        Nodo nodo6 = new Nodo("6",6);
        
        nodo1.addAdyacencias(
            new Adyacencia(nodo3,5)
            //,new Adyacencia(nodo6,8)
            ,new Adyacencia(nodo2,2)
        );
        
        nodo2.addAdyacencias(
            new Adyacencia(nodo1,2)
            ,new Adyacencia(nodo4,1)
        );
        
        nodo3.addAdyacencias(
            new Adyacencia(nodo1,5)
            ,new Adyacencia(nodo5,2)
            ,new Adyacencia(nodo4,1)
        );
        
        nodo4.addAdyacencias(
            new Adyacencia(nodo2,1)
            ,new Adyacencia(nodo3,1)
            ,new Adyacencia(nodo6,5)
        );
        
        nodo5.addAdyacencias(
            new Adyacencia(nodo3,2)
            ,new Adyacencia(nodo6,1)
        );
        
        nodo6.addAdyacencias(
            new Adyacencia(nodo4,5)
            //,new Adyacencia(nodo1,8)
            ,new Adyacencia(nodo5,1)
        );
        
        grafoPonderado.addNodo(nodo1,nodo2,nodo3,nodo4,nodo5,nodo6);
        
        System.out.println("La lista de adyacencia es: "
            +grafoPonderado.getListaAdyacencia());
        
        System.out.println("Camino mas corto: "
            +grafoPonderado.getCaminoMasCorto(nodo1,nodo6));
        System.out.println("Camino mas corto: "
            +grafoPonderado.getCaminoMasCorto(nodo4,nodo3));
    }
}