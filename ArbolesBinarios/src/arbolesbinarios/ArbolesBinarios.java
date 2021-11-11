package arbolesbinarios;

import java.util.Scanner;

/**
 *
 * @author 
 * Rodrigo C. B.
 * cbro172663
 *
 */
public class ArbolesBinarios {

    public static void main(String[] args) {
        //TODO    
        //prueba();
        //System.out.println("Prueba de FileReader");
        GrafoPonderado grafo;
        ArbolBinario arbol;
        String ruta = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la ruta completa del archivo");
        //ruta = entrada.nextLine();
        ruta = "C:\\Users\\Vrick\\Downloads\\redEjemplo01.graph";
        try {
            grafo = Archivos.readFileTxt(ruta);  
            System.out.println("Total de nodos");
            System.out.println(grafo.getNumNodos());
            grafo.mostrarNoodosPorTipo();
            System.out.println("\nLista de adyacencias");
            for (Adyacencia adyacencia : grafo.getListaAdyacencia()) {
                System.out.println(adyacencia);
            }
            //Generar arboles
            arbol = new ArbolBinario(grafo.getListaNodos(), grafo.getListaAdyacencia());
            arbol.setNumNodos(grafo.getNumNodos());
            arbol.setMatrizAdyacencia(grafo.getMatrizAdyacencia());
            System.out.println("Ingrese la raiz del nuevo arbol generado");
            int raiz = 4;
            //raiz = entrada.nextInt();
            arbol.arbolCaminosMasCortos(raiz);
            
            
        } catch (Exception e) {
            System.out.println("Archivo main: " + e);
            e.printStackTrace();
        }
    }
    
    static void prueba(){
        Nodo nodo = new Nodo(90,"90");
        ArbolBinario arbolBinario = new ArbolBinario(nodo);
        arbolBinario.insertar(new Nodo(90,"90"));
        arbolBinario.insertar(new Nodo(45,"45"));
        arbolBinario.insertar(new Nodo(135,"135"));
        System.out.println("Los recorridos de mi árbol 1:");
        System.out.println("Recorrido en anchura izquierda: "
            +arbolBinario.recorridoAnchuraIzquierda());
        System.out.println("Recorrido en anchura derecha: "
            +arbolBinario.recorridoAnchuraDerecha());
        System.out.print("Recorrido en Preorden: ");
        arbolBinario.iniciarRecorridoProfundidadPreorden();
        System.out.print("Recorrido en Inorden: ");
        arbolBinario.iniciarRecorridoProfundidadInorden();
        System.out.print("Recorrido en Postorden: ");
        arbolBinario.iniciarRecorridoProfundidadPostorden();

        arbolBinario = new ArbolBinario();
        arbolBinario.insertar(new Nodo(12,"12"));
        arbolBinario.insertar(new Nodo(17,"17"));
        arbolBinario.insertar(new Nodo(8,"8"));
        arbolBinario.insertar(new Nodo(5,"5"));
        arbolBinario.insertar(new Nodo(9,"9"));
        arbolBinario.insertar(new Nodo(15,"15"));
        System.out.println("\n\nLos recorridos de mi árbol 2:");
        System.out.println("Recorrido en anchura izquierda: "
            +arbolBinario.recorridoAnchuraIzquierda());
        System.out.println("Recorrido en anchura derecha: "
            +arbolBinario.recorridoAnchuraDerecha());
        System.out.print("Recorrido en Preorden: ");
        arbolBinario.iniciarRecorridoProfundidadPreorden();
        System.out.print("Recorrido en Inorden: ");
        arbolBinario.iniciarRecorridoProfundidadInorden();
        System.out.print("Recorrido en Postorden: ");
        arbolBinario.iniciarRecorridoProfundidadPostorden();
    }
}
