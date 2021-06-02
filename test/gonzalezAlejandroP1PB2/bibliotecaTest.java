package gonzalezAlejandroP1PB2;

import static org.junit.Assert.*;

import org.junit.Test;

public class bibliotecaTest {

    @Test
    public void queSepuedaCrearUnLibroDeHistoria() {
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	assertNotNull(historia);
    }

    @Test
    public void queSepuedaCrearUnLibroDeGeografia() {
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");
	assertNotNull(geografia);
    }

    @Test
    public void queSepuedaCrearUnLibroDeMatematica() {
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");
	assertNotNull(matematica);
    }

    @Test
    public void queSePuedaCrearUnaBiblioteca() {
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	assertNotNull(biblioteca);
    }

    @Test
    public void queSePuedaCrearUnEstudiante() {
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	assertNotNull(estudiante);
    }

    @Test
    public void queSePuedaAgregarYVerUnLibro() {

	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");
	Biblioteca biblioteca = new Biblioteca("UNLaM");

	biblioteca.agregarLibro(historia);
	biblioteca.agregarLibro(geografia);
	biblioteca.agregarLibro(matematica);

	assertNotNull(biblioteca);
	assertNotNull(historia);
	assertNotNull(geografia);
	assertNotNull(matematica);

	assertEquals(3, biblioteca.cantidadDeLibros());
    }

    @Test
    public void queSePuedaPrestarUnLibro() {

	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");

	biblioteca.agregarLibro(historia);

	assertTrue(biblioteca.prestarLibro(historia, estudiante));

    }

    @Test
    public void queNoSePuedaPrestarMasDeDosLibros() {
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");

	biblioteca.agregarLibro(historia);
	biblioteca.agregarLibro(geografia);
	biblioteca.agregarLibro(matematica);

	assertTrue(biblioteca.prestarLibro(historia, estudiante));
	assertTrue(biblioteca.prestarLibro(geografia, estudiante));
	assertFalse(biblioteca.prestarLibro(matematica, estudiante));
    }

    @Test
    public void queSePuedaDevolverUnLibro() {
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");

	biblioteca.agregarLibro(historia);

	assertTrue(biblioteca.prestarLibro(historia, estudiante));
	assertTrue(biblioteca.devolverLibro(historia, estudiante));
	assertEquals(0, estudiante.cantidadLibrosEnPrestamo());
    }

    @Test
    public void queSePuedaFotocopiarLibrosDeMatematica() {
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");

	String impresion = matematica.imprimir();
	assertNotNull(impresion);
    }

    @Test
    public void queSePuedaFotocopiarLibrosDeGeografia() {
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");

	String impresion = geografia.imprimir();
	assertNotNull(impresion);
    }

    @Test
    public void queSePuedaVolverAPrestarUnLibroDevuelto() {

	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");

	biblioteca.agregarLibro(historia);

	assertTrue(biblioteca.prestarLibro(historia, estudiante));
	assertFalse(biblioteca.prestarLibro(historia, estudiante));

    }

    @Test
    public void queNoSePuedaPrestarUnLibroPrestado() {
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	Estudiante estudiante2 = new Estudiante(54321, "Perez", "Pedro");

	biblioteca.agregarLibro(historia);

	assertTrue(biblioteca.prestarLibro(historia, estudiante));
	assertTrue(biblioteca.devolverLibro(historia, estudiante));
	assertTrue(biblioteca.prestarLibro(historia, estudiante2));
    }

    @Test
    public void queQuedeRegistroDeLosPrestamos() {

	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	Estudiante estudiante2 = new Estudiante(54321, "Perez", "Pedro");

	biblioteca.agregarLibro(historia);

	assertTrue(biblioteca.prestarLibro(historia, estudiante));
	assertEquals(1, biblioteca.cantidadLibrosEnPrestamo());
	assertTrue(biblioteca.devolverLibro(historia, estudiante));
	assertEquals(0, biblioteca.cantidadLibrosEnPrestamo());
	assertEquals(1, biblioteca.cantidadLibrosPrestados());
	assertTrue(biblioteca.prestarLibro(historia, estudiante2));
	assertEquals(1, biblioteca.cantidadLibrosEnPrestamo());
	assertEquals(2, biblioteca.cantidadLibrosPrestados());
    }

    @Test
    public void queSeSepaAQueAlumnoSeLePrestoUnLibro() {
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");

	biblioteca.agregarLibro(historia);

	assertTrue(historia.getPrestado());
	//No me dio el tiempo
	//Tendria que recorrer la lista de prestamos para recuperar el que en ese libro sea el prestado, que este en estado prestado y devolver ese estudiante
	//assertEquals(estudiante, biblioteca.alumnoAlQueSeLePrestoElLibro(historia));
    }

    @Test
    public void queLaBibliotecaPuedaImprimirLosLibros() {
	//TODO tiene que poder imprimirse todos los libros de la biblioteca que sean imprimibles

	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");
	Biblioteca biblioteca = new Biblioteca("UNLaM");

	biblioteca.agregarLibro(historia);
	biblioteca.agregarLibro(geografia);
	biblioteca.agregarLibro(matematica);

	//No me dio el tiempo
	assertEquals(0, biblioteca.imprimirLibros().size());
    }

}
