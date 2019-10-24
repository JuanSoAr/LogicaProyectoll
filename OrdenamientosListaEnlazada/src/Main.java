public class Main {

    public static void main(String[] args) {
        List list1 = new List();
        List der = new List();
        List izq = new List();
        list1.addLast("hola");
        list1.addLast("mundo");
        list1.addLast("Apepe");
        list1.addLast("lago");
        list1.addLast("mago");
        list1.addLast("tronco");
        sortingAlgorithms quick = new sortingAlgorithms();
        quick.quickSorted(list1,list1.getFirst());


    }

 }

