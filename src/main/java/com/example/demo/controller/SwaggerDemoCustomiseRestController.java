package com.example.demo.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Identifier;

@RestController
@RequestMapping("apis/customise")
public class SwaggerDemoCustomiseRestController {

    @GetMapping("{identifier}")
    public String detail(@RequestHeader("X-Customise-Header") String customiseHeader,
                         @PathVariable("identifier") Identifier identifier,
                         @RequestParam(value = "name", required = false) String name,
                         @RequestParam("limit") int limit) {
        return identifier.value();
    }
}
