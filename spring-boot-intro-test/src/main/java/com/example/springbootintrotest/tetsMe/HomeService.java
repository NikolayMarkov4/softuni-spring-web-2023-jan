//package com.example.springbootintrotest.tetsMe;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class HomeService {
//    private final Animal cat;
//    private final Animal dog;
//    private final List<Animal> animals;
//
//    @Autowired
//    public HomeService(@Qualifier("createCat") Animal cat,
//                       Animal dog,
//                       List<Animal> animals) {
//        System.out.println("I'm in home");
//        this.animals = animals;
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
//        System.out.println("list of animals activities");
//        this.animals.forEach(Animal::makeSound);
//    }
//}
