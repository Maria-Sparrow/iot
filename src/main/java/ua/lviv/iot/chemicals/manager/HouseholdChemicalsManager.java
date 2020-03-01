package ua.lviv.iot.chemicals.manager;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;

public class HouseholdChemicalsManager {
	private ArrayList<AbstractHouseholdChemicals> chemicals = new ArrayList<AbstractHouseholdChemicals>();
	
	public void addChemical(AbstractHouseholdChemicals chemical) {
		chemicals.add(chemical);

	}
	
	
	public ArrayList<AbstractHouseholdChemicals> findHouseholdChemicalsByWeight(ArrayList<AbstractHouseholdChemicals> chemicals, 
			int weightInGrams) {
		ArrayList<AbstractHouseholdChemicals> foundChemicals = new ArrayList<AbstractHouseholdChemicals>();
		for (AbstractHouseholdChemicals chemical : chemicals) {
			if (chemical.getWeightInGrams() == weightInGrams ) {
				foundChemicals.add(chemical);
			}
		}
		return foundChemicals;
	}
	
	public ArrayList<AbstractHouseholdChemicals> findHouseholdChemicalsBySmell(List<AbstractHouseholdChemicals> chemicals,
			String smell) {
		ArrayList<AbstractHouseholdChemicals> foundChemicals = new ArrayList<AbstractHouseholdChemicals>();
		for (AbstractHouseholdChemicals chemical : chemicals) {
			if (chemical.getSmell().contains(smell)) {
				foundChemicals.add(chemical);
			}
		}
		return foundChemicals;
		
	}

	

	

}
