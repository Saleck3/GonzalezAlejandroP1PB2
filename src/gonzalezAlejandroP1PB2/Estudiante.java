package gonzalezAlejandroP1PB2;

import java.util.ArrayList;

public class Estudiante {

    private Integer dni;
    private String apellido;
    private String nombre;
    private ArrayList<Libro> librosQueTiene = new ArrayList<Libro>();

    public Estudiante(Integer dni, String apellido, String nombre) {
	this.dni = dni;
	this.apellido = apellido;
	this.nombre = nombre;
    }

    @Override
    public String toString() {
	return "Estudiante [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + "]";
    }

    public Integer getDni() {
	return dni;
    }

    public void setDni(Integer dni) {
	this.dni = dni;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public boolean asignarLibro(Libro libro) {

	if (librosQueTiene.size() < 2 && !libro.getPrestado()) {
	    libro.setPrestado(Boolean.TRUE);
	    librosQueTiene.add(libro);
	    return true;
	}

	return false;
    }

    public int cantidadLibrosEnPrestamo() {
	return librosQueTiene.size();
    }

    public boolean desasignarLibro(Libro libro) {

	int indexLibro = librosQueTiene.indexOf(libro);

	if (indexLibro == -1)
	    return Boolean.FALSE;

	librosQueTiene.remove(indexLibro);
	libro.setPrestado(Boolean.FALSE);
	return Boolean.TRUE;

    }

}
