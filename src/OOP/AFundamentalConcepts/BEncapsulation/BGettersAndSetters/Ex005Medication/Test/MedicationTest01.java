package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex005Medication.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex005Medication.Domain.Medication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MedicationTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Medication medication = new Medication();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("---------- Registrar Medicamento ----------");
        System.out.print("Nome: ");
        medication.setName(input.nextLine().trim());

        System.out.print("Fabricante: ");
        medication.setManufacturer(input.nextLine().trim());

        System.out.print("Número do lote: ");
        medication.setBatchNumber(input.nextLine().trim().toUpperCase());

        System.out.print("Data de fabricação: ");
        LocalDate manufacturingDate = LocalDate.parse(input.nextLine().trim(), formatter);
        medication.setManufacturingDate(manufacturingDate);

        System.out.print("Data de validade: ");
        LocalDate expirationDate = LocalDate.parse(input.nextLine().trim(), formatter);
        medication.setExpirationDate(expirationDate);

        medication.display();

        input.close();
    }
}
