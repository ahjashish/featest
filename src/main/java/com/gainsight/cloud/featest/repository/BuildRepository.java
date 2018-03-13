package com.gainsight.cloud.featest.repository;

import com.gainsight.cloud.featest.model.execution.Build;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildRepository extends ReactiveMongoRepository<Build, String> {
}
