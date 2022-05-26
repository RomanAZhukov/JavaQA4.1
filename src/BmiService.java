public class BmiService {
    public float calculate(int weight, float height) {

        float BMI;
        float a = height / 100;
        BMI = (weight / (a * a));
        return BMI;
    }
}