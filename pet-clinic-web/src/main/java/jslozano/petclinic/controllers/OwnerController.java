package jslozano.petclinic.controllers;

import jslozano.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
        /*
        Owners is the name of the property inside the model. Attribute means the normal one in POO
        OwnerService.findAll() give us a set to iterate over it
        Spring MVC is going to inject the model into the method
         */
    }
    @RequestMapping("/find")
    public String findOwners(){
        return "notImplemented";
    }
}
