package appbackend.studentsschool.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class schoolController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hola mundo";
    }

}
