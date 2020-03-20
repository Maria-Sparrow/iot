package ua.lviv.iot.chemicals.model;

public class ChemicalsForWashingUp extends AbstractHouseholdChemicals {

    private String additionalUse;

    public ChemicalsForWashingUp(String producer, double priceInUAH, int weightInGrams, String expirationDate,
            int harmfulnessInPercent, int solubilityInPercent, String type, String smell, int thickInPercent,
            double volumeInLiters, DetergentType detergentType, String additionalUse) {
        super(producer, priceInUAH, weightInGrams, expirationDate, harmfulnessInPercent, solubilityInPercent, type,
                smell, thickInPercent, volumeInLiters, detergentType);
        this.additionalUse = additionalUse;

    }
    
    public String getAdditionalUse() {
        return additionalUse;
    }

    public String getHeaders() {
        return super.getHeaders() + ", additionalUse";
    }

    public String toCSV() {
        return super.toCSV() + ", " +  "additionalUse = " + getAdditionalUse();
    }

}
