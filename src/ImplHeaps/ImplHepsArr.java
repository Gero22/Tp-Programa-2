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
		for (int i = 0;i<size;i++)
		{
			if ( arr[i]==x) {
				throw new Exception ("Valor Repetido");
			}
		}
				
		if (arr.length == size)
		{
			throw new Exception ("Tamaño arbol excedido");
		}
		arr[size] = x;
		size++;
		Flotar(size);
		
	}

	public void EliminarElem() {
		
			arr[0] = arr[size-1];
			size--;
			hundir(0);
		}
		
	
	
	private void Flotar (int x) {
		while ((x / 2) > 0) {
			if ( arr[x-1] > arr[x/2-1]) {
				int aux = arr[x/2-1];
				arr[x/2-1] = arr[x-1];
				arr[x-1] = aux;
				
			}
			x = x / 2;
		}
	}
	// 
	 private void hundir (int x) {
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
	
	public int hijomax (int x) {
		
		
			if (arr[2*(x+1)-1]>arr[(1+x)*2]) {
				return 2*(x+1)-1;
			}
			else {
				return (1+x)*2;
			}
		}
	
	 
	public String toString() {
		String str = new String ();
		for (int i = 0; i <size; i++)
		{
			str +="(" + i +")"  + arr[i] + "\n";
		}
		return str;
	}

	}
