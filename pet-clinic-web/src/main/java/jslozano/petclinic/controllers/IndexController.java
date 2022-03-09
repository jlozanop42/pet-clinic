package jslozano.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }
    /*
    Thymeleaf it's going to look for a html called index.
    All the parameters put in the request mapping it's for when there is a request coming from
    root context (localhost:8080) or root slash (localhost:8080/) or the same with index or index.html
    thymeleaf gets in action.
     */
}
