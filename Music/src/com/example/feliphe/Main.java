package com.example.feliphe;

import com.example.feliphe.model.Artist;
import com.example.feliphe.model.Datasource;
import com.example.feliphe.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if (artists == null){
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists){
            System.out.println("ID: " + artist.getId() + " - Name: " + artist.getName());
        }

        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Pink Floyd", Datasource.ORDER_BY_ASC);
        for (String album: albumsForArtist){
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
        if (songArtists == null){
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist songArtist: songArtists){
            System.out.println("Artist name: " + songArtist.getArtistName() + " | Album name: " + songArtist.getAlbumName() +
            "|  Track: " + songArtist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongArtists();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter song title: ");
//        String title = scanner.nextLine();
//
//
//        songArtists = datasource.querySongInfoView(title);
//        if (songArtists.isEmpty()){
//            System.out.println("Coldn't find the artist for the song");
//        }
//
//        for (SongArtist artist: songArtists){
//            System.out.println("From View - Artist name: " + artist.getArtistName() + " | Album name: " + artist.getAlbumName() +
//            " | Track: " + artist.getTrack());
//        }


        datasource.insertSong("Gone", "Knuckle Puck", "Shapeshifter", 4);

        datasource.close();
    }
}
