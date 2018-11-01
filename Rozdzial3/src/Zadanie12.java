import java.io.File;
import java.util.Arrays;

/**
 *
 * Mając tablicę obiektów File , posortuj je w taki sposób, by katalogi znalazły się
 przed plikami, a w każdej grupie elementy zostały posortowane według nazwy.
 Użyj wyrażenia lambda przy implementowaniu interfejsu Comparator .
 */
public class Zadanie12 {

    public static void main(String[] args) {

        File file = new File("/home/kuba/Obrazy");

        File[] files = file.listFiles();

        Arrays.sort(files,(x,y) -> {
            if (x.isDirectory() && !y.isDirectory()) {
                return -1;
            }

            if(!x.isDirectory() && y.isDirectory()) {
                return 1;
            }
                return 0;
        });

        for (File sortedFile : files){
            System.out.println(sortedFile.getName());
        }
    }


}
