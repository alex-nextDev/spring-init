package com.cnam.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cnam.demo.model.Userform;

@Controller
public class IndexController {
	
	/**
     * Cette méthode permet de capter un GEt de le page
     * http://localhost:8080/ ou http://localhost:8080/index
     *
     * @param model
     * @return le nom de page html index
     */
	
    @GetMapping("/")
    public String home(Model model) {
    	
    	Userform userform = new Userform();
    	Userform userform2 = new Userform();
    	userform.nomAfficher = "Silent";
    	userform.prenomAfficher = "Bob";
    	userform2.nomAfficher = "Kevin";
    	userform2.prenomAfficher = "Smith";
    	
    	model.addAttribute("objetuser", userform);
    	model.addAttribute("objetuser2", userform2);
    	
        model.addAttribute("msg_accueil", String.format("Bienvenue sur notre site !" ));
        return "index"; //retourne vers la page qui s'appelle index
    }

}
