import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");

        Random random = new Random();
        System.out.println("Random value is: ");
        int w = 20;
        int fullTime = 10;
        int partTime = 8;
        int salary;
        int isPresent = random.nextInt(10);
        System.out.println(isPresent);


        //Checking condition for Part time Employee
        if(isPresent>=3) {
            salary = w*partTime;
            System.out.print("Employee is present for PartTime");
            System.out.println();
            System.out.print("Salary of Employee is: "+ salary);
        }
        else {
            salary = 0;
            System.out.print("Employee is Absent and salary is: "+ salary);
        }
    }
}