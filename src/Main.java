public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilo = 73;
        double heightMetre = 1.69;
        double BMI = service.calculate(weightKilo, heightMetre);
        System.out.println(BMI);
    }
}
