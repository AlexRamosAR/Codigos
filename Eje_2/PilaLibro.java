package Eje_2;

public class PilaLibro {
	private int max=10;
    private Libro v[]=new Libro[max+1];
    private int tope;
    
    public PilaLibro()
    {
        tope=0;
    }
    public boolean esvacia ()//empty
    {
		if (tope == 0)
		    return (true);
		return (false);
    }
    public boolean esllena ()
    {
		if (tope == max)
		    return (true);
		return (false);
    }
    public int nroelem () //size
    {
    	return (tope);
    }
    public void adicionar (Libro elem) //push
    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }
    public Libro eliminar () //pop
    {
    	Libro elem = new Libro();
		if (!esvacia ())
		{
		    elem = v [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
    }
    public void mostrar ()
    {
    	Libro elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else{
		    
			PilaLibro aux = new PilaLibro ();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
		    }
		    vaciar(aux);
		}
    }
    public void llenar (int n)
    {
		int i;
		for (i = 1 ; i <= n ; i++)
		{
			Libro l = new Libro();
		    l.leer();
		    adicionar (l);
		}
    }
    public void vaciar (PilaLibro a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
	public int nroElem() {
		return tope;
	}
	public void llenar2() {
		adicionar(new Libro("S. Anillos", "EM. Jhob", 952));
		adicionar(new Libro("H. Poter", "J. Rowling", 733));
		adicionar(new Libro("P. Ahora", "Ekart", 255));
		adicionar(new Libro("Iluminati", "Toni", 405));
		adicionar(new Libro("Amnecia", "Loren", 65));
	}

}
