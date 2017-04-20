package com.gunstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gavin on 4/19/17.
 */
@Controller
public class GunController {

    @Autowired
    GunRepository repo;

    @GetMapping("/")
    public String listLongGuns(Model model) {

        model.addAttribute("longguns", repo.listLongGuns());

        return "index";
    }
}