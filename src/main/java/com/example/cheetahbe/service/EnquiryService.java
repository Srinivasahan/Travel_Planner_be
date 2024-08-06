package com.example.cheetahbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.cheetahbe.model.Enquiry;
import com.example.cheetahbe.repo.EnquiryRepository;

@Service
public class EnquiryService {

    @Autowired
    private EnquiryRepository enquiryRepository;

    public Enquiry saveEnquiry(Enquiry enquiry) {
        return enquiryRepository.save(enquiry);
    }
}
