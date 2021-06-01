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
    
    

}
