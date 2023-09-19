import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ejercicio1_ConvertListToSet {

    public static void main(String[] args) {

/*      // Creating object of List<Integer>
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
        */


        //Utilizamos HashSet para crear una lista donde no haya numeros repetidos.
        HashSet<Integer> dummyHset = new HashSet<>();

        dummyHset.add(1);
        dummyHset.add(3);
        dummyHset.add(34);
        dummyHset.add(9);
        dummyHset.add(3);
        dummyHset.add(12);
        dummyHset.add(5);
        dummyHset.add(12);

        System.out.println(dummyHset);

    }
}