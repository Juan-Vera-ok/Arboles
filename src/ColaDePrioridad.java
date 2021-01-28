
public class ColaDePrioridad 
{
	Monticulo elementos;
	ColaDePrioridad()
	{
	elementos = new Monticulo();
	}
	int suprimir()
	{
	int sacado = elementos.eliminar(1); // siempre elimina la raíz
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
	boolean estaLlena()
	{// implementar}
	
	

}
