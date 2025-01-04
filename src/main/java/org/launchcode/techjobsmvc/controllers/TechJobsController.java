package org.launchcode.techjobsmvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

public class TechJobsController {

    private static Map<String,String> actionChoices = new HashMap<>();
    public TechJobsController(){
        actionChoices.put("all", "All");
        actionChoices.put("employer", "Employer");
        actionChoices.put("location", "Location");
        actionChoices.put("positionType", "Position Type");
        actionChoices.put("coreCompetency", "Skill");

    }

@ModelAttribute("actions")
    public Map<String,String> getActionChoices(Model model){
        model.addAttribute("actions",actionChoices);
        return actionChoices;
    }
}
