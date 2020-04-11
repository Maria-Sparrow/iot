package ua.lviv.iot.springLabSeven.secondRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
@Entity
public class HouseholdChemical {
    protected String producer;
    protected int priceInUAH;
    protected int weightInGrams;
    protected String expirationDate;
    protected String name;
    protected int solubilityInPercent;
    protected String smell;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    protected Integer id;

    public HouseholdChemical(String producer, int priceInUAH, int weightInGrams, String expirationDate, String name,
            int solubilityInPercent, String smell) {
        this.producer = producer;
        this.priceInUAH = priceInUAH;
        this.weightInGrams = weightInGrams;
        this.expirationDate = expirationDate;
        this.name = name;
        this.solubilityInPercent = solubilityInPercent;
        this.smell = smell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(int priceInUAH) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSolubilityInPercent() {
        return solubilityInPercent;
    }

    public void setSolubilityInPercent(int solubilityInPercent) {
        this.solubilityInPercent = solubilityInPercent;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

}
