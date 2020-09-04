/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfp36emisantconstructor;

/**
 *
 * @author emi
 */
public class CFP36EmiSantConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creo objeto persona
        Persona P1, P2, P3, P4, P5;

        P1 = new Persona();
        P2 = new Persona(33557788);
        P3 = new Persona(31258963, "Jorge");
        P4 = new Persona(15948726, "Alan", "Vazquez");
        P5 = new Persona(66998877, "Roberto", "Gomez", 36);
        
        // muestro en pantalla
        P1.mostrar();
        P2.mostrar();
        P3.mostrar();
        P4.mostrar();
        P5.mostrar();
    }

}
