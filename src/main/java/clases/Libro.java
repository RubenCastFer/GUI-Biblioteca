package clases;

import java.util.Comparator;

public class Libro implements java.lang.Comparable<Libro>, Comparator <Libro>{
	
	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		this.titulo=titulo;
		this.isbn=isbn;
		this.genero=genero;
		this.autor=autor;
		this.paginas=paginas;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void genero(Genero genero) {
		this.genero=genero;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setAutor (String autor) {
		this.autor=autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setPaginas(Integer paginas) {
		this.paginas = null;
		if (paginas>0)
			this.paginas=paginas;
	}
	
	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public String toString() {
		return "Datos del libro [titulo: " + titulo + ", isbn: " + isbn + ", genero: " + genero + ", autor: " + autor + ", paginas: "
				+ paginas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equalsIgnoreCase(other.isbn))
			return false;
		return true;
	}
	


	@Override
	public int compare(Libro lib1, Libro lib2) {
		// TODO Auto-generated method stub
		int resultado = lib1.getPaginas()-lib2.getPaginas();
		return resultado;
	}

	@Override
	public int compareTo(Libro otro) {
		int resultado = this.getTitulo().compareTo(otro.getTitulo());
		return resultado;
	}
	
	
	
	//m equal y cadena.equalsignorecase()
}
