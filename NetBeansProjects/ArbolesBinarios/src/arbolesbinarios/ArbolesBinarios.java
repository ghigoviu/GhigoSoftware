package arbolesbinarios;

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
        System.out.println("Prueba de FileReader");
        try {
            Archivos.readFileTxt("");
        } catch (Exception e) {
            System.out.println(e);
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
