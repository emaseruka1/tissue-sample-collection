package com.neueda.tissue_sample_collection.repositories;
import com.neueda.tissue_sample_collection.entities.CollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository extends JpaRepository<CollectionEntity,Long> {}
