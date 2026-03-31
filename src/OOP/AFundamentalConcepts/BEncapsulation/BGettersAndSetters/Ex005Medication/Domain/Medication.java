package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex005Medication.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medication {
    private String name;
    private String manufacturer;
    private String batchNumber;
    private LocalDate expirationDate;
    private LocalDate manufacturingDate;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void display(){
        System.out.println("---------- Medicamento ----------");
        System.out.println("Nome da medicação: "+ name);
        System.out.println("Fabricante: "+ manufacturer);
        System.out.printf("Lote: %s%n", batchNumber);
        System.out.printf("Data de fabricação: %s%n", manufacturingDate.format(formatter));
        System.out.printf("Data de validade: %s%n", expirationDate.format(formatter));
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getBatchNumber(){
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber){
        this.batchNumber = batchNumber;
    }

    public String getExpirationDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return expirationDate.format(formatter);
    }

    public void setExpirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }

    public String getManufacturingDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return manufacturingDate.format(formatter);
    }

    public void setManufacturingDate(LocalDate manufacturingDate){
        this.manufacturingDate = manufacturingDate;
    }
}
