package ImplHeaps;

import api.HeapsTDAarr;

public class ImplHepsArr implements HeapsTDAarr  {
 
	int [] arr;
	int size;
	@Override
	public void InicializarArbol(int size) {
		arr = new int[size];
		size = 0;
	}

	@Override
	public void AgregarElem(int x) throws Exception {
		
		
				
		if (arr.length == size)
		{
			throw new Exception ("Tamaño arbol excedido");
		}
		arr[size] = x; // añade elemento al final de la lista
		size++;
		Flotar(size); //ordena el arbol para que los padres siempre sean mayores a los hijos intercambiandolos.
		
	}

	public void EliminarElem() {
		
			arr[0] = arr[size-1]; // eliminamos la raiz y remplazamos por el ultimo elemento agregado para conservar la estructura de heaps
			size--;
			hundir(0); // compara la nueva raiz con sus hijos para restabelcer la condicion de mayor.
		}
		
	
	
	private void Flotar (int x) { 
		while ((x / 2) > 0) {
			if ( arr[x-1] > arr[x/2-1]) { // compara el padre con el hijo , si es menor los cambia y sigue comparando  hasta llegar a la raiz.
				int aux = arr[x/2-1];
				arr[x/2-1] = arr[x-1];
				arr[x-1] = aux;
				
			}
			x = x / 2;
		}
	}
	// 
	 private void hundir (int x) { // intercambia el hijo por el padre si este es menor
		while (((x+1)*2) <= size) {
			int nodo  = hijomax(x);
			if (arr[x] < arr[nodo])
			{
				int aux = arr[x];
				arr [x] = arr[nodo];
				arr[nodo] = aux;
			}
			x= nodo;
		}
	}
	
	public int hijomax (int x) { // retorna el mayor entre hijo y padre
		
		
			if (arr[2*(x+1)-1]>arr[(1+x)*2]) {
				return 2*(x+1)-1;
			}
			else {
				return (1+x)*2;
			}
		}
	
	 
	public String toString() { // para imprimir el arbol
		String str = new String ();
		for (int i = 0; i <size; i++)
		{
			str +="(" + i +")"  + arr[i] + "\n";
		}
		return str;
	}

	}
