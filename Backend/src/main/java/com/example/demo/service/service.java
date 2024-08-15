package com.example.demo.service;

import com.example.demo.entity.entity;
import com.example.demo.repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing CRUD operations on entities.
 */
@Service
public class service {
    
    // Injects the repository dependency to interact with the database
    @Autowired
    private repo entityRepository;

    /**
     * Saves the given entity to the repository.
     * 
     * @param entity The entity to be saved.
     * @return The saved entity.
     */
    public entity saveEntity(entity entity) {
        return entityRepository.save(entity);
    }

    /**
     * Retrieves all entities from the repository.
     * 
     * @return A list of all entities.
     */
    public List<entity> findAllEntities() {
        return entityRepository.findAll();
    }

    /**
     * Retrieves an entity by its ID.
     * 
     * @param id The ID of the entity to retrieve.
     * @return An Optional containing the entity if found, or an empty Optional if not found.
     */
    public Optional<entity> findEntityById(Long id) {
        return entityRepository.findById(id);
    }

    /**
     * Deletes an entity by its ID.
     * 
     * @param id The ID of the entity to delete.
     */
    public void deleteEntity(Long id) {
        entityRepository.deleteById(id);
    }
}
