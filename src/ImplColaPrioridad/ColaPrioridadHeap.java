package ImplColaPrioridad;

import api.ColaConPrioridadTDA;

// La estructura de los elementos que se almacenarán en la cola
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
	
	int inx = 10; // tamaño actual del arbol
	Elemento [] elementos; // lista para el ordenamiento de los elementos
	
	public void InicializarCola() {
		elementos = new Elemento[inx];
		inx = 0;
	}
	
	public int Primero() {
		return elementos[0].Valor();
	}
	
	public boolean ColaVacia() {
		return elementos[0] == null;
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
	}
	
	public void Desacolar() {		
		elementos[0] = elementos[inx-1];
		inx--;
		hundir(0);
	}
	
	public int Prioridad() {
		return elementos[0].prioridad;
	}
	
	public void Mostrar() {
		System.out.println("Valor (prioridad)");
		for (int i=0; i<inx ;i++) {
			System.out.println(elementos[i].valor + " (" + elementos[i].prioridad + ")");
		}
	}
	
	
	/*
	 * Los métodos Flotar(), Hundir() e hijomax() provienen de la implementación de la estructura Heap,
	 * y están adaptados para funcionar de manera correcta en una cola de prioridad.
	 */
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
	}
	 
	public int hijomax(int x) {
		if (elementos[2*(x+1)-1].Prioridad() < elementos[(1+x)*2].Prioridad()) {
			return 2*(x+1)-1;
		}
		else {
			return (1+x)*2;
		}
	}
}
