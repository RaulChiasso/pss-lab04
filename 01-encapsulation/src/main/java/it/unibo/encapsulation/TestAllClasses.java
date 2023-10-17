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

        System.out.println("\n" 
                            + "----- TEST GETTERS AND SETTERS CALCULATOR -----" 
                            + "\n");
        System.out.println(calc.getLastResult());
        System.out.println(calc.getOperationsPerformed());
        calc.setLastResult(0);
        calc.setOperationsPerformed(0);
        System.out.println("Settato tutto a 0 con i Setters");
        System.out.println(calc.getLastResult());
        System.out.println(calc.getOperationsPerformed());
        System.out.println("\n" 
                            + "-----------------------------------------------" 
                            + "\n");

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4,
                                                    2048, 
                                                    8192, 
                                                    "Samsung", 
                                                    "Galaxy Note 3", 
                                                    true,
                                                    true, 
                                                    true);
        htcOne.printStringRep();
        note3.printStringRep();

        System.out.println("\n" 
                            + "----- TEST GETTERS SMARTPHONE -----" 
                            + "\n");
        System.out.println("Getters dell'oggetto note3");
        System.out.println(note3.getBrand());
        System.out.println(note3.getModel());
        System.out.println(note3.getCpuCount());
        System.out.println(note3.getRam());
        System.out.println(note3.getSdSize());
        System.out.println(note3.isHasGPS());
        System.out.println(note3.isHas3G());
        System.out.println(note3.isHasNFC());
        System.out.println("\n" 
                            + "-----------------------------------" 
                            + "\n");


        final SmartLamp lamp = new SmartLamp(false, 1, "bianco");
        System.out.println("\n" 
                            + "----- TEST SMARTLAMP -----" 
                            + "\n");
        lamp.changeStatus();
        System.out.println(lamp.isOn());
        System.out.println(lamp.getIntensity());
        System.out.println(lamp.setIntensity(2));
        System.out.println(lamp.getIntensity());
        System.out.println(lamp.getColor());
        System.out.println(lamp.setColor("green"));
        System.out.println(lamp.getColor());
        lamp.changeStatus();
        System.out.println(lamp.isOn());
        System.out.println("\n" 
                            + "-------------------------" 
                            + "\n");
    }
}
