package com.mycompany.estudiantes;

/**
 *
 * @author hiram
 */
public class Alumno {
    public String matricula;
    public String nombre;
    public int edad;

    public Alumno(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return "Matricula: " + matricula + " Nombre: " + nombre + " Edad: " + edad;
    }
}
