package com.timbuchalka;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");  // FileTree\\Dir2 (windows)
        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");  // FileTree\\Dir2 (windows)

        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myapp", ".appxt");
            System.out.println(tempFile.toAbsolutePath());
        } catch (IOException e){
            e.getMessage();
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores){
            System.out.println(store);
            System.out.println(store.name());
        }

        System.out.println("*******************************************************");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths){
            System.out.println(path);
        }
        System.out.println("*******************************************************");

        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e){
            e.getMessage();
        }

        System.out.println("*******************************************************");

        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dor2Copy");
        // FileTree\\Dir4\\Dir2Copy

        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("*******************************************************");

        File file = new File("\\Examples\\file.txt");
        Path convertedPath = file.toPath();
        System.out.println(convertedPath);

        File parent = new File("\\Examples");
        File resolvedFile = new File(parent, "dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("\\Examples", "dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("\\Examples");
        Path childRelativePath = Paths.get("dir\\file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory: " + workingDirectory.getAbsolutePath());

        System.out.println("*******************************************************");

        File dir2File = new File(workingDirectory, "\\FileTree\\Dir2");
        String[] dir2Contents = dir2File.list();
        for (int i=0; i< dir2Contents.length; i++){
            System.out.println("i = " + i + ": " + dir2Contents[i]);
        }

        System.out.println("*******************************************************");

        File[] dir2Files = dir2File.listFiles();
        for (int i=0; i< dir2Files.length; i++){
            System.out.println("i = " + i + ": " + dir2Files[i].getName());
        }


    }
}
