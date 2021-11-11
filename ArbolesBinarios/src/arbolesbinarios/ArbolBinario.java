package arbolesbinarios;

import java.util.*;

public class ArbolBinario{
    //Atributos
    private Nodo raiz;
    private int numNodos;
    private ArrayList<Nodo> listaNodos;
    private ArrayList<Adyacencia> listaAdyacencia;
    private int matrizAdyacencia[][];

    
    //Métodos
    public ArbolBinario(){
        raiz = null;
    }
    
    public ArbolBinario(Nodo nodo){
        raiz = nodo;
    }

    public ArbolBinario(ArrayList<Nodo> listaNodos, ArrayList<Adyacencia> listaAdyacencia) {
        this.listaNodos = listaNodos;
        this.listaAdyacencia = listaAdyacencia;
    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public void setMatrizAdyacencia(int matrizAdyacencia[][]) {
        this.matrizAdyacencia = matrizAdyacencia;
    }
    
    public int getNumNodos() {
        return numNodos;
    }

    public ArrayList<Nodo> getListaNodos() {
        return listaNodos;
    }

    public void setListaNodos(ArrayList<Nodo> listaNodos) {
        this.listaNodos = listaNodos;
    }
    
    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }
    
    
    public Nodo getRaiz() {     
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    // Métodos
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
    
    public boolean generarArbol(Nodo raiz){
        setRaiz(raiz);
        
        return true;
    }
    
    public boolean eliminar(long id){
        return false;
    }
    
    /* Recorrido */
    public String recorridoAnchuraIzquierda(){
        String recorrido = "Inicio -> ";
        //PriorityQueue<Nodo> cola = new LinkedList<>();
        //LinkedList<Nodo> cola = new LinkedList<>();
        //PriorityQueue<Nodo> cola = new PriorityQueue<Nodo>();
        Queue<Nodo> cola = new LinkedList<>();
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
        //PriorityQueue<Nodo> cola = new PriorityQueue<Nodo>();
        //LinkedList<Nodo> cola = new LinkedList<>();
        Queue<Nodo> cola = new LinkedList<>();
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
    
    public void arbolCaminosMasCortos(int inicio){
        int distancias[] = new int[this.numNodos];
        boolean visitados[] = new boolean[this.numNodos];
        //Iniciar con distancia maxima y visitas en false
        for (int i = 0; i < this.numNodos; i++) {
            distancias[i] = Integer.MAX_VALUE;
            /*if(this.listaNodos.get(i).getTipo() == 3)
                visitados[i] = true;
            else*/ 
                visitados[i] = false;
        }
        
        distancias[inicio] = 0;
        /*Imprimir matriz de adyacencias
        for (int i = 0; i < this.numNodos; i++) {
            for (int j = 0; j < this.numNodos; j++) {
                System.out.print(this.matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
        //*/
        //Buscar la ruta mas corta para cada dispositivo
        //de tipo 1 y 2
        
        int nodoProceso;
        for (int j=0; j< this.numNodos-1 ; j++) {
            //if(elemento.getTipo() != 3){
            nodoProceso = distanciaMinima(distancias, visitados);
            visitados[nodoProceso] = true;
            for (int i = 0; i < this.numNodos; i++) {
                //System.out.println("check");
                if((!visitados[i]) && (this.matrizAdyacencia[nodoProceso][i] != 0)) {
                    if (distancias[nodoProceso] != Integer.MAX_VALUE) {
                        if (distancias[nodoProceso] + this.matrizAdyacencia[nodoProceso][i] < distancias[i]) 
                            distancias[i] += this.matrizAdyacencia[nodoProceso][i];
                    }

                }
            }
            
            //}
            
        }
        
        System.out.println("Costos a los vértices tipo 2 y 3");
        for (int i = 0; i < this.numNodos; i++) {
            if (this.listaNodos.get(i).getTipo() != 3) 
            System.out.println((i+1) + " \t\t " + distancias[i]);
        }
    }
    
    private int distanciaMinima(int distancias[], boolean visitados[]){
        int minima = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < this.numNodos; i++) {
            if ( visitados[i]==false && distancias[i] <= minima) {
                minima = distancias[i];
                index = i;
            }
        }
        return index;
    }
    
}