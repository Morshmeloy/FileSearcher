package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class SearcherOfDependency {
    public static void SearcherOfDependency(List<File> fileList,Collection<Dependency> dependencies) throws FileNotFoundException {

        for (File file : fileList) {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (scanner.nextLine().matches("<dependency>")) {
                    Dependency dependency = null;
                    while(scanner.nextLine()!=("</dependency>")) {
                        switch (scanner.nextLine()) {
                            case ("groupId"):
                                dependency.setGroupId(scanner.nextLine());
                                break;
                            case ("artifactId"):
                                dependency.setArtifactId(scanner.nextLine());
                                break;
                            case ("version"):
                                dependency.setVersion(scanner.nextLine());
                                break;


                        }
                        dependencies.add(dependency);
                    }
                }

            }
        }
    }
}
