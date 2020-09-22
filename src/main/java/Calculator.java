public class Calculator {
    private String model;

    public Calculator(String model) {
        this.model = model;
    }

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public double divide(double first, double second) {
        return first / second;
    }

}
