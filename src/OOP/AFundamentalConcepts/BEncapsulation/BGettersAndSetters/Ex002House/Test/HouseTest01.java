package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex002House.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex002House.Domain.House;
import java.util.Scanner;

public class HouseTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        House house = new House();

        System.out.print("Endereço da casa: ");
        house.setAddress(input.nextLine().trim());

        while (true) {
            System.out.print("Preço da casa: ");
            try {
                house.setPrice(input.nextDouble());
                input.nextLine();
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }

        house.display();
    }
}
