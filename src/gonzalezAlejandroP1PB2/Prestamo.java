package gonzalezAlejandroP1PB2;

public class Prestamo {

    private Libro libro;
    private Estudiante estudiante;
    private Integer identificador;
    private Boolean devuelto;

    public Prestamo(Libro libro, Estudiante estudiante, Integer identificador) {
	this.estudiante = estudiante;
	this.libro = libro;
	this.identificador = identificador;
	this.devuelto = Boolean.FALSE;
    }

    public Boolean devolverLibro() {

	if (this.devuelto == Boolean.FALSE) {
	    this.libro.setPrestado(Boolean.FALSE);
	    return this.devuelto = Boolean.TRUE;
	}

	return Boolean.FALSE;

    }

    public Libro getLibro() {
        return libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Boolean getDevuelto() {
        return devuelto;
    }
}
