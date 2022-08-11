package sumCalculator;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator = new SimpleCalculator();
	calculator.setFirstNumber(3.0);
	calculator.setSecondNumber(2.5);

        System.out.println("Add = "+calculator.getAddisjonsResult());
        System.out.println("Subtraction = "+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(4.3);
        System.out.println("Multiplication = "+calculator.getMultiplicationResult());
        System.out.println("Division = "+calculator.getDivisionResult());
    }
}
