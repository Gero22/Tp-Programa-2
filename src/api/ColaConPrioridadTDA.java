package api;

public interface ColaConPrioridadTDA {

void InicializarCola();
void AcolarPrioridad(int x, int prioridad); // cola inicializada
void Desacolar(); // cola inicializada y no vaca
boolean ColaVacia(); // cola inicializada
int Primero();  // cola inicializada y no vaca
int Prioridad();  // cola inicializada y no vaca
void Mostrar();
}