package org.lunguda.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index() { return "Hello, Welcome Home!";}

    @GetMapping("/secured")
    public String secure(){ return "Secured Point";}
}
