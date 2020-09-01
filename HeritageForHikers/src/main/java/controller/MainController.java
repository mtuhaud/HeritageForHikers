package controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	
    @RequestMapping("/")
    public String welcome() {
        return "accueil-login";
    }

}
