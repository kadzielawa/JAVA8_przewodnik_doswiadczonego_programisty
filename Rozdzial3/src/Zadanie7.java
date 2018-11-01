import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * Zaimplementuj metodę void luckySort(ArrayList<String> strings,
 Comparator<String> comp) , która wywołuje Collections.shuffle na tablicy
 typu ArrayList do chwili, gdy elementy będą uporządkowane rosnąco w sposób
 określony przez komparator.
 */

public class Zadanie7 {

    static void luckySort(ArrayList<String> strings,
                          Comparator<String> comp) {
        ArrayList<String> idealArray = new ArrayList<>(strings);

        idealArray.sort(comp);
        int count = 0;
        boolean condition = (idealArray.equals(strings));
        while(!condition) {
            Collections.shuffle(strings);
            condition = (idealArray.equals(strings));
            count++;
        }

        System.out.println("Przetasowan: " + count) ;

    }

    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("kuba");
        strings.add("witek");
        strings.add("andrzej");
        strings.add("michał");
        strings.add("adam");

        luckySort(strings, (first, second) -> {

            int difference  = first.length() - second.length();
            if (difference > 0)
                return 1;
            if (difference < 0)
                return -1;

            return 0;
        });
    }
}
