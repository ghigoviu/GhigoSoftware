package ejercicios1110;

/**
 *
 * @author 
 *  Rodrigo C. B.
 *  cbro172663 
 */
class Automata2 {
    //Atributos
    int id;
    String name;
    private char cinta[];


    //Métodos
    public Automata2(char[] cinta) {
        this.cinta = cinta;
    }
    
    public boolean estadoA(int pos){
        if (pos >= cinta.length) return false;
        
        if (cinta[pos] == '0') return estadoB(pos+1);
        if (cinta[pos] == '1') return estadoC(pos+1);
        
        return false;
    }
    
    public boolean estadoB(int pos){
        if (pos >= cinta.length) return false;
        
        if (cinta[pos] == '0') return estadoD(pos+1);
        if (cinta[pos] == '1') return estadoC(pos+1);
        
        return false;
    }
    
    public boolean estadoC(int pos){
        if (pos >= cinta.length) return false;
        
        if (cinta[pos] == '0') return estadoC(pos+1);
        if (cinta[pos] == '1') return estadoC(pos+1);
        
        return false;
    }
    
    public boolean estadoD(int pos){
        if (pos >= cinta.length) return true;
        
        if (cinta[pos] == '0') return estadoB(pos+1);
        if (cinta[pos] == '1') return estadoC(pos+1);
        
        return false;
    }

}
