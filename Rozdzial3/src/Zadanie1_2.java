import java.util.Arrays;

/**
 * Utwórz interfejs Measurable z metodą double getMeasure() , która dostarcza jakąś
 metrykę obiektu. Zaimplementuj interfejs Measurable w klasie Employee . Utwórz
 metodę double average(Measurable[] objects) , która oblicza średnią metryk.
 Wykorzystaj ją do obliczenia średniego wynagrodzenia pracowników, których dane
 są zapisane w tablicy.
 */

public class Zadanie1_2 {

    public static void main(String[] args) {
        Measurable[] newEmployees = new Measurable[4];

        newEmployees[0] = new Employee("Mikołaj",3500);
        newEmployees[1] = new Employee("Bartosz",7000);
        newEmployees[2] = new Employee("Jakub",5000);
        newEmployees[3] = new Employee("Cezary",3100);

        System.out.println("przecietna pensja:");
        System.out.println(averageSalary(newEmployees));

        Employee largestSalaryEmployee = (Employee) largest(newEmployees);
        System.out.println("Najwieksza pensje ma: " + largestSalaryEmployee.getName() + " tj. "+largestSalaryEmployee.getSalary() );

    }

    static Measurable largest(Measurable[] objects) {
        double maxSalary = 0;

        Arrays.sort(objects);
        Measurable largestSalary = objects[objects.length - 1];
        return largestSalary;
    }

    static double averageSalary(Measurable[] objects){

        double totalSalary = 0;
        int countOfEmployees = 0;
        for ( Measurable employee : objects)
        {
            totalSalary += employee.getMeasure();
            countOfEmployees++;
        }

        return totalSalary / countOfEmployees;
    }

}



