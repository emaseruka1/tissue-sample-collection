package com.neueda.tissue_sample_collection.exceptions;


public class CollectionNotFoundException extends RuntimeException {

    public CollectionNotFoundException(String message){
        super(message);
    }
}
