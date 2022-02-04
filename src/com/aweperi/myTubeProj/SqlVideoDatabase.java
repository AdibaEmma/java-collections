package com.aweperi.myTubeProj;

public class SqlVideoDatabase implements VideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata");
        System.out.println("Title: " + video.getTitle());
        System.out.println("Filename: " + video.getFilename());
        System.out.println("Done!\n");
    }
}
