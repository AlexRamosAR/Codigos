package Eje_2;

public class Libro {
	private String titulo, autor;
	private int nroPaginas;
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String titulo, String autor, int nroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
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
	public int getNroPaginas() {
		return nroPaginas;
	}
	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	public void mostrar() {
		System.out.println("Libro [titulo=" + titulo + ", autor=" + autor + ", nroPaginas=" + nroPaginas + "]");
	}
	public void leer() {
		setAutor(Leer.dato());
		setTitulo(Leer.dato());
		setNroPaginas(Leer.datoInt());
	}
}
