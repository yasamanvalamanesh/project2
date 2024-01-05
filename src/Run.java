package com.example.springdatajpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Run implements CommandLineRunner {
    @Autowired
    CcServ CcServ;
    @Override
    public void run(String... args) throws Exception {
        CodingCourse codingcourse=new CodingCourse();
        codingcourse.setId(4L);
        codingcourse.setFirstname("Yasaman");
        codingcourse.setLastname("Valamanesh");
        codingcourse.registerCode("40212330141003");
        CcServ.save(codingcourse);

    }
}
