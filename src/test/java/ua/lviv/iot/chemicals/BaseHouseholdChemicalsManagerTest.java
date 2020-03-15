package ua.lviv.iot.chemicals;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;
import ua.lviv.iot.chemicals.model.*;
import ua.lviv.iot.chemicals.model.DetergentType;

import org.junit.jupiter.api.BeforeEach;

public abstract class BaseHouseholdChemicalsManagerTest {
    public List<AbstractHouseholdChemicals> householdChemicals;
    
    @BeforeEach
    public void chosenHouseholdChemicals()
    {
        householdChemicals = new LinkedList<AbstractHouseholdChemicals>();
        householdChemicals.add(new ChemicalsForWindows("Ukraine", 17.5, 1, "12.09.2019", 12, 87, "liquid", "fresh", 1, 0.9, DetergentType.CLIN, "ammonia"));
        householdChemicals.add(new ChemicalsForWashingUp("Germany", 60.30, 2, "19.02.2019", 9, 80, "liquid", "fresh", 1, 0.95, DetergentType.GALA, "can also be used in a dishwasher"));
        householdChemicals.add(new ChemicalsForClothes("Paris", 80.1, 3, "10.02.2020", 3, 70, "liquid", "flowers", 3, 0.97, DetergentType.PERWOLL,60));
        householdChemicals.add(new ChemicalsForFloor("English", 47.1, 4, "19.02.2020", 10, 72, "liquid", "lemon", 2, 0.99, DetergentType.MRPROPPER,"Oak"));

    }
    
    
}
