package com.gainsight.cloud.featest.service;

import com.gainsight.cloud.featest.repository.TestPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestPlanServiceImpl implements TestPlanService {

    @Autowired
    public TestPlanServiceImpl(TestPlanRepository testPlanRepository) {
    }
}
