package com.gainsight.cloud.featest.service;

import com.gainsight.cloud.featest.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    public ReleaseServiceImpl(ReleaseRepository releaseRepository) {
    }
}
