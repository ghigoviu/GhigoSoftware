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
        
        char[] cadena1 = {'0','1','2','1','2','1'};
        
        System.out.println(6%5);
        
        Automata1 ins1 = new Automata1(cadena1);
        ins1.name = "Cadena1";
        System.out.println(ins1.name + " es válida: " + ins1.estadoA(0));
        
        char[] cadena2 = {};
        char[] cadena3 = {'0','0','0','0'};
        char[] cadena4 = {'0','0','0','0','0'};
        Automata2 ins2 = new Automata2(cadena2);
        Automata2 ins3 = new Automata2(cadena3);
        Automata2 ins4 = new Automata2(cadena4);
        ins2.name = "Cadena2";
        ins3.name = "Cadena3";
        ins4.name = "Cadena4";
        
        System.out.println(ins2.name + " es válida: " + ins2.estadoA(0));
        System.out.println(ins3.name + " es válida: " + ins3.estadoA(0));
        System.out.println(ins4.name + " es válida: " + ins4.estadoA(0));
        
        
        /*
        String ejemplo = "Este es aa un  ejemplo";
        
        int array[] = {1,2,3,4,5,6,7,8,9};
        
        Cadena ex = new Cadena(ejemplo);
        try {
            ex.recorridoRecursivo(0, array);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nFin del arreglo");
        }
        
        
        /*
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
        */
    }
    
}
