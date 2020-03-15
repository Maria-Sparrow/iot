package ua.lviv.iot.chemicals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.HouseholdChemicalsManagerUtils;
import ua.lviv.iot.model.DetergentType;
import ua.lviv.iot.model.SortType;

public class HouseholdChemicalsManagerUtilsTest extends BaseHouseholdChemicalsManagerTest {
	@Test
	public void testSortByProducer() {
	    HouseholdChemicalsManagerUtils.sortByProducer(householdChemicals,SortType.DESC);
	    assertEquals(DetergentType.CLIN,householdChemicals.get(0).getDetergentType());
	    assertEquals(DetergentType.GALA,householdChemicals.get(1).getDetergentType());
	    assertEquals(DetergentType.MRPROPPER,householdChemicals.get(2).getDetergentType());
	    assertEquals(DetergentType.PERWOLL,householdChemicals.get(3).getDetergentType());
	    HouseholdChemicalsManagerUtils.sortByProducer(householdChemicals,SortType.ASC);
	    for(int i = 0; i<householdChemicals.size(); i++)
	        System.out.println(householdChemicals.get(i).getDetergentType());
	    assertEquals(DetergentType.CLIN,householdChemicals.get(0).getDetergentType());
	    assertEquals(DetergentType.GALA,householdChemicals.get(1).getDetergentType());
	    assertEquals(DetergentType.MRPROPPER,householdChemicals.get(2).getDetergentType());
	    assertEquals(DetergentType.PERWOLL,householdChemicals.get(3).getDetergentType());
	}

	
	@Test
    public void testSortByPriceInUAH() {
	    HouseholdChemicalsManagerUtils.sortByPriceInUAH(householdChemicals, SortType.DESC);
	    assertEquals(17.5,householdChemicals.get(0).getPriceInUAH());
	    assertEquals(60.30,householdChemicals.get(1).getPriceInUAH());
	    assertEquals(47.1,householdChemicals.get(2).getPriceInUAH());
	    assertEquals(80.1,householdChemicals.get(3).getPriceInUAH());
	    HouseholdChemicalsManagerUtils.sortByPriceInUAH(householdChemicals, SortType.ASC);
	    for(int i = 0; i<householdChemicals.size(); i++)
            System.out.println(householdChemicals.get(i).getPriceInUAH());
	    assertEquals(17.5,householdChemicals.get(0).getPriceInUAH());
	    assertEquals(60.30,householdChemicals.get(1).getPriceInUAH());
	    assertEquals(47.1,householdChemicals.get(2).getPriceInUAH());
	    assertEquals(80.1,householdChemicals.get(3).getPriceInUAH());
	    
	    
	}
}
