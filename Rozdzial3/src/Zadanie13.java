/**
 *
 * Napisz metodę, która pobiera tablicę instancji klas implementujących interfejs
 Runnable i zwraca instancję Runnable , której metoda run wykonuje kolejno kod
 instancji obiektów zapisanych w tablicy. Zwróć wyrażenie lambda.
 */
public class Zadanie13 {

    public static void main(String[] args) {

        Runnable[] runnables = new Runnable[2];

        runnables[0] = new Zadanie8_9.Greeter(1,"Mieszko");
        runnables[1] = new Zadanie8_9.Greeter(4,"Olek");

        Runnable r = runnableRun(runnables);

        r.run();
    }

     private static Runnable runnableRun(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }
}