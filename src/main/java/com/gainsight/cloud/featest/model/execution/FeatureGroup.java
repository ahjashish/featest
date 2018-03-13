package com.gainsight.cloud.featest.model.execution;

import com.gainsight.cloud.featest.model.authoring.Feature;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * A FeatureGroup is a collection of Features that belong together with respect to a functionality
 * <p>
 * FeatureGroup is a folder like construct to store multiple features based on similar functional domain
 */


@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class FeatureGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String featureGroupName;
    private List<Feature> features;
}
