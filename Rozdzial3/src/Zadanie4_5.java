/**
 * Zaimplementuj statyczną metodę of w klasie IntSequence , która zwraca ciąg
 parametrów. Na przykład IntSequence.of(3, 1, 4, 1, 5, 9) zwraca ciąg sześciu
 wartości. Dodatkowe punkty możesz dostać za zwrócenie instancji wewnętrznej
 klasy anonimowej
 */

public class Zadanie4_5 {

    public static class IntSequence {
        public static String of(Integer... args){
            String parametersValue ="";
            for(Integer arg : args ) {
                parametersValue += arg;
            }

            return parametersValue;
        }

        public static String constant(int i){
            while( 1>0) System.out.println(i);
        }
    }

    
    public static void main(String[] args){
        String ints = IntSequence.of(2,1,5,5);
        String constant = IntSequence.constant(1);
        System.out.println(ints);
    }
    
}
