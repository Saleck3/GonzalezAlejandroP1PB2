package gonzalezAlejandroP1PB2;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<Libro>();
    private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
    private String nombre;

    public Biblioteca(String nombre) {
	this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
	return libros;
    }

    public ArrayList<Prestamo> getPrestamos() {
	return prestamos;
    }

    public String getNombre() {
	return nombre;
    }

    public void agregarLibro(Libro libro) {

	libros.add(libro);

    }

    public int cantidadDeLibros() {
	return libros.size();
    }

    public boolean prestarLibro(Libro libro, Estudiante estudiante) {

	if (estudiante.asignarLibro(libro)) {
	    Prestamo prestamo = new Prestamo(libro, estudiante, prestamos.size());
	    prestamos.add(prestamo);
	    return true;
	}

	return false;
    }

    public boolean devolverLibro(Libro libro, Estudiante estudiante) {

	if (!libro.getPrestado())
	    return false;
	if (estudiante.cantidadLibrosEnPrestamo() == 0)
	    return false;
	if (!estudiante.desasignarLibro(libro))
	    return false;
	
	//Me aseguro que el prestamo diga que fue devuelto, solo para el registro
	for (Prestamo prestamo : prestamos) {
	    if(!prestamo.getDevuelto()) {
		if (prestamo.getLibro() == libro) {
		    if (prestamo.getEstudiante() == estudiante) {
			return prestamo.devolverLibro();
		    }
		}
	    }
	}
	
	return true;
    }

    public int cantidadLibrosEnPrestamo() {
	
	int cantidadEnPrestamo = 0;
	
	for (Prestamo prestamo : prestamos) {
	    if(!prestamo.getDevuelto())
		cantidadEnPrestamo++;
	}
	
	return cantidadEnPrestamo;
    }

    public int cantidadLibrosPrestados() {
	return prestamos.size();
    }

}
