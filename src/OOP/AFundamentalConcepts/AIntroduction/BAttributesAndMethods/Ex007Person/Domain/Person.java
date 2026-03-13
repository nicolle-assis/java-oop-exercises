package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex007Person.Domain;

public class Person {
    public String name;
    public int age;
    public String olderPerson;

    public void compareAges(){
        olderPerson = name;
        System.out.println("A pessoa mais velha é " + olderPerson);
    }
}
