
package com.findr.restserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/secured")
    public String test() {
        return "{\"message\": \"This is a secured endpoint!\"}";
    }

    @PostMapping("/chat")
    public String chat() {
        return "{\"message\": \"This is chat with findr!\"}";
    }

}
