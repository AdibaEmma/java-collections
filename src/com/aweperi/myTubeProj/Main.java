package com.aweperi.myTubeProj;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFilename("emma_accra.mp4");
        video.setTitle("Emma Holiday");
        video.setUser(new User("eabaagah@gmail.com"));

        var videoEncoder = new VideoEncoderImpl();
        var sqlVideoDatabase = new SqlVideoDatabase();
        var emailNotification = new EmailNotification();

        var videoProcessor = new VideoProcessor(videoEncoder, sqlVideoDatabase, emailNotification);
        videoProcessor.process(video);
    }
}
