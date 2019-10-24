/**
 * La clase arbol binario crea un arbol en el cual realizaremos la busqueda y añadiermos paralabra con sus respectivas
 * URL
 */

public class binaryTree {
    NodoTree root;
    public binaryTree(){
        this.root = null;
    }

    /**
     * recibe una lista con la cual creadara un nuevo nodo en el arbol
     * @param list
     */
    public void insert(List list){
        NodoTree nuevo = new NodoTree(list);
        if(root == null){
            root = nuevo;
        }
        else{
            NodoTree padre = null;
            NodoTree actual = root;
            while (actual != null){
                padre = actual;
                if ((actual.lista.getFirst()).toString().compareTo(list.getFirst().toString()) > 1){
                    actual = actual.left;
                }else{
                    actual = actual.right;
                }
            }
            if (padre.lista.getFirst().toString().compareTo(list.getFirst().toString()) > 1){
                padre.left = nuevo;
            }
            else padre.right = nuevo;
        }
    }

    /**
     * recibe una palabra para buscar la dentro del arbol binario
     * @param palrabra
     * @return la lista donde se encuentra dicho arbol
     */
    public List searchTree(String palrabra){
        NodoTree actual = root;
        while (actual != null || actual != null){
            if((actual.lista.getFirst().getDato()).toString() == palrabra){
                System.out.println("Encontrado");
                return actual.lista;
            }if((actual.lista.getFirst()).toString().compareTo(palrabra) > 1){
                actual = actual.left;
            }
            else{
                actual = actual.right;
            }
        }
        System.out.println("No encontrado");
        return null;
    }
}

