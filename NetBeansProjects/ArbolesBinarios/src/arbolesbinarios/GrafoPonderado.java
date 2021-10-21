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
    private int matrizAdyacencia[][];
    private ArrayList<Adyacencia> listaAdyacencia;

    //Métodos
    
    public GrafoPonderado(int numeroNodos) {
        this.numNodos = numeroNodos;
        matrizAdyacencia = new int[numeroNodos][numeroNodos];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumNodos() {
        return numNodos;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    public ArrayList<Adyacencia> getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void setListaAdyacencia(ArrayList<Adyacencia> listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
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

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }
    
    public void setMatrizAdyacencia(int[][] listaAdyacencia) {
        this.matrizAdyacencia = listaAdyacencia;
    }
    
    public void setMatrizAdyacencia(String[][] listaAdyacencia) {
        try {
            for (int i = 0; i < listaAdyacencia.length; i++) 
                for (int j = 0; j < listaAdyacencia[i].length; j++) 
                    this.matrizAdyacencia[i][j] = Integer.parseInt(listaAdyacencia[i][j]);
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
        
        //Crear la lista de adyacencia
        this.listaAdyacencia = new ArrayList<Adyacencia>();
        Adyacencia nueva;
        for (int i = 0; i < this.numNodos; i++) {
            for (int j = 0; j < this.numNodos; j++) {
                if (matrizAdyacencia[i][j] != 0) {
                    nueva = new Adyacencia(this.matrizAdyacencia[i][j],
                        listaNodos.get(i), listaNodos.get(j));
                    this.listaAdyacencia.add(nueva);
                }
                
            }
            
        }
        //Probar lista de adyacencias
        /*
        System.out.println("Probando lista de adyacencia");
        for (Adyacencia adyacencia : this.listaAdyacencia) {
            System.out.println(adyacencia.toString());
        }
        */  
    }
    
    public void mostrarNoodosPorTipo(){
        System.out.println("Nodos tipo 1, Routers");
        for (Nodo elemento : this.listaNodos) {
            if (elemento.getTipo() == 1) {
                System.out.println(elemento.toString());
            }
        }
        System.out.println("Nodos tipo 2, Switch");
        for (Nodo elemento : this.listaNodos) {
            if (elemento.getTipo() == 2) {
                System.out.println(elemento.toString());
            }
        }
        System.out.println("Nodos tipo 3, Hosts");
        for (Nodo elemento : this.listaNodos) {
            if (elemento.getTipo() == 3) {
                System.out.println(elemento.toString());
            }
        }
    }
}
