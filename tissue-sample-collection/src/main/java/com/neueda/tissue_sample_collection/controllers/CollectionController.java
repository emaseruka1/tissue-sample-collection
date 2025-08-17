package com.neueda.tissue_sample_collection.controllers;

import com.neueda.tissue_sample_collection.entities.CollectionEntity;
import com.neueda.tissue_sample_collection.services.CollectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collections")
public class CollectionController {

    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService){
        this.collectionService=collectionService;
    }
    @GetMapping
    public List<CollectionEntity> viewAllCollections(){
        return collectionService.viewCollections();
    }

    @GetMapping("/{collectionId}")
    public CollectionEntity findCollectionId(@PathVariable long collectionId){
        return collectionService.findById(collectionId);
    }

    @PostMapping
    public CollectionEntity addNewCollection(@RequestBody CollectionEntity collectionEntity){
        return collectionService.addCollection(collectionEntity);
    }

}
