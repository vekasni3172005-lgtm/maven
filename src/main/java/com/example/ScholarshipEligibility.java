import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (out of 100): ");
        double marks = scanner.nextDouble();

        System.out.print("Enter annual family income: ");
        double income = scanner.nextDouble();

        scanner.nextLine(); // consume newline
        System.out.print("Enter caste category (GEN/OBC/SC/ST): ");
        String caste = scanner.nextLine().toUpperCase();

        boolean eligible = checkEligibility(marks, income, caste);

        if (eligible) {
            System.out.println("Eligible for scholarship!");
        } else {
            System.out.println("Not eligible for scholarship.");
        }

        scanner.close();
    }

    private static boolean checkEligibility(double marks, double income, String caste) {
        // Marks criteria: minimum 60%
        if (marks < 60) {
            return false;
        }

        // Income criteria: max 5 lakhs per year
        if (income > 500000) {
            return false;
        }

        // Caste-specific relaxations (example criteria)
        switch (caste) {
            case "SC":
            case "ST":
                return marks >= 50 && income <= 600000; // Relaxed criteria
            case "OBC":
                return marks >= 55 && income <= 550000;
            case "GEN":
            default:
                return marks >= 60 && income <= 500000;
        }
    }
}
