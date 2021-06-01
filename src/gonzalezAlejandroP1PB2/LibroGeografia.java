package gonzalezAlejandroP1PB2;

public class LibroGeografia extends Libro implements Fotocopiable {

    @Override
    public String imprimir() {
	return "LibroGeografia [Código=" + getCodigo() + ", Nombre="
		+ getNombre() + ", Autor=" + getAutor() + ", Prestado=" + getPrestado() + "]";
    }

}
