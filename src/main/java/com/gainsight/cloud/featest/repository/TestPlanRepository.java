package com.gainsight.cloud.featest.repository;

import com.gainsight.cloud.featest.model.execution.TestPlan;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestPlanRepository extends ReactiveMongoRepository<TestPlan, String> {
}
