package ua.lviv.iot.chemicals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.chemicals.manager.HouseholdChemicalsManagerUtils;
import ua.lviv.iot.chemicals.model.SortType;

public class HouseholdChemicalsManagerUtilsTest extends BaseHouseholdChemicalsManagerTest {
    @Test
    public void testSortingBySolubility() {
        HouseholdChemicalsManagerUtils.sortBySolubility(householdChemicals, SortType.DESC);
        for (int i = 0; i < householdChemicals.size(); i++)
            System.out.println(householdChemicals.get(i).getSolubilityInPercent());
        assertEquals(87, householdChemicals.get(0).getSolubilityInPercent());
        assertEquals(80, householdChemicals.get(1).getSolubilityInPercent());
        assertEquals(72, householdChemicals.get(3).getSolubilityInPercent());
        assertEquals(70, householdChemicals.get(2).getSolubilityInPercent());
    }

    @Test
    public void testSortByWeight() {
        HouseholdChemicalsManagerUtils.sortByWeight(householdChemicals, SortType.ASC);
        for (int i = 0; i < householdChemicals.size(); i++)
            System.out.println(householdChemicals.get(i).getWeightInGrams());
        assertEquals(1, householdChemicals.get(0).getWeightInGrams());
        assertEquals(2, householdChemicals.get(1).getWeightInGrams());
        assertEquals(3, householdChemicals.get(2).getWeightInGrams());
        assertEquals(4, householdChemicals.get(3).getWeightInGrams());
    }

    @Test
    public void testSortByPriceInUAH() {
        HouseholdChemicalsManagerUtils.sortByPriceInUAH(householdChemicals, SortType.ASC);
        for (int i = 0; i < householdChemicals.size(); i++)
            System.out.println(householdChemicals.get(i).getPriceInUAH());
        assertEquals(17.5, householdChemicals.get(0).getPriceInUAH());
        assertEquals(47.1, householdChemicals.get(1).getPriceInUAH());
        assertEquals(60.30, householdChemicals.get(2).getPriceInUAH());
        assertEquals(80.1, householdChemicals.get(3).getPriceInUAH());
    }

    @Test
    public void testSortByHarmfulness() {
        HouseholdChemicalsManagerUtils.sortByHarmfulness(householdChemicals, SortType.DESC);
        for (int i = 0; i < householdChemicals.size(); i++)
            System.out.println(householdChemicals.get(i).getHarmfulnessInPercent());
        assertEquals(12, householdChemicals.get(0).getHarmfulnessInPercent());
        assertEquals(10, householdChemicals.get(1).getHarmfulnessInPercent());
        assertEquals(9, householdChemicals.get(2).getHarmfulnessInPercent());
        assertEquals(3, householdChemicals.get(3).getHarmfulnessInPercent());
    }

}