
public class MainArbol {

	public static void main(String[] args) 
	{
		/*ColaDePrioridad CDP= new ColaDePrioridad();
		CDP.insertar(30);
		CDP.insertar(20);
		CDP.insertar(40);
		CDP.insertar(10);
		CDP.insertar(25);

		CDP.insertar(35);

		CDP.insertar(50);

		CDP.insertar(37);
		
		
		System.out.println(CDP.elementos.Mayor(CDP.elementos.getRaiz()));
		
		System.out.println(CDP.suprimir(CDP.elementos.getRaiz()));
		*/
		
		ArbolBinario ab= new ArbolBinario();
		
		ab.insertar(30);
		ab.insertar(20);
		ab.insertar(40);
		ab.insertar(10);
		ab.insertar(25);

		ab.insertar(35);

		ab.insertar(50);

		ab.insertar(37);
		
		ab.inorden(ab.getRaiz());

		System.out.println(ab.sumaPares(ab.getRaiz()));
		
		
		IteradorArbol iterador=ab.getIteradorArbol();
		
		while(iterador.tieneSiguiente()) 
		{
			
			int suma=0;
			int a=iterador.actual();
			while(iterador.tieneSiguiente()) 
			{
				if(a%2==0) {
					System.out.println(a+" es par");
				suma=suma+a;
				}
			if(iterador.tieneSiguiente()) {
				a=iterador.siguiente();}
			else 
			{break;}

		}
		
		
	}

}
}