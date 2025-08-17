package com.neueda.tissue_sample_collection.repositories;
import com.neueda.tissue_sample_collection.entities.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity,Long> {

    List<SampleEntity> findByCollection_Id(long collectionId);
}
