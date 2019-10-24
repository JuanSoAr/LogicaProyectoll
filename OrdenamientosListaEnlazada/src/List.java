/**
 *Es una lista la cual recibe cualquier tipo de dato
 * @param <T>
 */
public class List<T> {

    private Nodo<T> first;
    private List list;
    int len = 0;

    /**
     * Obtiene el primer dato de la lista
     * @return
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * Incialisa la lista
     */
    public void List() {
        listNull();
    }

    public void listNull() {
        first = null;
    }

    /**
     * Elimina una lista
     */
    public void delteList() {
        this.first = null;
    }

    /**
     * Afregar al final de la lista
     * @param t
     */
    public void addLast(T t) {
        if (this.first == null) {
            this.first = new Nodo(t);
            len += 1;
        } else {
            Nodo Actual = this.first;
            while (Actual.next != null) {
                Actual = Actual.next;
            }
            Actual.next = new Nodo(t);
            len += 1;
        }
    }

    /**
     * Obtiene un nodo segun la posicion en el que este este ubicadp
     * @param pos una posicion
     * @return un nodo
     */
    public Nodo posNodo(int pos) {
        Nodo Actual = this.first;
        if (this.first != null) {
            if (pos < len) {
                while (pos != 0) {
                    Actual = Actual.next;
                    pos -= 1;
                }
                System.out.println(Actual.getDato());
                return Actual;
            } else {
                System.out.println("Error");
                return null;
            }
        }
        return null;
    }

    /**
     * Imprime una listaen cosola
     */
    public void imprimirLista() {
        Nodo Actual = this.first;
        System.out.print("[");
        while (Actual != null) {
            System.out.print(Actual.getDato() + ",");
            Actual = Actual.next;
        }
        System.out.print("]");
    }

    /**
     * Si existe una lista sobre otra imprime el arreglo de listas
     */
    public void printArray() {
        Nodo actualList = this.first;
        List list = (List) actualList.getDato();
        Nodo nodoInList = list.getFirst();
        System.out.print("[");
        while (actualList != null) {
            System.out.print("[");
            while (nodoInList != null) {
                System.out.print(nodoInList.getDato() + ",");
                nodoInList = nodoInList.next;
            }
            System.out.print("]");
            actualList = actualList.next;
            if (actualList != null) {
                list = (List) actualList.getDato();
                nodoInList = list.getFirst();
            }
            System.out.print("]");
        }
    }
}
