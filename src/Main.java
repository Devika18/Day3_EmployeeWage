import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");

        System.out.println("Random value is: ");
        Random random = new Random();
        int r = random.nextInt(5);
        System.out.println(r);
        if(r>3) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}