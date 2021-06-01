package gonzalezAlejandroP1PB2;

public abstract class Libro {
    
    private Integer código;
    private String nombre; 
    private String autor;
    
    
    public Integer getCódigo() {
        return código;
    }
    public void setCódigo(Integer código) {
        this.código = código;
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
