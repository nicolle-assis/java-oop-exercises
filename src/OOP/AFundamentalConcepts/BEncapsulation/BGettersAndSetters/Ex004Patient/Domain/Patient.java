package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex004Patient.Domain;

public class Patient {
    private int age;
    private String name;
    private String healthPlan;

    public void registerPatient(String name) {
        System.out.println("Paciente cadastrado: " + name);
    }

    public void registerPatient(String name, int age) {
        System.out.println("Paciente cadastrado: " + name + ", " + age + " anos");
    }

    public void registerPatient(String name, int age, String healthPlan) {
        System.out.println("Paciente cadastrado: " + name + ", " + age + " anos, Convênio: " + healthPlan);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan){
        this.healthPlan = healthPlan;
    }
}
