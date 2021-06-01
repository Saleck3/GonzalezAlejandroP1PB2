package gonzalezAlejandroP1PB2;

public class LibroMatematica extends Libro implements Fotocopiable {

    @Override
    public String imprimir() {
	return "LibroMatematica [Código=" + getCodigo() + ", Nombre=" + getNombre() + ", Autor=" + getAutor()
		+ ", Prestado=" + getPrestado() + "]";
    }

}
