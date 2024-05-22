package com.ejemplo.alumno;

public class Principal {
    public static void main(String[] args) {
        String nombre = "Juan Perez";
        int[] calificaciones = {85, 92, 78, 88, 90};

        Alumno alumno = new Alumno(nombre, calificaciones);

        alumno.imprimirResultados();
    }
}

