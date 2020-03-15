package ua.lviv.iot.chemicals.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;
import ua.lviv.iot.chemicals.model.SortType;

public class HouseholdChemicalsManagerUtils {
    private static final SorterByWeight SORTER_BY_WEIGHT = new SorterByWeight();

    private static class SorterByWeight implements Comparator<AbstractHouseholdChemicals> {

        @Override
        public int compare(AbstractHouseholdChemicals firstChemical, AbstractHouseholdChemicals secondChemical) {
            return firstChemical.getWeightInGrams() - secondChemical.getWeightInGrams();
        }
    }

    private class SorterBySolubility implements Comparator<AbstractHouseholdChemicals> {

        @Override
        public int compare(AbstractHouseholdChemicals firstChemical,AbstractHouseholdChemicals secondChemical) {
            return firstChemical.compareTo(secondChemical);
        }
    }

    public static void sortByWeight(List<AbstractHouseholdChemicals> householdChemicals,SortType sortType) {
        householdChemicals.sort(sortType == SortType.ASC ? SORTER_BY_WEIGHT
                : SORTER_BY_WEIGHT.reversed());
    }

    public static void sortBySolubility(List<AbstractHouseholdChemicals> householdChemicals, SortType sortType) {
        householdChemicals.sort(sortType == SortType.ASC ? new HouseholdChemicalsManagerUtils().new SorterBySolubility()
                : new HouseholdChemicalsManagerUtils().new SorterBySolubility().reversed());
    }

    public static void sortByPriceInUAH(List<AbstractHouseholdChemicals> householdChemicals, SortType sortType) {
        Comparator<AbstractHouseholdChemicals> chemicalSortByPriceInUAH = new Comparator<AbstractHouseholdChemicals>() {
            @Override
            public int compare(AbstractHouseholdChemicals firstChemical, AbstractHouseholdChemicals secondChemical) {
                return Double.compare(firstChemical.getPriceInUAH(), secondChemical.getPriceInUAH());
            }
        };
        householdChemicals.sort(sortType == SortType.ASC ? chemicalSortByPriceInUAH : chemicalSortByPriceInUAH.reversed());
    }

    public static void sortByHarmfulness(List<AbstractHouseholdChemicals> householdChemicals, SortType sortType) {
        if (sortType == SortType.ASC) {
            householdChemicals.sort((firstChemical, secondChemical) -> Float.compare(firstChemical.getHarmfulnessInPercent(),
                    secondChemical.getHarmfulnessInPercent()));
        } else {
            householdChemicals.sort((firstChemical, secondChemical) -> Float.compare(secondChemical.getHarmfulnessInPercent(),
                    firstChemical.getHarmfulnessInPercent()));
        }
    }
}
