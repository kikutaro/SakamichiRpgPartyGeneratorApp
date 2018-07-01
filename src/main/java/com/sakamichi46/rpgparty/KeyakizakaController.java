package com.sakamichi46.rpgparty;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("prototype")
public class KeyakizakaController {

    @GetMapping("/generate/keyakizaka46")
    public String generateKeyakizaka46(@RequestParam(name = "name") String name, Model model) {
        return "index";
    }
}