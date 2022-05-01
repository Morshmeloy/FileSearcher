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
        SearcherOfDependency.SearcherOfDependency(fileList,dependencies);
        System.out.println(dependencies.isEmpty());



    }


}