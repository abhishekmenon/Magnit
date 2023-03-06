package com.personhappiness.person.controller;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Person {
    private ArrayList<Integer> quest1;
    private int quest2;
    private ArrayList<Integer> quest3;
    private int quest4;
    private int quest5;
    private int quest6;
    public Person() {
    }
        
    public Person(String json) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println();
        this.quest1 = person.quest1;
        this.quest2 = person.quest2;
        this.quest3 = person.quest3;
        this.quest4 = person.quest4;
        this.quest5 = person.quest5;
        this.quest6 = person.quest6;
    }

    public int getQuest1() {
        return this.quest1.get(0);
    }


    public int getQuest2() {
        return this.quest2;
    }


    public int getQuest3() {
        return this.quest3.get(0);
    }


    public int getQuest4() {
        return this.quest4;
    }


    public int getQuest5() {
        return this.quest5;
    }


    public int getQuest6() {
        return this.quest6;
    }


    
/* 
    public List<Integer> objectToInteger(List<Object> arr){
        List<Integer> result = new ArrayList<>();
        for(Object x:arr){
            if(x instanceof String){
                result.add(Integer.parseInt((String) x));
            }
            if(x instanceof List){
                result.addAll(objectToInteger((List<Object>) x));
            }
            else if (x instanceof Integer) {
            result.add((Integer) x);
        }

        }
        return result;

    }
    */

   

   
    
}
