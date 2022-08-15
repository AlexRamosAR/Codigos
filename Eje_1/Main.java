package Eje_1;


public class Main {
	
	public static void main(String[] args) {
		PilaNumero n = new PilaNumero();
		n.llenar2();
		n.mostrar();
//		Stack<Integer> n1 = new Stack<Integer>();
		
//		PilaCadenas c = new PilaCadenas();
//		c.llenar2();
		//1. Verificar si la pila de Numeros contiene solo numeros pares
//		Solucion1(n);
		//2. Verificar si se encuentra el numero X
//		Solucion2(n,22);
//		//3. Mostrar los numeros mayores a X
//		Solucion3(n,25);
//		//4. Contar los numeros Pares
//		Solucion4(n);
//		//5. Llevar al final los numeros menores a 20
//		Solucion5(n);
//		System.out.println("Solucion 5");
//		n.mostrar();
//		//6. Ordenar la Pila de numeros
		Solucion6(n);
		System.out.println("Solucion 6");
		n.mostrar();
	}

	private static void Solucion6(PilaNumero n) {
		PilaNumero aux = new PilaNumero();
		PilaNumero orden = new PilaNumero();
		while(!n.esvacia()) {
			int may = n.eliminar();
			while(!n.esvacia()) {
				int x = n.eliminar();
				if(may > x) {
					aux.adicionar(may);
					may = x;
				}
				else
					aux.adicionar(x);
			}
			orden.adicionar(may);
			n.vaciar(aux);
		}
		n.vaciar(orden);
	}

	private static void Solucion5(PilaNumero n) {
		PilaNumero aux = new PilaNumero();
		PilaNumero fin = new PilaNumero();
		while(!n.esvacia()) {
			int x = n.eliminar();
			if(x < 20)
				fin.adicionar(x);
			else
				aux.adicionar(x);
		}
		n.vaciar(aux);
		n.vaciar(fin);
	}

	private static void Solucion4(PilaNumero n) {
		PilaNumero aux = new PilaNumero();
		int cont = 0;
		while(!n.esvacia()) {
			int x = n.eliminar();
			if(x %2 == 0)
				cont++;
			aux.adicionar(x);
		}
		n.vaciar(aux);
		System.out.println("La pila tiene '"+cont+"' numeros pares");
	}

	private static void Solucion3(PilaNumero n, int numX) {
		System.out.println("Solucion 3");
		System.out.println("Los numeros mayores a '"+numX+"' son: ");
		PilaNumero aux = new PilaNumero();
		while(!n.esvacia()) {
			int x = n.eliminar();
			if(x > numX)
				System.out.println(x);
			aux.adicionar(x);
		}
		n.vaciar(aux);
	}

	private static void Solucion2(PilaNumero n, int numX) {
		PilaNumero aux = new PilaNumero();
		boolean sw = false;
		while(!n.esvacia()) {
			int x = n.eliminar();
			if(x == numX) {
				sw = true;
			}
			aux.adicionar(x);
		}
		n.vaciar(aux);
		if(sw)
			System.out.println("El numero '"+numX+"' SI se encuantra");
		else
			System.out.println("El numero '"+numX+"' NO se encuantra");
	}

	private static void Solucion1(PilaNumero n) {
		PilaNumero aux = new PilaNumero();
		boolean sw = true;
		while(!n.esvacia()) {
			int x = n.eliminar();
			if(x%2 != 0)
				sw = false;
			aux.adicionar(x);
		}
		n.vaciar(aux);
		if(sw)
			System.out.println("Todos los numeros son pares");
		else
			System.out.println("NO Todos los numeros son pares");
	}
	
}
