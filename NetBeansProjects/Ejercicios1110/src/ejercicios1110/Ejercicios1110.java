package ejercicios1110;

/**
 *
 * @author 
 * Rodrigo C. B.
 * cbro172663
 *
 */
public class Ejercicios1110 {

    public static void main(String[] args) {
        String ejemplo = "Este es aa un  ejemplo";
        
        Cadena ex = new Cadena(ejemplo);
        Cadena e1 = new Cadena("baaabaab");
        Cadena e2 = new Cadena("aaabaa");
        Cadena e3 = new Cadena("bbaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaa");
        Cadena e4 = new Cadena("aaaaa");
        Cadena e5 = new Cadena("bbbbbbbbbbbaaabbbbbbbbb");
        Cadena e6 = new Cadena("bbbabaabaaababaa");
        
        //System.out.println(ex.validarPatronA());
        System.out.println(e1.validarPatronA());
        System.out.println(e2.validarPatronA());
        System.out.println(e3.validarPatronA());
        System.out.println(e4.validarPatronA());
        System.out.println(e5.validarPatronA());
        System.out.println(e6.validarPatronA());
        
        
        
    }

}
