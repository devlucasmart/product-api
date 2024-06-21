package com.devlucasmart.product_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Objects;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<HashMap<String, Object>> getStatus(){
        var response = new HashMap<String, Object>();
        response.put("service", "Product-API");
        response.put("status", "UP");
        response.put("httpStatus", HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }
}
