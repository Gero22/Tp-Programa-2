package ImplColaPrioridad;



import api.ColaConPrioridadTDA;

public class ColaPrioriArr implements ColaConPrioridadTDA {
	class Elemento  {
	int valor;
	int prioridad;
}
	Elemento [] elementos;
	int inx;
	
	public void InicializarCola() {
		inx = 0;
		elementos = new Elemento[100];
	}

	@Override
	public void AcolarPrioridad(int x, int prioridad){
		int j = inx;
		for (; j >0 && elementos[j -1]. prioridad >= prioridad; j--){
		elementos[j] = elementos[j -1];
		}
		elementos[j]= new Elemento();
		elementos[j]. valor=x;
		elementos[j]. prioridad = prioridad;
		inx++;
		}

	@Override
	public void Desacolar() {
		elementos[ inx - 1]= null ;
		inx --;
		

	}

	@Override
	public boolean ColaVacia() {
		return ( inx == 0);
	}

	@Override
	public int Primero() {
		return elementos[inx -1].valor;
		
	}
	@Override
	public int Prioridad() {
		return elementos[inx -1]. prioridad;
	}
	public void Mostrar() {
		for (int i=0; i<inx ;i++) {
			System.out.println(elementos[i].valor + " " + elementos[i].prioridad);
			
			
		}

}
}

