package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<File> fileList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Specify the root folder ");
        String Path=scanner.nextLine();
        searchFiles(new File(Path),fileList);
        System.out.println("pom.xml files:");
        for(File file:fileList){
            System.out.println(file.getAbsolutePath());
        }


    }
    public static void searchFiles(File rootFile, List<File>fileList){
        if(rootFile.isDirectory()){
            System.out.println("Search in : "+rootFile.getAbsolutePath());
            File[] directoryFiles=rootFile.listFiles();
            if(directoryFiles !=null){
                for(File file:directoryFiles){
                    if(file.isDirectory()){
                        searchFiles(file,fileList);
                    }
                    else{
                        if(file.getName().matches("pom.xml"))
                        {
                            fileList.add(file);
                        }
                    }
                }}
        }
    }
}
