


public class Beneficiary extends Person {
    private double income;
    private boolean ownsFarm;
    private double loanHistoryScore;
    private double repaymentRate;
    private double govtSubsidyScore;
    private String occupation;

    public Beneficiary(String name, int age, String aadhaarNumber, double income,
                       boolean ownsFarm, double loanHistoryScore, double repaymentRate,
                       double govtSubsidyScore, String occupation) {
        super(name, age, aadhaarNumber);
        this.income = income;
        this.ownsFarm = ownsFarm;
        this.loanHistoryScore = loanHistoryScore;
        this.repaymentRate = repaymentRate;
        this.govtSubsidyScore = govtSubsidyScore;
        this.occupation = occupation;
    }

    public double getIncome() { return income; }
    public boolean ownsFarm() { return ownsFarm; }
    public double getLoanHistoryScore() { return loanHistoryScore; }
    public double getRepaymentRate() { return repaymentRate; }
    public double getGovtSubsidyScore() { return govtSubsidyScore; }
    public String getOccupation() { return occupation; }

    @Override
    public String toString() {
        return name + "," + age + "," + aadhaarNumber + "," + income + "," +
               ownsFarm + "," + loanHistoryScore + "," + repaymentRate + "," +
               govtSubsidyScore + "," + occupation;
    }
}