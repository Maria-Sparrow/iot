package ua.lviv.iot.chemicals.manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.chemicals.model.SortType;

public class HouseholdChemicalsManagerUtilsTest extends BaseHouseholdChemicalsManagerTest {
	@BeforeEach
	public void setUp() {
		chooseHouseholdChemicalsForWindows();
		
	}
	
	@Test
	public void testSortingDescending() {
		HouseholdChemicalsManagerUtils.sortChemicalsForWindowsByProducer(chosenHouseholdChemicalsForWindows, SortType.DESC);
	}
}
