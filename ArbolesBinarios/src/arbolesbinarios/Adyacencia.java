package arbolesbinarios;

/**
 *
 * @author 
 *  Rodrigo C. B.
 *  cbro172663 
 */
class Adyacencia {
    //Atributos
    private int id;
    private String name;
    private int valor;
    private Nodo desde;
    private Nodo hasta;

    //Métodos
    public Adyacencia(int valor, Nodo desde, Nodo hasta) {
        this.valor = valor;
        this.desde = desde;
        this.hasta = hasta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDesde() {
        return desde;
    }

    public void setDesde(Nodo desde) {
        this.desde = desde;
    }

    public Nodo getHasta() {
        return hasta;
    }

    public void setHasta(Nodo hasta) {
        this.hasta = hasta;
    }

    @Override
    public String toString() {
        return "Desde: " + desde + " hasta: " + hasta + "; Valor: " + valor;
    }
    
}
