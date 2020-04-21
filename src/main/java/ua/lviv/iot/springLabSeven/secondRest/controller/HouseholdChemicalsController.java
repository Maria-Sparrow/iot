package ua.lviv.iot.springLabSeven.secondRest.controller;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/*import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.business.ChemicalsService;
import ua.lviv.iot.springLabSeven.secondRest.model.HouseholdChemical;

@RequestMapping("/chemicals")
@RestController
public class HouseholdChemicalsController {

    @Autowired
    private ChemicalsService chemicalsService;

    @GetMapping
    public List<HouseholdChemical> getHouseholdChemicals() {
        return chemicalsService.getHouseholdChemicals();
    }

    @GetMapping(path = "/{id}")
    public HouseholdChemical getHouseholdChemicals(
            final @PathVariable("id") Integer householdChemicalId) {
        return chemicalsService.getHouseholdChemical(householdChemicalId);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public final HouseholdChemical createHouseholdChemical(@RequestBody HouseholdChemical householdChemical) {

        return chemicalsService.createHouseholdChemical(householdChemical);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<HouseholdChemical> deleteHouseholdChemicals(@PathVariable("id") Integer householdChemicalId) {
        if(chemicalsService.existById(householdChemicalId)) {
            chemicalsService.deleteById(householdChemicalId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(NOT_FOUND).build();
        }
        
    }

    @PutMapping(path = "/{id}")
    public  ResponseEntity<HouseholdChemical> updateHouseholdChemical(final @PathVariable("id") Integer householdChemicalId,
             @RequestBody HouseholdChemical householdChemical) {
        return chemicalsService.existById(householdChemicalId)?  ResponseEntity.ok(chemicalsService.updateHouseholdChemical(householdChemicalId, householdChemical)):
                ResponseEntity.status(NOT_FOUND).build();
    }
}  
