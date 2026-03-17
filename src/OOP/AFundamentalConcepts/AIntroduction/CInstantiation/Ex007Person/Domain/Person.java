package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex007Person.Domain;

public class Person {
    public String name;
    public String age;
    public String address;

    public void greetingPerson1(){
        System.out.println("Olá me chamo " + name + ", sou do setor de TI");
    }

    public void greetingPerson2(){
        System.out.println("E esse(a) é minha(meu) colega de trabalho " + name + ", ele(a) tem " + age + " anos e é da " + address);
    }

    public void greetingPerson3(){
        System.out.println("Olá prazer em conhece los(las), me chamo " + name + ", vim da " + address + " e serei o(a) TechLead");
    }
}
