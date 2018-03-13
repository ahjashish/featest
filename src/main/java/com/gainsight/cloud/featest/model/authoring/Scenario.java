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
 * A Scenario is an atomic unit of testing pertaining to a use case for a functionality
 * <p>
 * It can be seen as Test Case kind of an entity wrapping steps needed to run a test
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String scenarioName;
    private List<String> scenarioTags;

}
