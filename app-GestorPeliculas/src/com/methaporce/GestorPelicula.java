package com.methaporce;

import com.methaporce.model.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class GestorPelicula implements GestorPeliculaI {

    Pelicula pelicula1= new Pelicula(1,"Cars",true);
    Pelicula pelicula2= new Pelicula(2,"Harry Potter",false);
    Pelicula pelicula3 =new Pelicula(3,"Toy Story",true);
    Pelicula pelicula4 = new Pelicula(4,"Dune",true);
    Pelicula pelicula5 = new Pelicula(5,"Up",false);
    List<Pelicula> peliculas = new ArrayList<>();
    List<Pelicula> peliculasDisponibles = new ArrayList<>();

//2.1 Agregar Pelicula
    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        peliculas.add(pelicula5);
        peliculas.add(pelicula);

    }
// Obtener Pelicula
    @Override
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }



    @Override
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    @Override
    public void marcarPeliculaDisponible(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }

    //Eliminar Pelicula
    @Override
    public void eliminarPelicula(int id) {
        this.peliculas.removeIf(elim -> elim.getId() == id);
    }
// Obtener Pelicula Disponible
    @Override
    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> peliculasDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDisponible()) {
                peliculasDisponibles.add(pelicula);
            }
        }
        return peliculasDisponibles;
    }
}
