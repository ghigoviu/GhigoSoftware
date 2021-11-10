package ejercicios1110;

/**
 *
 * @author 
 *  Rodrigo C. B.
 *  cbro172663 
 */
class Cadena{
    //Atributos
    int id;
    String dato;


    //Métodos
    public Cadena(String dato) {
        this.dato = dato;
    }
    
    boolean validarEMail(){
        //Una cadena debe llevar user@dominio.TD donde TD es tipo de dominio
        if (true) {
            
            return true;
        } else {
            System.out.println("Cadena no válida como correo electrónico");
            return false;
        }
    }
        
    boolean validarNumero(){
        
       return true;
    }
    
    boolean validarPatronA(){
        String sb = "aaa";
        if (dato.contains(sb) && (dato.contains("aa"))) {
            return dato.indexOf(sb) <= dato.indexOf("aa", (dato.indexOf(sb)+3));
        } else {
            //System.out.println("No contiene las subcadenas AAA");
            return false;
        }
    }
    
    void recorridoRecursivo(int i, int array[]) throws NullPointerException{
        System.out.print(array[i] + ", ");
        this.recorridoRecursivo(++i, array);
        //System.out.println("\nFin del array");
    }
    
    
}
