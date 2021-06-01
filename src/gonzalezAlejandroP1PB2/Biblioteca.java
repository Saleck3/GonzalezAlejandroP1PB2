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
    
   
    
    
}
