package com.yummy.mamma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import java.util.Random;

@Controller
public class HomeController {

    @GetMapping("/mamma")
    public String showHome(Model model) {
        return "index";
    }

    //@PostMapping("/game")
    //public String playGame(int guess, Model model) {

     //   final int resultNumber = new Random().nextInt(10) + 1;
     //   model.addAttribute("resultNumber", resultNumber);

     //   if (guess == resultNumber) {
      //      model.addAttribute("resultBoolian", true);
      //  } else {
      //      model.addAttribute("resultBoolian", false);
      //  }
      //  return "game";
   // }
}
