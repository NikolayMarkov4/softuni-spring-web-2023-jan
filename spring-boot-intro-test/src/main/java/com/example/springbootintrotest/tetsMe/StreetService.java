//package com.example.springbootintrotest.tetsMe;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StreetService {
//    private final Animal cat;
//    private final Animal dog;
//
//    public StreetService(Animal dog, @Qualifier("createCat") Animal cat) {
//        System.out.println("I'm on the street.");
//        this.cat = cat;
//        this.dog = dog;
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        System.out.println("post construct of home");
//        this.cat.makeSound();
//        this.dog.makeSound();
//        System.out.println(this.cat.hashCode());
//        System.out.println(this.dog.hashCode());
//    }
//}
