package arbolesbinarios;

import java.util.ArrayList;

/**
 *
 * @author 
 *  Rodrigo C. B.
 *  cbro172663 
 */
class GrafoPonderado {
    //Atributos
    private int id;
    private String name;
    private ArrayList<Nodo> listaNodos;
    private int numNodos;
    private int listaAdyacencia[][];

    //Métodos
    
    public GrafoPonderado(int numeroNodos) {
        this.numNodos = numeroNodos;
        listaAdyacencia = new int[numeroNodos][numeroNodos];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Nodo> getListaNodos() {
        return listaNodos;
    }

    public void setListaNodos(ArrayList<Nodo> listaNodos) {
        this.listaNodos = listaNodos;
    }

    public int[][] getListaAdyacencia() {
        return listaAdyacencia;
    }
    
    public void setListaAdyacencia(int[][] listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }
    
    public void setListaAdyacencia(String[][] listaAdyacencia) {
        try {
            for (int i = 0; i < listaAdyacencia.length; i++) 
                for (int j = 0; j < listaAdyacencia[i].length; j++) 
                    this.listaAdyacencia[i][j] = Integer.parseInt(listaAdyacencia[i][j]);
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
        
        /*
        System.out.println("Lista de adyacencia de enteros");
        for (int i = 0; i < listaAdyacencia.length - 1; i++){ 
            for (int j = 0; j < listaAdyacencia[i].length - 1; j++){
                System.out.print(this.listaAdyacencia[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
    }
    
}
