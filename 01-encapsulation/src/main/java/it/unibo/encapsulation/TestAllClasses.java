package it.unibo.encapsulation;

public class TestAllClasses {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        System.out.println("1+2=" + calc.add(1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        Calculator.printCalculatorStatus(calc);

        System.out.println("----- TEST GETTERS AND SETTERS CALCULATOR -----");
        System.out.println(calc.getLastResult());
        System.out.println(calc.getOperationsPerformed());
        calc.setLastResult(0);
        calc.setOperationsPerformed(0);
        System.out.println("Settato tutto a 0 con i Setters");
        System.out.println(calc.getLastResult());
        System.out.println(calc.getOperationsPerformed());

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        htcOne.printStringRep();
        note3.printStringRep();
    }
}
