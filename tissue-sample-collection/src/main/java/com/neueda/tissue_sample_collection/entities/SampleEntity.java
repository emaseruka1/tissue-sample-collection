package com.neueda.tissue_sample_collection.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long donorCount;
    private String materialType;
    private LocalDateTime lastUpdated;

    @ManyToOne
    @JoinColumn(name = "collectionId",nullable=false)
    private CollectionEntity collection;

    public SampleEntity(){}

    public SampleEntity(long donorCount,CollectionEntity collection,String materialType,LocalDateTime lastUpdated){

        this.donorCount=donorCount;
        this.materialType=materialType;
        this.lastUpdated=lastUpdated;
        this.collection=collection;

    }

    public long getDonorCount() {
        return donorCount;
    }

    public void setDonorCount(long donorCount) {
        this.donorCount = donorCount;
    }


    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public long getId() {
        return id;
    }

    public CollectionEntity getCollection() {
        return collection;
    }

    public void setCollection(CollectionEntity collection) {
        this.collection = collection;
    }
}
