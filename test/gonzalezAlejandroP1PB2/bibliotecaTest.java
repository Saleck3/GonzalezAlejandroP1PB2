package gonzalezAlejandroP1PB2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	
	
    }
    
    @Test
    public void queNoSePuedaPrestarMasDeDosLibros(){
	
    }
    
    @Test
    public void queSePuedaDevolverUnLibro(){
	
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
	
    }
    
    @Test
    public void queSeSepaAQueAlumnoSeLePrestoUnLibro(){
	
    }
    
    @Test
    public void queLaBibliotecaPuedaImprimirLosLibros(){
	//TODO Asegurarse que sea un toString lo que pide el enunciado
    }

}
