package com.neueda.tissue_sample_collection.controllers;

import com.neueda.tissue_sample_collection.entities.SampleEntity;
import com.neueda.tissue_sample_collection.services.SampleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/samples")
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService){
        this.sampleService=sampleService;
    }

    @GetMapping
    public List<SampleEntity> viewSamples(){
        return sampleService.viewSamples();
    }

    @GetMapping("/collection/{collectionId}")
    public List<SampleEntity> viewSampleByCollectionId(@PathVariable long collectionId){
        return sampleService.viewByCollectionId(collectionId);
    }

    @GetMapping("/{sampleId}")
    public SampleEntity viewSampleId(@PathVariable long sampleId){
        return sampleService.viewBySampleId(sampleId);
    }

    @PostMapping
    public SampleEntity addNewSample(@RequestBody SampleEntity sampleEntity){
        return sampleService.addSample(sampleEntity);
    }




}
