package com.example.cheetahbe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cheetahbe.model.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
}
