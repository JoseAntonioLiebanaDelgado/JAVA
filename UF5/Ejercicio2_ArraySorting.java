import java.util.*;

public class Ejercicio2_ArraySorting {

    public static void main(String[] args) {

        // Creating object of List<Integer>
        List<Integer> arrlist = new ArrayList<>();

        // adding element to arrlist
        arrlist.add(1);
        arrlist.add(3);
        arrlist.add(34);
        arrlist.add(9);
        arrlist.add(3);
        arrlist.add(12);
        arrlist.add(5);
        arrlist.add(12);

        //Ordenamos el arrayList de menor a mayor con el metodo sort.
        Collections.sort(arrlist);
        System.out.println("El arrayList ordenado de menor a mayor quedaria de la siguiente manera:" + arrlist);

        //Ordenamos el arrayList de mayor a menor creando un objeto de la clase Comparator que vaya comparando cada numero.
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(arrlist, comparador);
        System.out.println("El arrayList ordenado de mayor a menor quedaria de la siguiente manera:" + arrlist);

    }
}