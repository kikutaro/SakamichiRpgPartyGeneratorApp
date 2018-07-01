package com.sakamichi46.rpgparty;

import com.sakamichi46.rpgparty.generator.NogizakaGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("prototype")
public class NogizakaController {

    @Autowired
    private NogizakaGenerator nogiGenerator;
    
    @GetMapping("/generate/nogizaka46")
    public String generateNogizaka46(@RequestParam(name = "name") String name, Model model) {
        String imageUrl = nogiGenerator.generate(name);
        model.addAttribute("name", name);
        model.addAttribute("imageUrl", imageUrl);
        return "index";
    }
}