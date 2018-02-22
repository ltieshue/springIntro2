package com.lori.springIntro2.Controller;

import com.lori.springIntro2.data.userRepository;
import com.lori.springIntro2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class IntroController {

    @Autowired
    private userRepository UserRepository;

    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
     @RequestMapping("/person/{name}")
     public String getPerson(@PathVariable String name, ModelMap modelMap){
        User user = UserRepository.findByName(name);
        modelMap.put("user", user);
        return "user";
     }

    @RequestMapping("/everybody")
    public String getAllPeople(ModelMap modelMap){
        List<User> everybody = UserRepository.getAllUsers();
        modelMap.put("everybody", everybody);
        return "everybody";
    }


}
