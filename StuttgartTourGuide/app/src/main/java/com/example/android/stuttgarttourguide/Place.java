package com.example.android.stuttgarttourguide;

public class Place {

    private int imageId;
    private String tv1;
    private String tv2;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String tv1,String tv2){

        this.tv1=tv1;
        this.tv2=tv2;
    }

    public Place(int imageId, String tv1,String tv2){
        this.imageId=imageId;
        this.tv1=tv1;
        this.tv2=tv2;
    }

    @Override
    public String toString() {
        return "Place{" +
                "image=" +
                ", tv1='" + tv1 + '\'' +
                ", tv2='" + tv2 + '\'' +
                '}';
    }

    public String getTv1() {
        return tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public int getImageId(){
        return imageId;
    }

    public boolean hasImage(){
        return imageId != NO_IMAGE_PROVIDED;
    }
}
