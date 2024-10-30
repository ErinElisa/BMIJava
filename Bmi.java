public class Bmi {
    double bmi;
    
    void getBmi(double height, double weight){
        //if the height in centimeter
        if (height > 5) { //assumming height in centimeters is more than 5 meters
            height = height / 100; 
        }

        //bmi formula
        bmi = weight / (height * height);
        
        //to call bmi result
        System.out.printf("BMI ku adalah: %.2f%n", bmi);

        //to determine your bmi cateogry
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
