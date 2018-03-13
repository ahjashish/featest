package com.gainsight.cloud.featest.service;

import com.gainsight.cloud.featest.repository.FeatureGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureGroupServiceImpl implements FeatureGroupService {

    @Autowired
    public FeatureGroupServiceImpl(FeatureGroupRepository featureGroupRepository) {
    }
}
