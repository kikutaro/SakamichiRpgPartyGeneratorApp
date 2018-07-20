package com.sakamichi46.rpgparty;

import com.sakamichi46.rpgparty.generator.HiraganaKeyakiGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("prototype")
public class HiraganaKeyakiController {
    
    @Autowired
    private HiraganaKeyakiGenerator hiraganaGenerator;

    @GetMapping("/generate/hiraganakeyakizaka46")
    public String generateHiraganaKeyakizaka46(@RequestParam(name = "name") String name, Model model) {
        String imageUrl = hiraganaGenerator.generate(name);
        model.addAttribute("name", name);
        model.addAttribute("imageUrl", imageUrl);
        return "index";
    }
}