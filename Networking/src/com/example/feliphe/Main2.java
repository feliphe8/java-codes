package com.example.feliphe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main2 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");

            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line = "";

            while (line != null){
                line = inputStream.readLine();
                System.out.println(line);
            }

            inputStream.close();

//            URI uri = url.toURI();

//            URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

//            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations?zip=12345");
//
//            URI resolvedURI1 = baseUri.resolve(uri1);
//            URI resolvedURI2 = baseUri.resolve(uri2);
//            URI resolvedURI3 = baseUri.resolve(uri3);
//
//            URL url1 = resolvedURI1.toURL();
//            URL url2 = resolvedURI2.toURL();
//            URL url3 = resolvedURI3.toURL();
//
//            System.out.println("URL 1 = " + url1);
//            System.out.println("URL 2 = " + url2);
//            System.out.println("URL 3 = " + url3);
//
//            URI relativeizedURI = baseUri.relativize(resolvedURI2);
//            System.out.println("Relative URI = " + relativeizedURI);

//            System.out.println("Scheme: " + uri.getScheme());
//            System.out.println("Scheme specific-part: " + uri.getSchemeSpecificPart());
//            System.out.println("Authority: " + uri.getAuthority());
//            System.out.println("User info: " + uri.getUserInfo());
//            System.out.println("Host: " + uri.getHost());
//            System.out.println("Port: " + uri.getPort());
//            System.out.println("Path: " + uri.getPath());
//            System.out.println("Query: " + uri.getQuery());
//            System.out.println("Fragment: " + uri.getFragment());

//        } catch (URISyntaxException e){
//            System.out.println("URI error: " + e.getMessage());
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
