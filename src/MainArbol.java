
public class MainArbol {

	public static void main(String[] args) 
	{
		ArbolBinario ab=new ArbolBinario();
		ArbolBinario ab2=new ArbolBinario();
		
		
		int a =(int) Math.floor(Math.random()*99+1);
		int b =(int) Math.floor(Math.random()*99+1);
		int c =(int) Math.floor(Math.random()*99+1);
		int d =(int) Math.floor(Math.random()*99+1);
		int e =(int) Math.floor(Math.random()*99+1);
		int f =(int) Math.floor(Math.random()*99+1);
		int g =(int) Math.floor(Math.random()*99+1);
		int h =(int) Math.floor(Math.random()*99+1);
		ab.insertar(a);
		ab.insertar(b);
		ab.insertar(c);
		ab.insertar(d);
		ab.insertar(e);
		ab.insertar(f);
		ab.insertar(g);
		ab.insertar(h);
		
		int i =(int) Math.floor(Math.random()*99+1);
		int j =(int) Math.floor(Math.random()*99+1);
		int k =(int) Math.floor(Math.random()*99+1);
		
		ab2.insertar(i);
		ab2.insertar(j);
		ab2.insertar(k);
		
		
		System.out.println("--------Arbol 1------");
		ab.inorden(ab.raiz);
		System.out.println("---------------------");
		System.out.println("--------Arbol 2------");
		ab2.inorden(ab2.raiz);

		System.out.println("--------Union 2 arboles------");
		
		ArbolBinario abFinal=ab.unirArboles(ab2.raiz);
		
		abFinal.inorden(abFinal.raiz);
		
		
	}

}
