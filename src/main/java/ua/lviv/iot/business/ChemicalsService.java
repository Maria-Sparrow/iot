package ua.lviv.iot.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataAccess.ChemicalsRepo;
import ua.lviv.iot.springLabSeven.secondRest.model.HouseholdChemical;

@Service
public class ChemicalsService {
    @Autowired
    private ChemicalsRepo chemicalsRepo;

    public HouseholdChemical createHouseholdChemical(HouseholdChemical householdChemical) {

        return chemicalsRepo.save(householdChemical);
    }
    
    public List<HouseholdChemical> getHouseholdChemicals() {
        return chemicalsRepo.findAll();
    }

    public HouseholdChemical getHouseholdChemical(Integer id) {
            return chemicalsRepo.findById(id).get();
        }
    

  
    public void deleteById(Integer id) {
        
    }
    
  

    public HouseholdChemical updateHouseholdChemical(Integer householdChemicalId, HouseholdChemical householdChemical) {
        HouseholdChemical hChemicals = chemicalsRepo.findById(householdChemicalId).get();
      hChemicals.setId(householdChemicalId);
      householdChemical.setId(householdChemicalId);
      chemicalsRepo.save(householdChemical);
      return hChemicals;
  }
    public boolean existById(Integer householdChemicalId) {
        return chemicalsRepo.existsById(householdChemicalId);
        }
    }
   


