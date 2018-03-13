package com.gainsight.cloud.featest.model.authoring;

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
 * A Feature is a collection of related scenarios to test a functional feature
 * <p>
 * It can be seen as Test Suite kind of an entity wrapping similar test cases
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String featureName;
    private String featureDescription;
    private List<Scenario> scenarios;
    private List<String> featureTags;
}
