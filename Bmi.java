public class Bmi {
    double bmi;
    
    void getBmi(double height, double weight){
        //height harus dalam meter
        bmi = weight / (height * height);
        
        System.out.printf("BMI ku adalah: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kamu Kurang Berat Badan");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kamu Memiliki Berat Normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kamu Kelebihan Berat Badan");
        } else {
            System.out.println("Kamu Obesitas");
        }
    }
}
