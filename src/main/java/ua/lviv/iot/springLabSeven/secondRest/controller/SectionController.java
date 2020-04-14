package ua.lviv.iot.springLabSeven.secondRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.business.SectionService;
import ua.lviv.iot.springLabSeven.secondRest.model.Section;

@RequestMapping("/section")
@RestController
public class SectionController {
    @Autowired
    private SectionService sectionService;
   /* @GetMapping
    public List<Section> getSections(){
        return sectionService.getSections();
    }*/

}
