package Eje_1;

public class PilaNumero {
	private int max=10;
    private int v[]=new int[max+1];
    private int tope;
    
    public PilaNumero()
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
    public void adicionar (int elem) //push
    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }
    public int eliminar () //pop
    {
    	int elem = 0;
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
    	int elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else{
		    
			PilaNumero aux = new PilaNumero ();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				System.out.println(elem);
		    }
		    vaciar(aux);
		}
    }
    public void llenar (int n)
    {
		int i;
		for (i = 1 ; i <= n ; i++)
		{
			int l = Leer.datoInt();
		    adicionar (l);
		}
    }
    public void vaciar (PilaNumero a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
	public int nroElem() {
		return tope;
	}
	public void llenar2() {
		adicionar(55);
		adicionar(60);
		adicionar(18);
		adicionar(19);
		adicionar(22);
	}
}
