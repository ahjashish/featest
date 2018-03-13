package com.gainsight.cloud.featest.repository;

import com.gainsight.cloud.featest.model.execution.FeatureGroup;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureGroupRepository extends ReactiveMongoRepository<FeatureGroup, String> {
}
