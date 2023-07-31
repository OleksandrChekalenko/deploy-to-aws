package com.chelex.deploytoaws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("hey test aws deploy");
    }
}
