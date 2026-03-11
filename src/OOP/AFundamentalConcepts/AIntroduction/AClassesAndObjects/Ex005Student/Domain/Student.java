package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex005Student.Domain;

public class Student {
    public String name;
    public double grade1;
    public double grade2;

    public double calculateAverage(){
        return (grade1 + grade2) / 2;
    }
}
