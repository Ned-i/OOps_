

public class CreditScoreCalculator {

    public double calculateScore(Beneficiary b) {
        double score = 0;

        score += (b.getIncome() / 1000) * 0.2;
        score += b.getLoanHistoryScore() * 0.25;
        score += b.getRepaymentRate() * 0.25;
        score += b.getGovtSubsidyScore() * 0.1;
        if (b.ownsFarm()) score += 5;

        switch (b.getOccupation().toLowerCase()) {
            case "farmer": score += 10; break;
            case "artisan": score += 7; break;
            case "shopkeeper": score += 5; break;
            case "laborer": score += 3; break;
            default: score += 2; break;
        }

        return Math.min(score, 100);
    }
}