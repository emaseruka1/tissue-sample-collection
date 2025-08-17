package com.neueda.tissue_sample_collection.services;
import com.neueda.tissue_sample_collection.entities.CollectionEntity;
import com.neueda.tissue_sample_collection.exceptions.CollectionNotFoundException;
import com.neueda.tissue_sample_collection.repositories.CollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {

    private final CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository){
        this.collectionRepository=collectionRepository;
    }

   public List<CollectionEntity> viewCollections(){ return collectionRepository.findAll();
   }

   public CollectionEntity addCollection(CollectionEntity collection){
        return collectionRepository.save(collection);
   }

   public CollectionEntity findById(long id){
        return collectionRepository.findById(id)
                .orElseThrow(()->new CollectionNotFoundException("Collection of ID "+id+" Not Found"));
   }

}
