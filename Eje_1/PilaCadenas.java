package Eje_1;

public class PilaCadenas {
	private int max=10;
    private String v[]=new String[max+1];
    private int tope;
    
    public PilaCadenas()
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
    public void adicionar (String elem) //push
    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }
    public String eliminar () //pop
    {
    	String elem = new String();
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
    	String elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else{
		    
			PilaCadenas aux = new PilaCadenas ();
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
			String l = Leer.dato();
		    adicionar (l);
		}
    }
    public void vaciar (PilaCadenas a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
	public int nroElem() {
		return tope;
	}
	public void llenar2() {
		adicionar("vaca");
		adicionar("casa");
		adicionar("color");
		adicionar("ventana");
		adicionar("escalera");
	}

}
