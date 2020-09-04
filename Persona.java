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
public class Persona {

    int DNI;
    int Edad;
    String Nombre, Apellido;

    public Persona() {
        this.DNI = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Edad = 12;
    }

    public Persona(int DNI) {
        this();
        this.DNI = DNI;
    }

    public Persona(int DNI, String Nombre) {
        this(DNI);
        this.Nombre = Nombre;

    }

    public Persona(int DNI, String Nombre, String Apellido) {
        this(DNI, Nombre);
        this.Apellido = Apellido;
    }

    public Persona(int DNI, String Nombre, String Apellido, int Edad) {
        this(DNI, Nombre, Apellido);
        this.Edad = Edad;
    }

    ; 
    
    public void mostrar() {

        System.out.println(DNI + " " + Nombre + " " + Apellido);
    }

}
