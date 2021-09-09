package com.example.test0101.controller;

import com.example.test0101.model.model3_7;
import com.example.test0101.model.model3_7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class controller3_7 {
    @Autowired
    private model3_7Repository model3_7repository;

    @GetMapping
    public String class3_7(Model model) {
        List<model3_7> model3_7List = model3_7repository.findAll();
        model.addAttribute("model3_7", model3_7List);
        return "index";
    }
}
