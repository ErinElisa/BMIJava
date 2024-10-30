import java.util.Scanner;

public class BmiBeraksi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //create new instance of the Bmi class
        Bmi NewBmi = new Bmi();

        // prompt the user to input their weight in kilograms
        System.out.println("Input berat badan dalam kilogram: ");
        double weight = sc.nextDouble();

        // prompt the user to input their height in meters
        System.out.println("Input tinggi badan dalam meter: ");
        double height = sc.nextDouble();

        // call getBmi to calculate and display BMI with the given height and weight
        NewBmi.getBmi(height, weight);
        
        sc.close();
    }
}
