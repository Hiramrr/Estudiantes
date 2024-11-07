package com.mycompany.estudiantes;

/**
 * Clase que representa a un alumno
 * @author hiram,michell, jorge
 */
public class Alumno {
    public String matricula;
    public String nombre;
    public int edad;

    /**
     * Constructor de la clase
     * @param matricula
     * @param nombre
     * @param edad
     */
    public Alumno(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }
    /*
    * Getters y Setters
     */
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
    /**
     * Metodo que regresa la informacion del alumno
     * @return
     */
    public String toString(){
        return "Matricula: " + matricula + " Nombre: " + nombre + " Edad: " + edad;
    }
}
