package com.neueda.tissue_sample_collection.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CollectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String diseaseTerm;

    private String title;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SampleEntity> samples = new ArrayList<>();


    public CollectionEntity(){}


    public CollectionEntity(String diseaseTerm,String title){

        this.diseaseTerm=diseaseTerm;
        this.title = title;

    }

    public String getDiseaseTerm() {
        return diseaseTerm;
    }

    public void setDiseaseTerm(String diseaseTerm) {
        this.diseaseTerm = diseaseTerm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

}
