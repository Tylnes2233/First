import java.util.Scanner;

public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int ageInYears = Integer.parseInt(scanner.nextLine());

        int ageInMonths = ageInYears * 10;

        System.out.println(firstName + " " + lastName + " " + ageInMonths);

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());
        System.out.println(ageInMonths);
        scanner.close();
    }

    public static void main(String[] args) {
        new PassportFormCreator().createForms();
    }
}