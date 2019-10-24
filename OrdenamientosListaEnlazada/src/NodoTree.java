/**
 * La clase nodo arbol se utiliza para la cracion de los arboles,siendo los nodos listas enlazadas antes creadas que
 * contaran en su primera poscion la palabra y la siguentes una lista con todos los URL donde la palabra aparece
 */
public class NodoTree {
    public List lista;
    public NodoTree left;
    public NodoTree right;

    /**
     *Crea un nodo dentro del arbol
     * @param list
     */
    public NodoTree(List list){
        this.lista = list;
        this.left = null;
        this.right = null;
    }
}
