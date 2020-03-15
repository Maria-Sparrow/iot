package ua.lviv.iot.chemicals.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;

public class HouseholdChemicalsManager {
    private List<AbstractHouseholdChemicals> householdChemicals = new LinkedList<>();

    public HouseholdChemicalsManager(List<AbstractHouseholdChemicals> householdChemicals) {
        this.householdChemicals = householdChemicals;
    }

    public HouseholdChemicalsManager() {

    }

    public void addHouseholdChemicals(List<AbstractHouseholdChemicals> householdChemicals) {
        this.householdChemicals.addAll(householdChemicals);
    }

    public void addHouseholdChemical(AbstractHouseholdChemicals householdChemical) {
        this.householdChemicals.add(householdChemical);
    }

    public List<AbstractHouseholdChemicals> findChemicalsByWeightInGrams(int weightInGrams) {
        List<AbstractHouseholdChemicals> result = new LinkedList<>();
        for (AbstractHouseholdChemicals householdChemical : householdChemicals) {
            if (householdChemical.getWeightInGrams() == weightInGrams) {
                result.add(householdChemical);
            }
        }
        return result;
    }
    
    
    
    
}
