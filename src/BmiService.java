public class BmiService {
    public double calculate( int weightKilo, double heightMetre) {
        double index = weightKilo / (heightMetre * heightMetre);
        return (int) index;
    }
}
