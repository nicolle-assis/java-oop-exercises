package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex003Car.Domain;

public class Car {
    public String answer;
    public int speed;

    public void accelerate(){
        speed += 10;
        System.out.println("Velocidade atual: " + speed + "km/h");
    }

    public void slowDown(){
        if (speed>0) {
            speed -= 10;
            System.out.println("Velocidade atual: " + speed + "km/h");

        }else System.out.println("O carro já está parado");

    }
}
