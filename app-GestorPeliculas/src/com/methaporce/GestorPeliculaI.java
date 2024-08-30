package com.methaporce;

import com.methaporce.model.Pelicula;

import java.util.ArrayList;
import java.util.List;

public interface GestorPeliculaI {

    void agregarPelicula(Pelicula pelicula);
    List<Pelicula> obtenerPeliculas();



    List<Pelicula> obtenerPeliculasDisponibles();
    List<Pelicula> obtenerPeliculasNoDisponibles();
    void marcarPeliculaDisponible(int id);

    void  eliminarPelicula(int id);





}
