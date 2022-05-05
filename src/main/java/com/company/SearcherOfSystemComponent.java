package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class SearcherOfSystemComponent {
    public void SearcherOfSystemComponent(List<File> fileList, Collection<Dependency> dependencies) throws FileNotFoundException {
        for (File file : fileList) {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                SystemComponent systemComponent = new SystemComponent(null, null, null, null);
                if (scanner.next().contains("artifactId")) {
                    systemComponent.setArtifactId(scanner.nextLine());
                }
                if (scanner.next().contains("groupId")) {
                    systemComponent.setGroupId(scanner.nextLine());
                }
                if (scanner.next().contains("version")) {
                    systemComponent.setVersion(scanner.nextLine());
                }
                systemComponent.setDependencies(dependencies);
                
                break;
            }
        }
    }
}
