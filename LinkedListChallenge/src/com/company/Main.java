package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Shapeshifter", "Knuckle Puck");
        album.addSong("Gone", 3.20);
        album.addSong("Conduit", 3.33);
        album.addSong("Double Helix", 2.49);
        album.addSong("Twist", 3.22);
        album.addSong("Wait", 3.54);
        albums.add(album);

        album = new Album("The Peace and The Panic", "Neck Deep");
        album.addSong("Wish you were here", 4.02);
        album.addSong("In bloom", 3.02);
        album.addSong("Parachute", 3.12);
        album.addSong("Happy Judgment Day", 2.52);
        album.addSong("19 Seventy Sumthin", 4.12);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Conduit", playlist);
        albums.get(0).addToPlaylist("Gone", playlist);
        albums.get(0).addToPlaylist("High Regard", playlist); // Does not exist
        albums.get(0).addToPlaylist(5, playlist);

        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(0).addToPlaylist(51, playlist); // does not exist

        play(playlist);


    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " +listIterator.next().toString() );
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("You have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (!forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("You are at the start of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("You have reached the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Available actions:\nPress");
        System.out.println("0 - to quit\n"+ "1 - to play next song\n"+ "2 - to play previous song\n"+
                "3 - to replay the current song\n"+ "4 - to list songs in the playlist\n"+ "5 - to print available actions\n" +
                "6 - to delete current song\n");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("*********************************");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("**********************************");
    }
}
