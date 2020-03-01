/**
 * 
 */
package ua.lviv.iot.chemicals.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.chemicals.manager.HouseholdChemicalsManager;
import ua.lviv.iot.chemicals.manager.HouseholdChemicalsManagerUtils;
import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;
import ua.lviv.iot.chemicals.model.SortType;


class HouseholdChemicalsManagerTest extends BaseHouseholdChemicalsManagerTest {
	private HouseholdChemicalsManager householdChemicalsManager;
	
	@BeforeEach

	public void setUp() {
		
		householdChemicalsManager = new HouseholdChemicalsManager();
		householdChemicalsManager.addChemical(null);
		
	}
	
	@Test
	public void testSortingAscending() {
		List<AbstractHouseholdChemicals> chemicalsForWindows = chosenHouseholdChemicalsForWindows;
		chemicalsForWindows = HouseholdChemicalsManagerUtils.sortChemicalsForWindowsByProducer(chemicalsForWindows,
				SortType.ASC);
	
	}
	
	

}
