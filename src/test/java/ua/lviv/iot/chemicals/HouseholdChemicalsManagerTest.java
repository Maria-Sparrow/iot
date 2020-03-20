package ua.lviv.iot.chemicals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.chemicals.manager.HouseholdChemicalsManager;
import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;

public class HouseholdChemicalsManagerTest extends BaseHouseholdChemicalsManagerTest {
    private HouseholdChemicalsManager householdChemicalsManager;

    @BeforeEach
    public void SetUp() {

    }

    @Test
    public void findHouseholdChemicalsByWeightInGrams() {
        householdChemicalsManager = new HouseholdChemicalsManager(householdChemicals);
        List<AbstractHouseholdChemicals> result = householdChemicalsManager.findChemicalsByWeightInGrams(7);
        assertEquals(1, householdChemicals.get(0).getWeightInGrams());
        assertEquals(2, householdChemicals.get(1).getWeightInGrams());
        assertEquals(3, householdChemicals.get(2).getWeightInGrams());
        assertEquals(4, householdChemicals.get(3).getWeightInGrams());

    }

}
