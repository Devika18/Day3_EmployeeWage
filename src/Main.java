import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");

        Random random = new Random();
        System.out.println("Random value is: ");
        int day = 20;
        int w = 20;
        int fullTime = 10;
        int salary, totalSalary = 0;
        int isPresent = random.nextInt(5);
        System.out.println(isPresent);

        if (isPresent>2) {
            salary = w * fullTime * day;
            totalSalary = totalSalary + salary;
            System.out.println("Monthly salary of the employee is: " + totalSalary);
        } else {
            salary = 0;
            System.out.println("Employee is absent and the salary is: " + salary);
        }
    }
}