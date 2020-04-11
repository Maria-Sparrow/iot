package ua.lviv.iot.springLabSeven.secondRest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import ua.lviv.iot.springLabSeven.secondRest.business.ChemicalsServise;
import ua.lviv.iot.springLabSeven.secondRest.model.HouseholdChemical;

@RequestMapping("/chemical")
@RestController
public class HouseholdChemicalsController {
    private Map<Integer, HouseholdChemical> householdChemicals = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    private ChemicalsServise chemicalsServise;

    @GetMapping
    public List<HouseholdChemical> getHouseholdChemicals() {
        return new LinkedList<HouseholdChemical>(householdChemicals.values());
    }

    @GetMapping(path = "/{id}")
    public HouseholdChemical getHouseholdChemical(@PathVariable("id") Integer householdChemicalId) {
        return householdChemicals.get(householdChemicalId);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public HouseholdChemical createHouseholdChemical(final @RequestBody HouseholdChemical householdChemical) {
        System.out.println(chemicalsServise.createHouseholdChemical(householdChemical));
        householdChemical.setId(idCounter.incrementAndGet());
        householdChemicals.put(householdChemical.getId(), householdChemical);
        return householdChemical;

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<HouseholdChemical> deleteHouseholdChemicals(@PathVariable("id") Integer householdChemicalId) {
        HttpStatus status = householdChemicals.remove(householdChemicalId) == null ? HttpStatus.NOT_FOUND
                : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public HouseholdChemical updateHouseholdChemical(final @PathVariable("id") Integer householdChemicalId,
            final @RequestBody HouseholdChemical householdChemical) {
        householdChemical.setId(householdChemicalId);
        return householdChemicals.put(householdChemicalId, householdChemical);
    }
}
