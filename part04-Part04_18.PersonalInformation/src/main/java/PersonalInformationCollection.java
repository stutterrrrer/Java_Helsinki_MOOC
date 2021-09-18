
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String fName = scanner.nextLine();
            if (fName.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            String lName = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            PersonalInformation person = new PersonalInformation(fName,lName,id);
            infoCollection.add(person);
        }
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
