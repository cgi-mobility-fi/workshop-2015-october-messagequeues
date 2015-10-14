package com.cgi.workshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProjectNameRestController {
	@Value("${message}")
    private String message1;

    @RequestMapping("/message3")
    String message3() {
        return this.message1;
    }
}
