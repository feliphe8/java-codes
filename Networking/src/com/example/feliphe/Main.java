package com.example.feliphe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=cats");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("User-Agent", "Chrome");
            urlConnection.setReadTimeout(30000);

            int responseCode = urlConnection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if (responseCode != 200){
                System.out.println("Error reading webpage");
                System.out.println(urlConnection.getResponseMessage());
                return;
            }

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            while ((line = inputReader.readLine()) != null){
                System.out.println(line);
            }

            inputReader.close();



//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//
//            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//            for (Map.Entry<String, List<String>> entry: headerFields.entrySet()){
//                String key = entry.getKey();
//                List<String> values = entry.getValue();
//                System.out.println("-----------Key = " + key);
//                for (String value: values){
//                    System.out.println("Value = " + value);
//                }
//            }

//            String line = "";
//
//            while (line != null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//
//            inputStream.close();

        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
