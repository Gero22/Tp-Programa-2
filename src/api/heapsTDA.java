package api;

public interface heapsTDA {
	int Raiz();
	heapsTDA HijoIzq();
	heapsTDA HijoDer();
	boolean ArbolVacio ();
	void InicializarArbol ();
	void AgregarElem (int x);
	void EliminarElem (int x);
	String toString();
	String to_string_helper(int idx);

}
