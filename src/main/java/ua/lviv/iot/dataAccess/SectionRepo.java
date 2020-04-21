package ua.lviv.iot.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.springLabSeven.secondRest.model.HouseholdChemical;

@Repository
public interface SectionRepo extends JpaRepository<HouseholdChemical, Integer> {

}

