package gonzalezAlejandroP1PB2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class bibliotecaTest {
    
    @Test
    public void queSepuedaCrearUnLibroDeHistoria(){
	LibroHistoria historia = new LibroHistoria();
	assertNotNull(historia);
    }
    
    @Test
    public void queSepuedaCrearUnLibroDeGeografia(){
	LibroGeografia geografia = new LibroGeografia();
	assertNotNull(geografia);
    }
    
    @Test
    public void queSepuedaCrearUnLibroDeMatematica(){
	LibroMatematica matematica = new LibroMatematica();
	assertNotNull(matematica);
    }
    
    @Test
    public void queSePuedaCrearUnaBiblioteca(){
	Biblioteca biblioteca = new Biblioteca();
	assertNotNull(biblioteca);
    }
    
    
    @Test
    public void queSePuedaCrearUnEstudiante(){
	Estudiante estudiante = new Estudiante(12345, "Gonzalez", "Alejandro");
	assertNotNull(estudiante);
    }
    
    @Test
    public void queSePuedaAgregarYVerUnLibro(){
	
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
