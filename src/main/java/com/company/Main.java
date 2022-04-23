package com.company;

import java.io.File;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the root folder ");
        String Path = scanner.nextLine();
        SearcherOfFiles.searchFiles(new File(Path), fileList);
        System.out.println("pom.xml files:");
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }



    }

}