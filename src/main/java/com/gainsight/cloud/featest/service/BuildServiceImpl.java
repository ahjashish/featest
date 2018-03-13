package com.gainsight.cloud.featest.service;

import com.gainsight.cloud.featest.repository.BuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildServiceImpl implements BuildService {

    @Autowired
    public BuildServiceImpl(BuildRepository buildRepository) {
    }
}
