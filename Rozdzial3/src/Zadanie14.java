import java.util.Arrays;
import java.util.Comparator;

/**
 * Napisz wywołanie Arrays.sort , które sortuje pracowników według wynagrodzenia,
 a w przypadku takich samych wynagrodzeń według nazwiska. Użyj Comparator.
  thenComparing . Następnie wykonaj to samo w odwrotnej kolejności.
 */
public class Zadanie14 {

    public static void main(String ...args) {

        Employee[] newEmployees = new Employee[6];

        newEmployees[0] = new Employee("Mikołaj", 3500);
        newEmployees[1] = new Employee("Bartosz", 7000);
        newEmployees[2] = new Employee("Waldemar", 5000);
        newEmployees[3] = new Employee("Konrad", 5000);
        newEmployees[4] = new Employee("Andrzej", 4000);
        newEmployees[5] = new Employee("Cezary", 3100);

        Arrays.sort(newEmployees,  Comparator.comparing(Employee::getSalary, (first, second) -> {

            double difference = first - second;
            if (difference > 1) {
                return 1;
            }
            if (difference < 1) {
                return -1;
            }
            return 0;

        }).thenComparing(Employee::getName));


        for (Employee employee : newEmployees) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }
}
