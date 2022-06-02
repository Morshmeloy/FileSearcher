package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<File> fileList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the root folder ");
        String Path = scanner.nextLine();
        SearcherOfFiles.searchFiles(new File(Path), fileList);
        System.out.println("pom.xml files:");
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }
        Collection<Dependency> dependencies = new ArrayList<>();
        Reader.reader(fileList, dependencies);
     /*   for (Dependency dependency:dependencies){
            System.out.println(dependency.getGroupId());
            System.out.println(dependency.getArtifactId());
            System.out.println(dependency.getVersion());
        }*/
        Collection<SystemComponent> systemComponents = new ArrayList<>();
        Reader.readSystemComponent(fileList, dependencies, systemComponents);
        for (SystemComponent systemComponent : systemComponents) {
            System.out.println(systemComponent.getGroupId());
            System.out.println(systemComponent.getArtifactId());
            System.out.println(systemComponent.getVersion());
            for (Dependency dependency : dependencies) {
                System.out.println(dependency.getGroupId());
                System.out.println(dependency.getArtifactId());
                System.out.println(dependency.getVersion());
            }
        }
    }
}