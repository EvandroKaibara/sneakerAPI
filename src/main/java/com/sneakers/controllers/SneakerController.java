package com.sneakers.controllers;

import com.sneakers.models.Sneaker;
import com.sneakers.services.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/sneakers")
public class SneakerController {
    @Autowired
    private SneakerService sneakerService;

    //Endpoint: http://localhost:5432/sneakers
    @GetMapping
    public ResponseEntity<List<Sneaker>> getAllSneakers(){
        return ResponseEntity.ok(sneakerService.listAllSneakers());
    }

    //Endpoint: http://localhost:5432/sneakers
    @PostMapping
    public ResponseEntity<String> postSneaker(@RequestBody Sneaker sneaker){
        sneakerService.createSneaker(sneaker);

        return ResponseEntity.ok("Sneaker criado com sucesso!");
    }
}
