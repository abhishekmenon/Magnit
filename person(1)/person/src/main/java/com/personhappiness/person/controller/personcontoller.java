package com.personhappiness.person.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin("*")
public class personcontoller {
float sum=0;
    @PostMapping("/person1")
    public int putmapping(@RequestBody Person person){
        
        sum=person.getQuest1()+person.getQuest2()+person.getQuest3()+person.getQuest4()+person.getQuest5()+person.getQuest6();
        /* "Maximum possible score of 6 question is 15"
         * Sum of all score is {sum}
         * 
         * CSAT(%)=(sum/max score) *100
        */
        sum=((sum/15)*100);
        return (int)sum;
    }
    
}
