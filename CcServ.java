package com.example.springdatajpa1;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcServ {
    @Autowired
    CodingCourseRepository codingcourseRepository;
    @Transactional
    public void save(codingcourse codingcourse){
        codingcourseRepository.save(codingcourse);
    }
}
