public class Mine {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90; //Вес в кг.
        int height = 180; //рост в см.
        float BMI = service.calculate(weight, height);
        System.out.println("Индекс массы тела:"  +  BMI);


    }
}
