package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex006Patient.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex006Patient.Domain.Patient;
import java.time.LocalDate;

public class PatientTest {
    public static void main(String[] args) {
        Patient patient = new Patient("Finn Mertens", 20, "123-456-789-10", LocalDate.of(2026, 5, 27));

        patient.display();
    }
}
