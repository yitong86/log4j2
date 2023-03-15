package com.javadevjournal.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoggingDemoController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/greeting") public String sayHello() {
        log.debug("Debugging log in our greeting method");
        log.info("Info log statement for LoggingDemoController");
        log.warn("Warn log statement for LoggingDemoController");
        log.error("Error log statement for LoggingDemoController");
        return "greeting";

    }
}
