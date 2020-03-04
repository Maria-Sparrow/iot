package ua.lviv.iot.chemicals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.HouseholdChemicalsManager;
import ua.lviv.iot.model.AbstractHouseholdChemicals;

public class HouseholdChemicalsManagerTest extends BaseHouseholdChemicalsManagerTest{
	private HouseholdChemicalsManager householdChemicalsManager;
	@BeforeEach
	public void SetUp() {
		
	}
	
	@Test
	public void findHouseholdChemicalsByWeightInGrams() {
	    householdChemicalsManager = new HouseholdChemicalsManager(householdChemicals);
	       List<AbstractHouseholdChemicals> result = householdChemicalsManager.findChemicalsByWeightInGrams(7);
		assertEquals(1,householdChemicals.get(0).getWeightInGrams());
		assertEquals(2,householdChemicals.get(1).getWeightInGrams());
		assertEquals(3,householdChemicals.get(2).getWeightInGrams());
		
		
	}
	
	/*public class ConstructionGoodsManagerTest extends BaseConstructionGoodsManagerTest {

  @Test
  public void testFindGoodsCheaperThan() {
    ConstructionGoodsManager manager = new ConstructionGoodsManager(goods);
    double testPriceInUah = 60.50;
    List<AbstractConstructionGoods> result = manager.findGoodsCheaperThan(testPriceInUah, goods);

*/

}
