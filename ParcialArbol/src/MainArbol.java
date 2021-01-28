
public class MainArbol {

	public static void main(String[] args) 
	{
		
		ArbolBinario ab= new ArbolBinario();
		
		ab.insertar(47);
		
		ab.insertar(35);
		
		ab.insertar(62);
		
		ab.insertar(17);
		
		ab.insertar(55);

		ab.insertar(66);

		ab.insertar(14);

		ab.insertar(23);
		
		ab.insertar(48);
		
		ab.insertar(59);
		
		ab.insertar(71);
		
		ab.insertar(20);
		
		ab.insertar(28);
		
		ab.insertar(83);
		
		ab.inorden(ab.getRaiz());

		ab.metodoIzquierdaYDerecha();
		
		IteradorArbol iterador=ab.getIteradorArbol();
		int sumaIzquierdos=0;
		int sumaDerechos=0;
		
		while(iterador.tieneSiguiente()) 
		{
			System.out.println("AAAAAAAAAAAAAAA");
				while(iterador.tieneSiguiente()) 
				{
					System.out.println("BBBBBBBBBBBBB");
					if(iterador.actual().getIzquierda()!=null) 
					{
						sumaIzquierdos=sumaIzquierdos+1;
					}
					if(iterador.actual().getDerecha()!=null) 
					{
						sumaDerechos=sumaDerechos+1;
					}
				if(iterador.tieneSiguiente()) {
					iterador.siguiente();}
				else 
				{break;}
	
				}		
				System.out.println("izquierdos "+sumaIzquierdos);
				System.out.println("derechos"+sumaDerechos);
		
	}
		

}
}