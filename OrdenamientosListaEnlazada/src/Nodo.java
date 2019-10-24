/**
 * La clase nodo,esta se utiliza para la creacion de listas de enlazadas con datos genericos,interos,listas,string
 * @param <T> tipo de dato
 */
public class Nodo<T> {
    private T value;
    public Nodo<T> next;

    /**
     * Inicialisa un nodo
     * @param p
     */
    public Nodo(T p){
        next = null;
        value = p;
    }

    /**
     * Ontiene el dato del nodo actual
     * @return
     */
    public T getDato() {
        return value;
    }

    /**
     * Modifica el dato del nodo actual
     * @param dato
     */
    public void setDato(T dato) {
        this.value = dato;
    }
}
