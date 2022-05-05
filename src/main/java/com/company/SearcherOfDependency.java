package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class SearcherOfDependency {
    public void SearcherOfDependency(List<File> fileList, Collection<Dependency> dependencies) throws FileNotFoundException {

        for (File file : fileList) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (scanner.next().contains("<dependency>")) {
                    Dependency dependency = new Dependency(null, null, null);
                    if (scanner.next().contains("groupId")) {
                        dependency.setGroupId(scanner.nextLine());
                    }
                    if (scanner.next().contains("artifactId")) {
                        dependency.setArtifactId(scanner.nextLine());
                    }
                    if (scanner.next().contains("version")) {
                        dependency.setVersion(scanner.nextLine());

                    }
                    dependencies.add(dependency);
                    break;
                }
            }

        }
    }
}

