package ImplColaPrioridad;

//import api.heapsTDA;
import api.ColaConPrioridadTDA;
import ImplHeaps.ImplHepsArr;


class Elemento{
	int valor;
	int prioridad;
	
	public int Valor() {
		return valor;
	}
	
	public int Prioridad() {
		return prioridad;
	}
}

public class ColaPrioridadHeap implements ColaConPrioridadTDA{
	
	ImplHepsArr heap = new ImplHepsArr();
	
	int inx = 10; // tamaño actual del arbol
	Elemento raiz;
	Elemento [] elementos;
	
		public void InicializarCola() {
		raiz = null;
		elementos = new Elemento[inx];
		inx = 0;
	}
	
	public int Primero() {
		return raiz.valor;
	}
	
	public boolean ColaVacia() {
		return raiz == null;
	}
	
	
	@Override
	public void AcolarPrioridad(int x, int p){
		Elemento elemento = new Elemento();
		elemento.valor = x;
		elemento.prioridad = p;
		
		if (elementos.length == inx){
			Desacolar();
		}
		
		elementos[inx] = elemento;
		inx++;
		Flotar(inx);
				
		/*
		 * cambio de lugares de nodos (ramas/hojas/raiz) segun elemento.prioridad
		 */
		
	}
	
	public void Desacolar() {
		/*
		 * eliminar elemento, LA RAIZ, reordenar igual que arriba
		 */
		
		elementos[0] = elementos[inx-1];
		inx--;
		hundir(0);
	}
	
	public int Prioridad() {
		return elementos[inx-1].prioridad;
	}
	
	public void Mostrar() {
		System.out.println("Valor (prioridad)");
		for (int i=0; i<inx ;i++) {
			System.out.println(elementos[i].valor + " (" + elementos[i].prioridad + ")");
		}
	}
	
	private void Flotar(int x) {
		while ((x / 2) > 0) {
			if (elementos[x-1].Prioridad() < elementos[x/2-1].Prioridad()) {
				Elemento aux = elementos[x/2-1];
				elementos[x/2-1] = elementos[x-1];
				elementos[x-1] = aux;
				
			}
			x = x / 2;
		}
	}

	 private void hundir(int x) {
		while (((x+1)*2) <= inx) {
			int nodo  = hijomax(x);
			if (elementos[x].Prioridad() > elementos[nodo].Prioridad())
			{
				Elemento aux = elementos[x];
				elementos [x] = elementos[nodo];
				elementos[nodo] = aux;
			}
			x = nodo;
		}
		
		for (int i=0; i<inx ;i++) {
			System.out.println(elementos[i].valor + " " + elementos[i].prioridad);
		}
	}
	 
	public int hijomax(int x) {
		if (elementos[2*(x+1)-1].Prioridad() < elementos[(1+x)*2].Prioridad()) {
			return 2*(x+1)-1;
		}
		else {
			return (1+x)*2;
		}
	}
	
	/*
	public Elemento HijoIzq(Elemento e) throws Exception{
		for(int i = 0;i<inx;i++) {
			if (elementos[i].Valor() == e.Valor()) {
				return elementos[i*2+1];
			}
			else {
				throw new Exception("El nodo no tiene hijo izquierdo");
			}
		}
	}
	
	public Elemento HijoDer(Elemento e) throws Exception{
		for(int i = 0;i<inx;i++) {
			if (elementos[i].Valor() == e.Valor()) {
				return elementos[i*2+2];
			}
			else {
				throw new Exception("El nodo no tiene hijo derecho");
			}
		}
	}
	*/
	
}
