
public class ColaDePrioridad 
{
	ArbolBinario elementos;
	
	ColaDePrioridad()
	{
	elementos = new ArbolBinario();
	}
	
	int suprimir(Nodo r)
	{
	int sacado = elementos.Mayor(r); // siempre elimina la ra�z
	elementos.eliminar(sacado);
	return sacado;
	}
	
	void insertar(int nuevo)
	{
	elementos.insertar(nuevo);
	}
	
	boolean estaVacia()
	{
	return elementos.estaVacio();
	}
	
	//boolean estaLlena()
	//{}
	}
