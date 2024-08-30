package com.methaporce.vista;

import com.methaporce.GestorPelicula;
import com.methaporce.model.Pelicula;

public class Main {
    public static void main(String[] args) {

        GestorPelicula gestor = new GestorPelicula();

        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula(1, "Cars", false);
        Pelicula pelicula2 = new Pelicula(2, "Harry Potter", false);
        Pelicula pelicula3 = new Pelicula(3, "Toy Story", true);
        Pelicula pelicula4 = new Pelicula(4, "Dune", true);
        Pelicula pelicula5 = new Pelicula(5, "Up", false);

        // Agregar películas al gestor
        gestor.agregarPelicula(pelicula1);
        gestor.agregarPelicula(pelicula2);
        gestor.agregarPelicula(pelicula3);
        gestor.agregarPelicula(pelicula4);
        gestor.agregarPelicula(pelicula5);

        // 3.1 Eliminar una película
        gestor.eliminarPelicula(2);  // Eliminar Harry Potter
        System.out.println("Después de eliminar Harry Potter: " + gestor.obtenerPeliculas());

        // 3.2 Marcar una película como activa
        gestor.marcarPeliculaDisponible(5);  // Marcar Up como disponible
        System.out.println("Después de marcar Up como disponible: " + gestor.obtenerPeliculas());

        // 3.3 Mostrar la lista de películas no disponibles
        System.out.println("Películas no disponibles: " + gestor.obtenerPeliculasNoDisponibles());
    }
}
