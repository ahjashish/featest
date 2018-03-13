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
 * A TestPlan is a collection of Builds run to test a Project continuously over an interval
 * <p>
 * TestPlan is a metrics tracking entity for a measure of how module/project is tested for a Release
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class TestPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String testPlanName;
    private Set<Build> builds;
}
