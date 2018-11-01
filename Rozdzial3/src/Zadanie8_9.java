
/**
 *
 * Zaimplementuj klasę Greeter , która implementuje interfejs Runnable i w której metoda
 run wyświetla n kopii tekstu "Witaj, " + target , gdzie n i target są ustawiane
 w konstruktorze. Stwórz dwie instancje z różnymi komunikatami i wykonaj je
 równolegle w dwóch wątkach
 9. Zaimplementuj metody:
 public static void runTogether(Runnable... tasks)
 public static void runInOrder(Runnable... tasks)
 Pierwsza metoda powinna uruchomić każde zadanie w oddzielnym wątku i zakończyć
 działanie. Druga metoda powinna uruchomić wszystkie zadania w bieżącym wątku
 i zakończyć działanie po zakończeniu ostatniego z nich.
 */
public class Zadanie8_9 {


    public static void main(String[] args) {
        //run together
        Greeter r1 = new Greeter(3,"Jakub");
        Greeter r2 = new Greeter(8,"Michał");
        Greeter.runTogether(r1,r2);
        Greeter.runInOrder(r1,r2);
    }
        public static class Greeter implements Runnable {

        private int counter;
        private String greeterText;
        Greeter(int n, String target) {
            counter = n;
            greeterText = target;
        }
        @Override
        public void run() {
            for(int i =0; i < counter; i++) {
                System.out.println("Hello, " + greeterText);
            }
        }

        public static void runTogether(Runnable... tasks) {
            for(Runnable task : tasks) {
                new Thread(task).run();
            }
        }
        public static void runInOrder(Runnable... tasks) {
            for(Runnable task : tasks) {
                task.run();
            }
        }
    }
}
