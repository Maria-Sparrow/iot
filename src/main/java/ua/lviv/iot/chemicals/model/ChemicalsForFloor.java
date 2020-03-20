package ua.lviv.iot.chemicals.model;

public class ChemicalsForFloor extends AbstractHouseholdChemicals {

    private String typeOfFloor;

    public ChemicalsForFloor(String producer, double priceInUAH, int weightInGrams, String expirationDate,
            int harmfulnessInPercent, int solubilityInPercent, String type, String smell, int thickInPercent,
            double volumeInLiters, DetergentType detergentType, String typeOfFloor) {
        super(producer, priceInUAH, weightInGrams, expirationDate, harmfulnessInPercent, solubilityInPercent, type,
                smell, thickInPercent, volumeInLiters, detergentType);
        this.typeOfFloor = typeOfFloor;
    }
    
    public String getTypeOfFloor() {
        return typeOfFloor;
    }

    public String getHeaders() {
        return super.getHeaders() + ", typeOfFloor";
    }

    public String toCSV() {
        return super.toCSV() + ", " +  "typeOfFloor = " + getTypeOfFloor();
    }

}
