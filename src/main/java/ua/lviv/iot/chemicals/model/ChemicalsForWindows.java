package ua.lviv.iot.chemicals.model;

public class ChemicalsForWindows extends AbstractHouseholdChemicals {
    private String excipients;

    public ChemicalsForWindows(String producer, double priceInUAH, int weightInGrams, String expirationDate,
            int harmfulnessInPercent, int solubilityInPercent, String type, String smell, int thickInPercent,
            double volumeInLiters, DetergentType detergentType, String excipients) {
        super(producer, priceInUAH, weightInGrams, expirationDate, harmfulnessInPercent, solubilityInPercent, type,
                smell, thickInPercent, volumeInLiters, detergentType);
        this.excipients = excipients;
    }

    public String getExcipients() {
        return excipients;
    }

    public String getHeaders() {
        return super.getHeaders() + ", excipients";
    }

    public String toCSV() {
        return super.toCSV() + ", " +  "excipients = " + getExcipients();
    }
}
