package ua.lviv.iot.chemicals.model;

import ua.lviv.iot.chemicals.model.*;

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
    
    public AbstractHouseholdChemicals(String producer, double priceInUAH, int weightInGrams, String expirationDate,
            int harmfulnessInPercent, int solubilityInPercent, String type, String smell, int thickInPercent,
            double volumeInLiters, DetergentType detergentType) {
        super();
        this.producer = producer;
        this.priceInUAH = priceInUAH;
        this.weightInGrams = weightInGrams;
        this.expirationDate = expirationDate;
        this.harmfulnessInPercent = harmfulnessInPercent;
        this.solubilityInPercent = solubilityInPercent;
        this.type = type;
        this.smell = smell;
        this.thickInPercent = thickInPercent;
        this.volumeInLiters = volumeInLiters;
        this.detergentType = detergentType;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public DetergentType getDetergentType() {
        return detergentType;
    }

    public String getProducer() {
        return producer;
    }

    public int getHarmfulnessInPercent() {
        return harmfulnessInPercent;
    }

    public int getSolubilityInPercent() {
        return solubilityInPercent;
    }

    public int compareTo(AbstractHouseholdChemicals secondChemical) {
        
        return 0;
    }
    
    
    
    

}
