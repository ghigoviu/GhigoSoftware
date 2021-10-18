package arbolesbinarios;

/**
 *
 * @author 
 *  Rodrigo C. B.
 *  cbro172663 
 */ 
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivos {
    //Atributos
    
    //Métodos
    static void crearDir(String ruta){
        String nuevaCarpeta = "DirectorioNuevo";
        File directorio = new File("C:\\" + ruta + "\\" +nuevaCarpeta);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        else
            System.out.println( nuevaCarpeta + " ya existe.");
    }
    
    //Otros métoodos de archivos de texto plano
    static void revisarRuta(String carpeta){
        File arch = new File("C:\\" + carpeta);
            if (arch.exists()){
                if (arch.isDirectory()){
                    System.out.println("Contenido de carpeta C\\" + carpeta) ;
                    String arr[]= arch.list();
                    for(int j = 1; j < arr.length; j++){
                        File otro = new File("C:\\" + carpeta + "\\"+arr[j]);
                        if (otro.isDirectory())
                            System.out .println(arr[j]+" <DIR>");
                        else
                            System.out.println(arr[j]);
                    }
                }else
                   System.out .println("No es un directorio");
            }else
                System.out.println("No existe");
        
    }
    
    static void borrarArchivo(String carpeta, String delete){
        File arch = new File("C:\\" + carpeta);
        boolean resultado = false;
        String error = "\nArchivo no eliminado.\n";
            if (arch.exists()){
                if (arch.isDirectory()){
                    System.out.println("Contenido de carpeta C\\" + carpeta) ;
                    String arr[]= arch.list();
                    for(int j = 1; j < arr.length; j++){
                        File otro = new File("C:\\" + carpeta + "\\"+arr[j]);
                        if (otro.isDirectory())
                            System.out .println(arr[j]+" <DIR>");
                        else{
                            System.out.println(arr[j]);
                            if(arr[j].equals(delete)){
                                resultado = otro.delete();
                                if(resultado == true)
                                    System.out.println("\nArchivo eliminado\n");
                                else
               
                       System.out.println(error);
                            }
                        }
                    }
                    if(!resultado)
                        System.out.println("Archivo no encontrado. " + error);
                }else
                   System.out .println("No es un directorio. " + error);
            }else
                System.out.println("No existe. " + error); 
    }
    
    static void inputFileTxt(String nameFile, String carpeta, String[] data){
        //revisarRuta(carpeta);
        File nuevo = new File("C:\\" + carpeta + "\\" + nameFile);
        DataOutputStream archivo = null;
        try{
            archivo = new DataOutputStream(new FileOutputStream(nuevo,true));
            for(int i=0;i<data.length; i++){
                System.out.println("Escribiendo con UTF y Chars");
                archivo.writeChars("\n");
                archivo.writeUTF(data[i]);
                System.out.println((i+1) + " datos ingresados");
            }
            archivo.close();
        }catch (IOException ex){
            //Mensaje de error
            System.out.println(ex.toString());
        }
    }
    
    static void inputFileTxt(String nameFile, String carpeta, String args) {     
        Scanner sc = new Scanner(System.in);
        String cadena;
        try{
            PrintWriter salida = new PrintWriter("c:/ficheros/datos.txt");  //try with resources                
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {                                                             
                salida.println(args);
                cadena = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
    }
    
    static void readFileTxt() throws IOException{
        String ruta = "C:\\Users\\Vrick\\Downloads\\redEjemplo01.graph";
        FileReader nuevo = new FileReader(ruta);
        BufferedReader br = new BufferedReader(nuevo);
        String s;
        while((s = br.readLine()) != null)
            System.out.println(s);
        nuevo.close();
    }
    
    static GrafoPonderado readFileTxt(String ruta) throws IOException{
        ruta = "C:\\Users\\Vrick\\Downloads\\redEjemplo01.graph";
        String s = "";
        readFileTxt();
        ArrayList<Nodo> listaNodos;
        int c;
        int numNodos = 0;
        int lineas = 0;
        String adyacencias[][];
        String numero;
        char digito;
        try (PushbackReader nuevo = new PushbackReader(new FileReader(ruta))) {
            listaNodos = new ArrayList<Nodo>();
            while((c = nuevo.read()) != -1){
                //Leer la primera línea con los los elementos, contar y obtener nodos.
                if(c == '('){
                    Nodo nodo = new Nodo();
                    //String id = "";
                    char d = (char)nuevo.read();
                    String id = Character.toString(d);
                    //System.out.println("check1 " + id);
                    d = (char)nuevo.read();
                    while( d != 44){
                        id += Character.toString(d);
                        d = (char)nuevo.read();
                    }
                    //System.out.println("check " + id);
                    nodo.setId(Integer.parseInt(id));
                    char tipo = (char)nuevo.read();
                    char nume = (char)nuevo.read();
                    String name = Character.toString(tipo) + Character.toString(nume);
                    nodo.setNombre(name);
                    int comma = nuevo.read();
                    //char type = (char)nuevo.read();
                    int type = nuevo.read();
                    nodo.setTipo(type-48);
                    listaNodos.add(nodo);
                    numNodos++;
                }
                else if(c == ';'){
                    //Según el número de nodos, crear un array int[n][n].
                    //Almacenar en cada fila los valores obtenidos, omitiendo las comas.
                    //Imprimir matriz para probar.
                    adyacencias = new String[numNodos][numNodos];
                    int j;
                    //Leer matriz
                    c = nuevo.read();
                    for (int i = 0; i < numNodos; i++) {
                        j = 0;
                        //Leer línea
                        do{
                            c = nuevo.read();
                            if(((c>=48)&&(c<=57))){
                                //Leer numero
                                numero = "";
                                while(c > 44){
                                    digito = (char)c;
                                    numero += Character.toString(digito);
                                    c = nuevo.read();
                                }
                                adyacencias[i][j++] = numero;
                            } else if(c == -1)
                                break;
                        }while((c!=10));
                    }
                    System.out.println("Lista de adyacencias");
                    for(int i=0; i<12; i++){
                        for( j=0; j<12; j++)
                            System.out.print(adyacencias[i][j] + ", ");
                        System.out.println("");
                    }
                    GrafoPonderado grafo = new GrafoPonderado(numNodos);
                    grafo.setListaNodos(listaNodos);
                    grafo.setListaAdyacencia(adyacencias);
                    return grafo;
                }
            }
        }
            System.out.println("Hay " + numNodos + " nodos en total");
            System.out.println("Lista de nodos");
            for(Nodo elemento:listaNodos){
                System.out.println(elemento.toString());
            }
            
            /*
            listaNodos.setNumNodos(numNodos);
            System.out.println("Recorrido por la derecha");
            System.out.println(listaNodos.recorridoAnchuraDerecha());
            System.out.println("Recorrido por la izquierda");
            System.out.println(listaNodos.recorridoAnchuraIzquierda());
            System.out.println(s);
            */
        return null;
    }
    
}