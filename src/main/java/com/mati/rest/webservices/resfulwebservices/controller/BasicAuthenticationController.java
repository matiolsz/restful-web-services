package com.mati.rest.webservices.resfulwebservices.controller;

import com.mati.rest.basicAuth.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean2() {
        return new AuthenticationBean("you are authenticated");
    }

}
