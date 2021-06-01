package gonzalezAlejandroP1PB2;

public class LibroGeografia extends Libro implements Fotocopiable {

    public LibroGeografia(Integer codigo, String nombre, String autor) {
	super(codigo, nombre, autor);
	// TODO Auto-generated constructor stub
    }

    @Override
    public String imprimir() {
	return "LibroGeografia [Código=" + getCodigo() + ", Nombre="
		+ getNombre() + ", Autor=" + getAutor() + ", Prestado=" + getPrestado() + "]";
    }

}
