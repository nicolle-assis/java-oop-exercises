package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex005Car.Domain;

public class Car {
    private int currentSpeed;
    private String answer;

    public void display(){
        System.out.println("Velocidade atual: " + this.currentSpeed + " Km/hr");
    }

    public void increaseSpeed(){
        currentSpeed += 10;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed){
        if (currentSpeed < 0) throw new IllegalArgumentException("Velocidade inválida!");

        this.currentSpeed = currentSpeed;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }
}
