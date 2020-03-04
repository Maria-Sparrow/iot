package ua.lviv.iot.model;

public class ChemicalsForClothes extends AbstractHouseholdChemicals {
	
	private int temperatureModesInPercent;
	
	public ChemicalsForClothes(String producer, double priceInUAH, int weightInGrams, String expirationDate,
			int harmfulnessInPercent, int solubilityInPercent, String type, String smell, int thickInPercent,
			double volumeInLiters, DetergentType detergentType,int temperatureModesInPercent ) {
		super(producer, priceInUAH, weightInGrams, expirationDate, harmfulnessInPercent, solubilityInPercent, type, smell,
				thickInPercent, volumeInLiters, detergentType);
		this.temperatureModesInPercent=temperatureModesInPercent; 
	}

	
	

}
