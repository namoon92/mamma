package com.yummy.mamma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Date;

import com.yummy.mamma.entity.Menu;
import com.yummy.mamma.service.MenuService;

@Controller
@RequestMapping("/menu-register")
public class MenuRegisterController {

    @GetMapping("")
    /**
     * @param model
     * @return String
     */
    public String showForm(Model model) {
        model.addAttribute("menu", new Menu());
        return "menu-register";
    }

    private final MenuService menuService;

    /**
     * @param menuService
     */
    @Autowired
    public MenuRegisterController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/register")
    public String addMenu(Menu menu, Model model) {

        Date registerDate = new Date();

        menu.setregisterUserId(1);
        menu.setRegisterDate(registerDate);

        // サービスを通じてメニューを保存
        menuService.saveMenu(menu);

        return "redirect:/menu-register";

    }
}
