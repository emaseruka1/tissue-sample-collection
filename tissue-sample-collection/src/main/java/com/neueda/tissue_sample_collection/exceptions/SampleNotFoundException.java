package com.neueda.tissue_sample_collection.exceptions;

public class SampleNotFoundException extends RuntimeException{

    public SampleNotFoundException(String message){
        super(message);
    }
}
