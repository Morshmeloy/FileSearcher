package com.company;

public class SystemComponent {
    //реальные компоненты системы атрибуты: artifactId, groupId, version, dependencies.
    String artifactId;
    String groupId;
    String version;
    String dependencies;


 SystemComponent

    public SystemComponent(Dependency dependency) {
        this.artifactId = dependency.artifactId;
        this.groupId = dependency.groupId;
        this.version = dependency.version;
        //this.dependencies=

    }
}
