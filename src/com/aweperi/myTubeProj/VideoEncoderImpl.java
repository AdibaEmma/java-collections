package com.aweperi.myTubeProj;

public class VideoEncoderImpl implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding...");
        System.out.println("Done");
    }
}
