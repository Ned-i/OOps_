


public class LoanSystem {

    public String checkEligibility(double creditScore) {
        if (creditScore >= 75)
            return " Eligible for full loan amount (Excellent score)";
        else if (creditScore >= 50)
            return "  Eligible for limited loan (Moderate score)";
        else
            return " Not eligible for loan (Low score)";
    }
}