


/*import java.io.*;

public class FileHandler {

    private static final String FILE_NAME = "C:/Users/ned - Personal/Desktop/RuralLendingProject/CreditSystem/data/beneficiaries.dat";
    public static void saveToFile(Beneficiary b, double creditScore) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(b.toString() + "," + creditScore);
            bw.newLine();
            System.out.println(" Record saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println(" Error saving data: " + e.getMessage());
        }
    }

    public static void displayAllRecords() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n Saved Beneficiary Records:");
            System.out.println("---------------------------------------------------------");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("---------------------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println(" No records found. File not created yet.");
        } catch (IOException e) {
            System.out.println(" Error reading file: " + e.getMessage());
        }
    }
}*/