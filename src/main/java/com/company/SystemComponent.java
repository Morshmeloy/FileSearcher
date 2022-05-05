package com.company;

import java.util.Collection;

public class SystemComponent {
    //реальные компоненты системы атрибуты: artifactId, groupId, version, dependencies.
    String artifactId;
    String groupId;
    String version;
    Collection<Dependency> dependencies;

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Collection<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Collection<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public SystemComponent(String artifactId, String groupId, String version, Collection<Dependency> dependencies) {
        this.artifactId = artifactId;
        this.groupId = groupId;
        this.version = version;
        this.dependencies = dependencies;
    }
    public void ShowSystemComponent(){
        System.out.println(artifactId);
        System.out.println(groupId);
        System.out.println(version);
        System.out.println(dependencies);
    }

}
