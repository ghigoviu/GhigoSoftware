package ejercicios1110;

/**
 *
 * @author 
 *  Rodrigo C. B.
 *  cbro172663 
 */
class Automata1 {
    //Atributos
    int id;
    String name;
    private char[] cinta;


    //Métodos
    public Automata1(char[] cinta){
        this.cinta = cinta;
    }
    
    public boolean estadoA(int pos){
        if (pos >= cinta.length) return true;
        
        if (cinta[pos] == '0') return estadoB(pos+1);
        if (cinta[pos] == '1') return estadoB(pos+1);
        if (cinta[pos] == '2') return estadoB(pos+1);
        
        return false;
    }
    private boolean estadoB(int pos){
        if (pos >= cinta.length) return false;
        
        if (cinta[pos] == '0') return estadoA(pos+1);
        if (cinta[pos] == '1') return estadoA(pos+1);
        if (cinta[pos] == '2') return estadoA(pos+1);
        
        return false;
    }

}
