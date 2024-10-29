import java.util.Scanner;

public class BmiBeraksi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Bmi NewBmi = new Bmi();

        System.out.println("Input berat badan dalam kilogram: ");
        double weight = sc.nextDouble();

        System.out.println("Input tinggi badan dalam meter: ");
        double height = sc.nextDouble();

        NewBmi.getBmi(height, weight);
        
        sc.close();
    }
}
