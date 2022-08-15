package Eje_3;

public class PilaMascota {
	private int max=10;
    private Mascota v[]=new Mascota[max+1];
    private int tope;
    
    public PilaMascota()
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
    public void adicionar (Mascota elem) //push
    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }
    public Mascota eliminar () //pop
    {
    	Mascota elem = new Mascota();
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
    	Mascota elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else{
			PilaMascota aux = new PilaMascota ();
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
			Mascota l = new Mascota();
		    l.leer();
		    adicionar (l);
		}
    }
    public void vaciar (PilaMascota a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
	public int nroElem() {
		return tope;
	}
	public void llenar2() {
		adicionar(new Mascota("coco", "perro", 6));
		adicionar(new Mascota("pepita", "gato", 3));
		adicionar(new Mascota("rocky", "perro", 5));
		adicionar(new Mascota("poly", "loro", 4));
		adicionar(new Mascota("lucas", "pato", 6));
	}

}
