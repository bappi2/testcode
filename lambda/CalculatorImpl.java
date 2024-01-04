package lambda;
@FunctionalInterface
interface calculator {
    // void switchOn();
	// void sum(int a, int b);

    int substract(int a, int b);
    default void switchOn() {
        System.out.println("Switch On..");
    }

}
public class CalculatorImpl {
    public static void main(String[] args) {
        // new CalculatorImpl().switchOn();
        /* calculator calc = new CalculatorImpl();
        calc.switchOn(); */

        /* calculator calc = () -> System.out.println("Switch On..");
        calc.switchOn(); */

        /* calculator calc = (a, b) -> System.out.println(a + b);
        calc.sum(10, 20);*/

        /* calculator calc = (a, b) -> a - b;
        System.out.println(calc.substract(20 , 10)); */

        calculator calc = (a, b) -> {
            if (b > a) {
                throw new RuntimeException(" b > a");
            }
            else {
                return a - b;
            }
        };
        System.out.println(calc.substract(20 , 30));
    }

    // () -> {body}
}
