

import java.util.*;

public class RuralLendingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditScoreCalculator calculator = new CreditScoreCalculator();
        LoanSystem loanSystem = new LoanSystem();

        while (true) {
            System.out.println("\n===== Rural Beneficiary Credit Score System =====");
            System.out.println("1. Add New Beneficiary");
            //System.out.println("2. View All Records");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Aadhaar Number: ");
                        String aadhaar = sc.nextLine();

                        System.out.print("Enter Annual Income (₹): ");
                        double income = sc.nextDouble();

                        System.out.print("Owns Farm Land? (true/false): ");
                        boolean ownsFarm = sc.nextBoolean();

                        System.out.print("Enter Loan History Score (0–100): ");
                        double loanHistory = sc.nextDouble();

                        System.out.print("Enter Repayment Rate (0–100): ");
                        double repayRate = sc.nextDouble();

                        System.out.print("Enter Govt Subsidy Score (0–100): ");
                        double govtSubsidy = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter Occupation (Farmer/Artisan/Shopkeeper/Laborer/Other): ");
                        String occupation = sc.nextLine();

                        Beneficiary b = new Beneficiary(name, age, aadhaar, income, ownsFarm,
                                                        loanHistory, repayRate, govtSubsidy, occupation);

                        double score = calculator.calculateScore(b);
                        String result = loanSystem.checkEligibility(score);

                        System.out.println("\nBeneficiary: " + name);
                        System.out.println("Calculated Credit Score: " + score);
                        System.out.println("Loan Eligibility: " + result);

                        FileHandler.saveToFile(b, score);
                    }
                    catch (Exception e) {
                        System.out.println(" Invalid input: " + e.getMessage());
                        sc.nextLine();
                    }
                    break;

                /*case 2:
                    FileHandler.displayAllRecords();
                    break;*/

                case 2:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }
    }
}