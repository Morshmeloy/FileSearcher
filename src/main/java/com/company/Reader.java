package com.company;

import java.io.*;
import java.util.Collection;
import java.util.List;

public class Reader {
    public static void reader(List<File> fileList, Collection<Dependency> dependencies) {
        for (File file : fileList) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String line;

                while (((line = reader.readLine()) != null)) {
                    if (line.contains("<dependency>")) {
                        Dependency dependency = new Dependency(null, null, null);
                        /* System.out.println(line);*/
                        line = reader.readLine();
                        if (line.contains("<groupId>")) {
                            dependency.setGroupId(line);/*System.out.println(line);*/
                            line = reader.readLine();
                        }
                        if (line.contains("<artifactId>")) {
                            dependency.setArtifactId(line);/*System.out.println(line);*/
                            line = reader.readLine();
                        }
                        if (line.contains("<version>")) {
                            dependency.setVersion(line);/*System.out.println(line);*/
                        }
                        dependencies.add(dependency);
                        line = reader.readLine();

                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readSystemComponent(List<File> fileList, Collection<Dependency> dependencies, Collection<SystemComponent> systemComponents) {
        for (File file : fileList) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String line;
                SystemComponent systemComponent = new SystemComponent(null, null, null, null);
                while (((line = reader.readLine()) != null)) {
                    /* System.out.println(line);*/
                    if (line.contains("<groupId>")) {
                        systemComponent.setGroupId(line);/*System.out.println(line);*/
                        line = reader.readLine();
                    }
                    if (line.contains("<artifactId>")) {
                        systemComponent.setArtifactId(line);/*System.out.println(line);*/
                        line = reader.readLine();
                    }
                    if (line.contains("<version>")) {
                        systemComponent.setVersion(line);/*System.out.println(line);*/
                        systemComponent.setDependencies(dependencies);
                        systemComponents.add(systemComponent);
                        break;
                    }

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

