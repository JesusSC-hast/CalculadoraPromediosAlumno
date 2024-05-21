package com.ejemplo.alumno;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Alumno con un nombre y un array de calificaciones
        String nombre = "Juan Perez";
        int[] calificaciones = {85, 92, 78, 88, 90};

        // Crear el objeto Alumno
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Imprimir los resultados
        alumno.imprimirResultados();
    }
}

