package ua.lviv.iot.chemicals.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;
import ua.lviv.iot.chemicals.model.ChemicalsForWindows;


public abstract class BaseHouseholdChemicalsManagerTest {
	protected List<AbstractHouseholdChemicals> chosenHouseholdChemicalsForWindows;
	
	public void chooseHouseholdChemicalsForWindows() {
		
		chosenHouseholdChemicalsForWindows = new LinkedList<AbstractHouseholdChemicals>();
		chosenHouseholdChemicalsForWindows.add(new ChemicalsForWindows("CLEAN"));
		chosenHouseholdChemicalsForWindows.add(new ChemicalsForWindows("SHINE"));
		chosenHouseholdChemicalsForWindows.add(new ChemicalsForWindows("PRO100"));
		
	}
	
	

}
