package com.company;

import java.util.Collection;

public class SystemComponent {
    //реальные компоненты системы атрибуты: artifactId, groupId, version, dependencies.
    String artifactId;
    String groupId;
    String version;
    Collection<Dependency> dependencies;


    public SystemComponent(String artifactId, String groupId, String version, Collection<Dependency> dependencies) {
        this.artifactId = artifactId;
        this.groupId = groupId;
        this.version = version;
        this.dependencies = dependencies;
    }



}
