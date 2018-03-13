package com.gainsight.cloud.featest.model.execution;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

/**
 * A Release is a collection of TestPlans from each Project measuring the overall test status for a deployment
 * <p>
 * Release is a metrics tracking entity for a measure of how the complete Product as a whole is tested
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Release {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String releaseName;
    private String releaseVersion;
    private Set<TestPlan> testPlans;

}
