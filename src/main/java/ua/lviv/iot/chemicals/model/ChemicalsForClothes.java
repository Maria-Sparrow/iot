package ua.lviv.iot.chemicals.model;

public class ChemicalsForClothes extends AbstractHouseholdChemicals {

    private int temperatureModesInPercent;

    public ChemicalsForClothes(String producer, double priceInUAH, int weightInGrams, String expirationDate,
            int harmfulnessInPercent, int solubilityInPercent, String type, String smell, int thickInPercent,
            double volumeInLiters, DetergentType detergentType, int temperatureModesInPercent) {
        super(producer, priceInUAH, weightInGrams, expirationDate, harmfulnessInPercent, solubilityInPercent, type,
                smell, thickInPercent, volumeInLiters, detergentType);
        this.temperatureModesInPercent = temperatureModesInPercent;
    }
    
    public int getTemperatureModesInPercent() {
        return temperatureModesInPercent;
    }

    public String getHeaders() {
        return super.getHeaders() + ", temperatureModesInPercent";
    }

    public String toCSV() {
        return super.toCSV() + ", " +  "temperatureModesInPercent = " + getTemperatureModesInPercent();
    }

}