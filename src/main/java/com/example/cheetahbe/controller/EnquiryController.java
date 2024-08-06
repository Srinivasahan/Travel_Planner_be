package com.example.cheetahbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.cheetahbe.model.Enquiry;
import com.example.cheetahbe.service.EnquiryService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class EnquiryController {

    @Autowired
    private EnquiryService enquiryService;

    @PostMapping("/enquiry")
    public ResponseEntity<?> submitEnquiry(@RequestBody Enquiry enquiry) {
        enquiryService.saveEnquiry(enquiry);
        return ResponseEntity.ok("Enquiry submitted successfully");
    }
}
