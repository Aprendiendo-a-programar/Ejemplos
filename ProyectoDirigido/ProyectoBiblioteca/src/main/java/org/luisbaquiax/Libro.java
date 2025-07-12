package org.luisbaquiax;

public class Libro {
    private String referencia;
    private String titulo;
    private String autor;
    private int ejemplares;// disponibles 5 - 1 = 4
    private int prestados;// prestados

    /**
     * Este constructor nos crea un objeto de tipo libro
     * @param referencia
     * @param titulo
     * @param autor
     * @param ejemplares
     * @param prestados
     */
    public Libro(String referencia, String titulo, String autor, int ejemplares, int prestados) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    /**
     * Permitir el préstamo de un libro
     * @return
     */
    public boolean prestar(){
        if(ejemplares  > 0){
            this.prestados++;
            this.ejemplares--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Permite devolver un libro
     * @return
     */
    public boolean devolver(){
        if(prestados > 0){
            this.prestados--;
            this.ejemplares++;
            return true;
        }else {
            return false;
        }

    }

    public boolean estaDisponible(){
        return this.ejemplares > 0;//verdader o falso
    }

    @Override
    public String toString() {
        return "Libro {" +
                " referencia='" + referencia + "'"+
                " titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + ejemplares +
                ", prestados=" + prestados +
                " }";
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public int getPrestados() {
        return prestados;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
