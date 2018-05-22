package com.example.feliphe;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

       try {

           Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
           long size = Files.size(filePath);
           System.out.println(size);
           System.out.println(Files.getLastModifiedTime(filePath));

           BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
           System.out.println(attrs.size());
           System.out.println(attrs.lastModifiedTime());
           System.out.println(attrs.creationTime());
           System.out.println(attrs.isDirectory());
           System.out.println(attrs.isRegularFile());

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//           Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//           Files.createDirectories(dirToCreate);

//           Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//           Files.createFile(fileToCreate);

//           Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir5");
//           Files.createDirectory(dirToCreate);

//           Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//           Files.deleteIfExists(fileToDelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Files.move(fileToMove, destination);


//           Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//           Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//           Files.move(fileToMove, destination);

//           Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//           Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//           Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//           sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//           copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//           Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

       } catch (IOException e){
           e.printStackTrace();
       }


//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
//        System.out.println("**********************************************************");
//
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = Paths.get(".", "files", "SubdirectoryFile.txt");
//        printFile(filePath);
//
//        System.out.println("**********************************************************");
//
//        filePath = Paths.get("D:\\Workspace\\JavaPrograms\\OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2);
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("Z:\\What\\Ever");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
    }

//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }
}
