package torres_hanoi;

public class Pilas {
    private int ContadorN = 0;
    private Nodo cabeza;

    
    public Pilas() {
        ContadorN = 0;
        cabeza = null;
    }

    public int getContadorN() {
        return ContadorN;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void push(Nodo N){
        ContadorN++;
        if (cabeza == null) {
            cabeza = N;
        } else {
            N.setAnterior(cabeza);
            
            cabeza.setSiguiente(N);
            cabeza = N;
        }
    }
    
    public void pop(){
        if (ContadorN > 0) {
            ContadorN--;
            
            cabeza = cabeza.getAnterior();
        }
    }
    
    public String peek(){
        return cabeza.getElemento();
    }

     public boolean estaVacia() {
        return cabeza == null;
    }
}
