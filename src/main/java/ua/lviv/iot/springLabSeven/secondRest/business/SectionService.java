package ua.lviv.iot.springLabSeven.secondRest.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.springLabSeven.secondRest.dataAccess.SectionRepo;
import ua.lviv.iot.springLabSeven.secondRest.model.Section;

@Service
public class SectionService {
@Autowired
protected SectionRepo sectionRepo;

//public List<Section> getAllSections()   {
  //  return sectionRepo.findAll();
//}
}
