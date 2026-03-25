package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex003Calculator.Domain;

public class Calculator {
    private double x;
    private double y;
    private int option;

    public void printSum(){
        double result = x + y;
        boolean isInteger = (x%1 == 0) && (y%1 == 0);

        if (isInteger) System.out.printf("%.0f + %.0f = %.0f", x, y, result);
        else System.out.printf("%.2f + %.2f = %.2f", x, y, result);
    }

    public void printSub(){
        double result = x - y;
        boolean isInteger = (x%1 == 0) && (y%1 == 0);

        if (isInteger) System.out.printf("%.0f - %.0f = %.0f", x, y, result);
        else System.out.printf("%.2f - %.2f = %.2f", x, y, result);
    }

    public void printMulti(){
        double result = x * y;
        boolean isInteger = (x%1 == 0) && (y%1 == 0);

        if (isInteger) System.out.printf("%.0f x %.0f = %.0f", x, y, result);
        else System.out.printf("%.2f x %.2f = %.2f", x, y, result);
    }

    public void printDiv(){
        if (y == 0) {
            System.out.println("Erro: Divisão por zero(0) não é permitido");
            return;
        }

        double result = x / y;
        boolean isInteger = (x%1 == 0) && (y%1 == 0) && (result%1 == 0);

        if (isInteger) System.out.printf("%.0f / %.0f = %.0f", x, y, result);
        else System.out.printf("%.2f / %.2f = %.2f", x, y, result);
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public int getOption(){
        return option;
    }

    public void setOption(int option){
        this.option = option;
    }
}
