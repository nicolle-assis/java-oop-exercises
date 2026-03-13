package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex004Calculator.Domain;

public class Calculator {
    public int choice;
    public String answer;
    public double x;
    public double y;

    public void add(){
        System.out.println(x + y);
    }

    public void multiplication(){
        System.out.println(x * y);
    }

    public void subtraction(){
        System.out.println(x - y);
    }

    public void division(){
        if (y==0) {
            System.out.println("Divisão por zero não é tratada");
            return;
        }

        System.out.println(x / y);
    }

}
