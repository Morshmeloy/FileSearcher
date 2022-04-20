package com.company;

import java.io.File;
import java.util.List;

public class searchFiles {
    public static void SearchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("Search in : " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        SearchFiles(file, fileList);
                    } else {
                        if (file.getName().matches("pom.xml")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}