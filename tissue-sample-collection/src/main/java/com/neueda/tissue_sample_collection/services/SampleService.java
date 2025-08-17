package com.neueda.tissue_sample_collection.services;
import com.neueda.tissue_sample_collection.entities.SampleEntity;
import com.neueda.tissue_sample_collection.exceptions.CollectionNotFoundException;
import com.neueda.tissue_sample_collection.exceptions.SampleNotFoundException;
import com.neueda.tissue_sample_collection.repositories.CollectionRepository;
import com.neueda.tissue_sample_collection.repositories.SampleRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;
    private final CollectionRepository collectionRepository;


    public SampleService(SampleRepository sampleRepository,CollectionRepository collectionRepository){
        this.sampleRepository = sampleRepository;
        this.collectionRepository=collectionRepository;
    }

    public List<SampleEntity> viewByCollectionId(long collectionId){
        List<SampleEntity> samples= sampleRepository.findByCollection_Id(collectionId);
         if (samples.isEmpty()){
             throw new CollectionNotFoundException("Samples of Collection ID "+collectionId+" Not Found");
         }
         return samples;
    }

    public List<SampleEntity> viewSamples(){
        return sampleRepository.findAll();
    }

    public SampleEntity viewBySampleId(long sampleId){
        return sampleRepository.findById(sampleId)
                .orElseThrow(()->new SampleNotFoundException("Samples of ID "+sampleId+" Not Found"));

    }


    public SampleEntity addSample(SampleEntity sampleEntity){

        long collectionId = sampleEntity.getCollection().getId();

        if(collectionRepository.findById(collectionId).isPresent()){

            return sampleRepository.save(sampleEntity);
        }
        throw new CollectionNotFoundException("Collection ID not present");
    }

}
