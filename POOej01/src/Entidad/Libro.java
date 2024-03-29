/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nohyv
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int nPaginas;

    //Constructores
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int npaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = npaginas;
    }
    
    //Getter&Setter
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getNPaginas() {
        return nPaginas;
    }

    public void setNPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    //toString
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + '}';
    }
}
