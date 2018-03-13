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
 * A project is a collection of related features to test
 * <p>
 * It can be seen as Module kind of an entity
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String projectName;
    private List<Feature> features;
}
