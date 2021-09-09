package com.example.test0101.api;

import com.example.test0101.model.model3_7;
import com.example.test0101.model.model3_7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

@RestController
@RequestMapping("/api")
public class sczApi {
    @Autowired
    private model3_7Repository model3_7repository;

    sczApi(model3_7Repository repository) {
        this.model3_7repository = repository;
    }
}
