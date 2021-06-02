package gonzalezAlejandroP1PB2;

public class LibroMatematica extends Libro implements Fotocopiable {

    public LibroMatematica(Integer codigo, String nombre, String autor) {
	super(codigo, nombre, autor);
	// TODO Auto-generated constructor stub
    }

    @Override
    public String imprimir() {
	return "LibroMatematica [Código=" + getCodigo() + ", Nombre=" + getNombre() + ", Autor=" + getAutor()
		+ ", Prestado=" + getPrestado() + "]";
    }
    
    @Override
    public String clase() {
	// TODO Auto-generated method stub
	return "Matematica";
    }
}
