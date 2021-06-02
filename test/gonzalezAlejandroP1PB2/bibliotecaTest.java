package gonzalezAlejandroP1PB2;

import static org.junit.Assert.*;


import org.junit.Test;

public class bibliotecaTest {
    
    @Test
    public void queSepuedaCrearUnLibroDeHistoria(){
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	assertNotNull(historia);
    }
    
    @Test
    public void queSepuedaCrearUnLibroDeGeografia(){
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");
	assertNotNull(geografia);
    }
    
    @Test
    public void queSepuedaCrearUnLibroDeMatematica(){
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");
	assertNotNull(matematica);
    }
    
    @Test
    public void queSePuedaCrearUnaBiblioteca(){
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	assertNotNull(biblioteca);
    }
    
    
    @Test
    public void queSePuedaCrearUnEstudiante(){
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	assertNotNull(estudiante);
    }
    
    @Test
    public void queSePuedaAgregarYVerUnLibro(){
	
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
	
	assertEquals(3,biblioteca.cantidadDeLibros());
    }
    
    @Test
    public void queSePuedaPrestarUnLibro(){
	
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	
	biblioteca.agregarLibro(historia);
	
	assertTrue(biblioteca.prestarLibro(historia,estudiante));
	
    }
    
    @Test
    public void queNoSePuedaPrestarMasDeDosLibros(){
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	LibroGeografia geografia = new LibroGeografia(2, "geografia 1", "Autor de geografia");
	LibroMatematica matematica = new LibroMatematica(3, "matematica 1", "Autor de matematica");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	
	biblioteca.agregarLibro(historia);
	biblioteca.agregarLibro(geografia);
	biblioteca.agregarLibro(matematica);
	
	assertTrue(biblioteca.prestarLibro(historia,estudiante));
	assertTrue(biblioteca.prestarLibro(geografia,estudiante));
	assertFalse(biblioteca.prestarLibro(matematica,estudiante));
    }
    
    @Test
    public void queSePuedaDevolverUnLibro(){
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	
	biblioteca.agregarLibro(historia);
	
	assertTrue(biblioteca.prestarLibro(historia,estudiante));
	assertTrue(biblioteca.devolverLibro(historia,estudiante));
	assertEquals(0, estudiante.cantidadLibrosEnPrestamo());
    }
    
    @Test
    public void queSePuedaFotocopiarLibrosDeHistoria(){
	
    }
    
    @Test
    public void queSePuedaFotocopiarLibrosDeGeografia(){
	
    }
    
    @Test
    public void queSeVolverAPrestarUnLibroDevuelto(){
	
    }
    
    @Test
    public void queNoSePuedaPrestarUnLibroPrestado(){
	
    }
    
    @Test
    public void queQuedeRegistroDeLosPrestamos(){
	LibroHistoria historia = new LibroHistoria(1, "historia 1", "Autor de historia");
	Biblioteca biblioteca = new Biblioteca("UNLaM");
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	
	biblioteca.agregarLibro(historia);
	
	assertTrue(biblioteca.prestarLibro(historia,estudiante));
	assertEquals(1, biblioteca.cantidadLibrosEnPrestamo());
	assertTrue(biblioteca.devolverLibro(historia,estudiante));
	assertEquals(0, biblioteca.cantidadLibrosEnPrestamo());
	assertEquals(1, biblioteca.cantidadLibrosPrestados());
    }
    
    @Test
    public void queSeSepaAQueAlumnoSeLePrestoUnLibro(){
	
    }
    
    @Test
    public void queLaBibliotecaPuedaImprimirLosLibros(){
	//TODO tiene que poder imprimirse todos los libros de la biblioteca que sean imprimibles
    }

}
