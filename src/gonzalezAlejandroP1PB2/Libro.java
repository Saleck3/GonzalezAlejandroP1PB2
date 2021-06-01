package gonzalezAlejandroP1PB2;

public abstract class Libro {
    
    private Integer codigo;
    private String nombre; 
    private String autor;
    private Boolean prestado; 
    
    
    
    public Boolean getPrestado() {
        return prestado;
    }
    
    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    

}
