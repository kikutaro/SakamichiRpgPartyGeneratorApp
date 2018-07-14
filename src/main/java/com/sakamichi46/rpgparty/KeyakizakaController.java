package com.sakamichi46.rpgparty;

import com.sakamichi46.rpgparty.generator.KeyakizakaGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("prototype")
public class KeyakizakaController {
    
    @Autowired
    private KeyakizakaGenerator keyakiGenerator;

    @GetMapping("/generate/keyakizaka46")
    public String generateKeyakizaka46(@RequestParam(name = "name") String name, Model model) {
        String imageUrl = keyakiGenerator.generate(name);
        model.addAttribute("name", name);
        model.addAttribute("imageUrl", imageUrl);
        return "index";
    }
}