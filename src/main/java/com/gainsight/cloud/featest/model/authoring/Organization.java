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
 * An organization is a wrapper around multiple projects
 * <p>
 * It can be seen as Theme/Team kind of an entity
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String organizationName;
    private List<Project> projects;
}
