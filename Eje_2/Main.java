package Eje_2;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//Sea una Pila de Libros
		PilaLibro l = new PilaLibro();
		l.llenar2();
		l.mostrar();
		//1. Verificar si el autor X existe
//		Solucion1(l,"Ekart");
//		//2. Verificar si el autor X escribio el libro Y
//		Solucion2(l,"Ekart","P. Ahora");
//		//3. Mostrar los libros con mas de 500 pginas
//		Solucion3(l);
//		//4. Llevar al final libros con menos de 300 paginas
//		Solucion4(l);
//		System.out.println("Solucion 4");
//		l.mostrar();
//		//5. Ordenar a los libros por nroPaginas
		Solucion6(l);
		System.out.println("Elementos ordenados");
		l.mostrar();
	}

	private static void Solucion6(PilaLibro l) {
		PilaLibro aux = new PilaLibro();
		PilaLibro orden = new PilaLibro();
		while(!l.esvacia()) {
			Libro may = l.eliminar();
			while(!l.esvacia()) {
				Libro x = l.eliminar();
				if(may.getNroPaginas()<x.getNroPaginas()) {
					aux.adicionar(may);
					may = x;
				}
				else
					aux.adicionar(x);
			}
			l.vaciar(aux);
			orden.adicionar(may);
		}
		l.vaciar(orden);
	}

	private static void Solucion4(PilaLibro l) {
		PilaLibro aux = new PilaLibro();
		PilaLibro fin = new PilaLibro();
		while(!l.esvacia()) {
			Libro x = l.eliminar();
			if(x.getNroPaginas()<300)
				fin.adicionar(x);
			else
				aux.adicionar(x);
		}
		l.vaciar(aux);
		l.vaciar(fin);
	}

	private static void Solucion3(PilaLibro l) {
		System.out.println("Libros con mas de 500 paginas");
		PilaLibro aux = new PilaLibro();
		while(!l.esvacia()) {
			Libro x = l.eliminar();
			if(x.getNroPaginas()>500)
				x.mostrar();
			aux.adicionar(x);
		}
		l.vaciar(aux);
	}

	private static void Solucion2(PilaLibro l, String autorX, String tituloY) {
		PilaLibro aux = new PilaLibro();
		boolean sw = false;
		while(!l.esvacia()) {
			Libro x = l.eliminar();
			if(x.getAutor().equals(autorX) && x.getTitulo().equals(tituloY))
				sw = true;
			aux.adicionar(x);
		}
		l.vaciar(aux);
		if(sw)
			System.out.println("El autor '"+autorX+"' SI escribio el Libro '" +tituloY+"'");
		else
			System.out.println("El autor '"+autorX+"' NO escribio el Libro '" +tituloY+"'");
	}

	private static void Solucion1(PilaLibro l, String autorX) {
		PilaLibro aux = new PilaLibro();
		boolean sw = false;
		while(!l.esvacia()) {
			Libro x = l.eliminar();
			if(x.getAutor().equals(autorX))
				sw = true;
			aux.adicionar(x);
		}
		l.vaciar(aux);
		if(sw)
			System.out.println("El autor '"+autorX+"' SI existe");
		else
			System.out.println("El autor '"+autorX+"' NO existe");
	}
	
}
