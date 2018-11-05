package hizhangbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hizhangbo
 */
@RequestMapping("/home")
@RestController
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "provider index";
    }
}
