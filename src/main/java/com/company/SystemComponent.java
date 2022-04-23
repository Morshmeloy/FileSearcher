package com.company;

import java.util.Collection;

public class SystemComponent {
    //реальные компоненты системы атрибуты: artifactId, groupId, version, dependencies.
    String artifactId;
    String groupId;
    String version;
    Collection <Dependency> dependencies;


    public SystemComponent(Dependency dependency) {
        this.artifactId = dependency.artifactId;
        this.groupId = dependency.groupId;
        this.version = dependency.version;
        //this.dependencies=

    }
}
