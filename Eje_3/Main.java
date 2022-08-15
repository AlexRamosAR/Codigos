package Eje_3;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//Sea un Pila de Mascotas <nombre, tipo, edad>
		PilaMascota m = new PilaMascota();
		m.llenar2();
		m.mostrar();
		
		Stack<Mascota> ms = new  Stack<Mascota>();
		llenarStack(ms);
		mostrarStack(ms);
		for (int i = 0; i < ms.size(); i++) {
			ms.get(i).mostrar();
		}
		//1. Verificar si la mascota de nombre X se encuentra en la pila
//		Solucion1(m,"rocky");
		//2. Verificar si existe alguna mascota con edad por encima de X
//		Solucion2(m,5);
//		//3. Mostrar a las mascotas de tipo X
//		Solucion3(m,"perro");
//		//4. Contar a las mascotas de tipo X y edad Y
//		Solucion4(m,"perro",5);
//		//5. Eliminar a las mascotas de tipo X
		Solucion5(m,"gato");
		System.out.println("Solucion 5");
		m.mostrar();
//		//6. Ordenar a las mascotas por la edad
//		
		
	}
	private static void Solucion5(PilaMascota m, String tipoX) {
		PilaMascota aux = new PilaMascota();
		while(!m.esvacia()) {
			Mascota x = m.eliminar();
			if(!x.getTipo().equals(tipoX))
				aux.adicionar(x);
		}
		m.vaciar(aux);
	}
	private static void Solucion4(PilaMascota m, String tipoX, int edadY) {
		PilaMascota aux = new PilaMascota();
		int cont = 0;
		while(!m.esvacia()) {
			Mascota x = m.eliminar();
			if(x.getTipo().equals(tipoX) && x.getEdad() == edadY)
				cont++;
			aux.adicionar(x);
		}
		m.vaciar(aux);
		System.out.println("Las mascotas de tipo '"+tipoX+"' y edad '"+edadY+"' son: "+cont);
	}
	private static void Solucion3(PilaMascota m,String tipoX) {
		System.out.println("Solucion 3");
		PilaMascota aux =  new PilaMascota();
		while(!m.esvacia()) {
			Mascota x = m.eliminar();
			if(x.getTipo().equals(tipoX))
				x.mostrar();
			aux.adicionar(x);
		}
		m.vaciar(aux);
	}
	private static void Solucion2(PilaMascota m, int edadX) {
		PilaMascota aux = new PilaMascota();
		boolean sw = false;
		while(!m.esvacia()) {
			Mascota x = m.eliminar();
			if(x.getEdad()>edadX) {
				sw = true;
			}
			aux.adicionar(x);
		}
		m.vaciar(aux);
		if(sw)
			System.out.println("SI existe por lo menos una mascota con edad mayor a '"+edadX+"'");
		else
			System.out.println("NO existe por lo menos una mascota con edad mayor a '"+edadX+"'");
	}
	private static void Solucion1(PilaMascota m, String nomX) {
		PilaMascota aux = new PilaMascota();
		boolean sw = false;
		while(!m.esvacia()) {
			Mascota x = m.eliminar();
			if(x.getNombre().equals(nomX)) {
				sw = true;
			}
			aux.adicionar(x);
		}
		m.vaciar(aux);
		if(sw)
			System.out.println("La mascota con nombre '"+nomX+"' SI existe");
		else
			System.out.println("La mascota con nombre '"+nomX+"' NO existe");
	}
	private static void mostrarStack(Stack<Mascota> ms) {
		System.out.println("Datos del Stack");
		Stack<Mascota> aux = new Stack<Mascota>();
		while(!ms.empty()) {
			Mascota x = ms.pop();
			x.mostrar();
			aux.push(x);
		}
		vaciar(ms,aux);
	}
	private static void vaciar(Stack<Mascota> ms, Stack<Mascota> aux) {
		while(!aux.empty())
			ms.push(aux.pop());
	}
	private static void llenarStack(Stack<Mascota> ms) {
		ms.add(new Mascota("coco", "perro", 6));
		ms.add(new Mascota("pepita", "gato", 3));
		ms.add(new Mascota("rocky", "perro", 5));
		ms.add(new Mascota("poly", "loro", 4));
		ms.add(new Mascota("lucas", "pato", 6));
	}

}
