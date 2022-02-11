package appbackend.studentsschool.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value="/app/v1")
public class schoolController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hola mundo";
    }

}
