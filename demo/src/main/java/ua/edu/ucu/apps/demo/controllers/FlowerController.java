package ua.edu.ucu.apps.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerPack;

import java.util.List;



@RequestMapping(path = "/api/v1/flower") @RestController
public class FlowerController {

    @GetMapping
    public List<Flower> hello(){
        Flower flower = new Flower(12.5, FlowerColor.RED, 100);
        return List.of(flower);
    }

}