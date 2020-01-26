
package arbol1;
//Luis Gerardo Pacheco Castañeda
//Jovana Piña González
public class Arbol1 {

    public static void main(String[] args) {
    ArbolBinario abo=new ArbolBinario ();
        abo.insertar (1);
        abo.insertar (2);
        abo.insertar (3);
        abo.insertar (4);
        abo.insertar (5);
        abo.insertar (6);
        abo.insertar (7);
        abo.insertar (8);
        abo.insertar (9);
        abo.insertar (10);
        System.out.println ("Impresion preorden");
        abo.imprimirPre();
        System.out.println ("Impresion entreorden");
        abo.imprimirEntre();
        System.out.println ("Impresion postorden");
        abo.imprimirPost();
        
    }
    public static void print(String numero){
        System.out.print(numero);
        
    }
    
}
