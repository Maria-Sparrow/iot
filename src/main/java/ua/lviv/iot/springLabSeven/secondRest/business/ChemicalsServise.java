package ua.lviv.iot.springLabSeven.secondRest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.springLabSeven.secondRest.dataAccess.ChemicalsRepo;
import ua.lviv.iot.springLabSeven.secondRest.model.HouseholdChemical;

@Service
public class ChemicalsServise {
    @Autowired
    private ChemicalsRepo chemicalsRepo;

    public HouseholdChemical createHouseholdChemical(HouseholdChemical householdChemical) {

        return chemicalsRepo.save(householdChemical);
    }

}
