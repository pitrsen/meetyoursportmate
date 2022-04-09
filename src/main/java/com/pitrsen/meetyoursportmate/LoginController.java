package com.pitrsen.meetyoursportmate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 11.3.2022
 * Time: 9:42
 * Project: meetyoursportmate
 */
@RestController
@RequestMapping("api")
public class LoginController {

    @GetMapping("/login")
    public String greeting() {
        return "Ahoj";
    }

}
