package arbolesbinarios;

/** @author cerimice **/

public class Nodo{
    
    private int id;
    private int tipo;
    private String nombre;
    
    private Nodo izquierdo;
    private Nodo derecho;
    
    private int caminoDerecho;
    private int caminoIzquierdo;
    
    public Nodo(){
        id = 0;
        nombre = "";
        izquierdo = null;
        derecho = null;
    }
    
    public Nodo(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
        izquierdo = null;
        derecho = null;
    }
    
    @Override
    public String toString(){
        return ("ID: " + this.id  + " nombre: " + this.nombre + " tipo: " 
                + this.tipo + "\t");
    }

    public int getCaminoDerecho() {
        return caminoDerecho;
    }

    public void setCaminoDerecho(int caminoDerecho) {
        this.caminoDerecho = caminoDerecho;
    }

    public int getCaminoIzquierdo() {
        return caminoIzquierdo;
    }

    public void setCaminoIzquierdo(int caminoIzquierdo) {
        this.caminoIzquierdo = caminoIzquierdo;
    }
    
    public long getId() {
        return id;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    
    
}
