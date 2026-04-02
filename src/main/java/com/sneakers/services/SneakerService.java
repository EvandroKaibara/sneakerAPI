package com.sneakers.services;

import com.sneakers.models.Sneaker;
import com.sneakers.repositories.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SneakerService {
    @Autowired
    private SneakerRepository sneakerRepository;

    public List<Sneaker> listAllSneakers(){
        List<Sneaker> allSneakers = new ArrayList<>();
        sneakerRepository.findAll().forEach(sneaker -> {
            allSneakers.add(sneaker);
            System.out.println(sneaker);
        });

        return allSneakers;
    }

    public Sneaker createSneaker(Sneaker sneaker){
        return sneakerRepository.save(sneaker);
    }
}
