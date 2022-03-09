package jslozano.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets(){
        return "vets/index";
    }
    // The tags in the request mapping is only for be friendly with the user and respond the request for
    // all the three urls
}
