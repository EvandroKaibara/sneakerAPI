package com.sneakers.repositories;

import com.sneakers.models.Sneaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SneakerRepository extends CrudRepository<Sneaker, UUID> {
}
