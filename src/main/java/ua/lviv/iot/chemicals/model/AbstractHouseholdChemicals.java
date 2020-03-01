package ua.lviv.iot.chemicals.model;

public abstract class AbstractHouseholdChemicals {

	protected String producer;
	protected double priceInUAH;
	protected int weightInGrams;
	protected String expirationDate;
	protected int harmfulnessInPercent;
	protected int solubilityInPercent;
	protected String type;
	protected String smell;
	protected int thickInPercent;
	protected double volumeInLiters;
	protected DetergentType detergentType;
	
	

	

	public String getChemicalsForWindowsByProducer() {
		return producer;
	}

	public void setChemicalsForWindowsByProducer(String chemicalsForWindowsByProducer) {
		this.producer = chemicalsForWindowsByProducer;
	}

	public AbstractHouseholdChemicals(String producer) {
		
		this.producer = producer;
	}
	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getHarmfulnessInPercent() {
		return harmfulnessInPercent;
	}

	public void setHarmfulnessInPercent(int harmfulnessInPercent) {
		this.harmfulnessInPercent = harmfulnessInPercent;
	}

	public int getSolubilityInPercent() {
		return solubilityInPercent;
	}

	public void setSolubilityInPercent(int solubilityInPercent) {
		this.solubilityInPercent = solubilityInPercent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSmell() {
		return smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}

	public int getThickInPercent() {
		return thickInPercent;
	}

	public void setThickInPercent(int thickInPercent) {
		this.thickInPercent = thickInPercent;
	}

	public double getVolumeInLiters() {
		return volumeInLiters;
	}

	public void setVolumeInLiters(double volumeInLiters) {
		this.volumeInLiters = volumeInLiters;
	}

	public DetergentType getDetergentType() {
		return detergentType;
	}

	public void setDetergentType(DetergentType detergentType) {
		this.detergentType = detergentType;
	}
	

	
	
	
}
