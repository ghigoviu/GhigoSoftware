package arbolesbinarios;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/** @author cerimice **/
public class ArbolBinario{

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    private Nodo raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    public ArbolBinario(Nodo nodo){
        raiz = nodo;
    }
    
    /* Operaciones */
    public boolean insertar(Nodo nodo){
        
        /* 1. La raiz es nula */
        if(raiz == null){
            raiz = nodo;
            return true;
        }
        
        Nodo auxiliar = raiz;
        while(true){
            if(auxiliar.getId() == nodo.getId()){
                System.out.println("El nodo ya se encuentra...");
                return false;
            }
            
            /* 2. Se va insertar por la izquierda */
            if(nodo.getId() < auxiliar.getId()){
                if(auxiliar.getIzquierdo() == null){
                    auxiliar.setIzquierdo(nodo);
                    return true;
                }
                auxiliar = auxiliar.getIzquierdo();
            }else{
                if(auxiliar.getDerecho() == null){
                    auxiliar.setDerecho(nodo);
                    return true;
                }
                auxiliar = auxiliar.getDerecho();
            }
        }
    }
    
    public boolean eliminar(long id){
        return false;
    }
    
    /* Recorrido */
    public String recorridoAnchuraIzquierda(){
        String recorrido = "Inicio -> ";
        PriorityQueue<Nodo> cola = new LinkedList<>();
            cola.add(raiz);
        Nodo actual;
        while(!cola.isEmpty()){
            actual = cola.poll();
            recorrido += actual+" -> ";
            if(actual.getIzquierdo() != null) cola.add(actual.getIzquierdo());
            if(actual.getDerecho()!= null) cola.add(actual.getDerecho());
        }
        return recorrido+ " Fin";
    }
    
    public String recorridoAnchuraDerecha(){
        String recorrido = "Inicio -> ";
        Queue<Nodo> cola = new LinkedList<Nodo>();
            cola.add(raiz);
        Nodo actual;
        while(!cola.isEmpty()){
            actual = cola.poll();
            recorrido += actual+" -> ";
            if(actual.getDerecho()!= null) cola.add(actual.getDerecho());
            if(actual.getIzquierdo() != null) cola.add(actual.getIzquierdo());
        }
        return recorrido+ " Fin";
    }
    
    public void iniciarRecorridoProfundidadPreorden(){
        System.out.print("Inicio -> ");
        recorridoProfundidadPreorden(raiz);
        System.out.print("Fin\n");
    }
    private void recorridoProfundidadPreorden(Nodo nodo){
        if(nodo == null){return;}
        System.out.print(nodo+" -> ");
        recorridoProfundidadPreorden(nodo.getIzquierdo());
        recorridoProfundidadPreorden(nodo.getDerecho());
    }
    
    public void iniciarRecorridoProfundidadInorden(){
        System.out.print("Inicio -> ");
        recorridoProfundidadInorden(raiz);
        System.out.print("Fin\n");
    }
    private void recorridoProfundidadInorden(Nodo nodo){
        if(nodo == null){return;}
        recorridoProfundidadInorden(nodo.getIzquierdo());
        System.out.print(nodo+" -> ");
        recorridoProfundidadInorden(nodo.getDerecho());
    }
    
    public void iniciarRecorridoProfundidadPostorden(){
        System.out.print("Inicio -> ");
        recorridoProfundidadPostorden(raiz);
        System.out.print("Fin\n");
    }
    private void recorridoProfundidadPostorden(Nodo nodo){
        if(nodo == null){return;}
        recorridoProfundidadPostorden(nodo.getIzquierdo());
        recorridoProfundidadPostorden(nodo.getDerecho());
        System.out.print(nodo+" -> ");
    }
}