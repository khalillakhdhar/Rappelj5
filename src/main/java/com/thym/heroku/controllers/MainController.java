package com.thym.heroku.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thym.heroku.entities.Rappel;

@Controller
public class MainController {
	static ArrayList<Rappel> listerappels=new ArrayList<Rappel>();
@GetMapping("")
public String rappels(Model m)
{
	Rappel r=new Rappel();
	m.addAttribute("rappel", r);
	return "index";
}
@PostMapping("save")
public String sauvegarde(Model mo,@ModelAttribute("rappel") Rappel r)
{
if(!r.verif())
{
mo.addAttribute("erreur", "verifier vos champs");
return "index";
}
else
{
	listerappels.add(r);
	mo.addAttribute("liste",listerappels);
	return "rappels";
	
}
}
}
