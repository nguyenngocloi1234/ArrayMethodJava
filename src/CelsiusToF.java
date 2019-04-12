import java.util.Scanner;
public class CelsiusToF {
    public static double celciusToF(double celcius){
        double f = celcius *1.8 + 32;
        return  f;
    }
    public static double fToCelcius(double f){
        double celcius = (f - 32)/1.8;
        return celcius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double celcius;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println(" Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:{
                    System.out.println(" Enter Fahrenheit: ");
                    f = input.nextDouble();
                    System.out.println("Fahrenheit to Celcius: "+fToCelcius(f));
                }
                    break;
                case 2:
                    System.out.println(" Enter Celcius: ");
                    celcius = input.nextDouble();
                    System.out.println("Celcius to Fahrenfeit: "+celciusToF(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice !=0);

    }
}
