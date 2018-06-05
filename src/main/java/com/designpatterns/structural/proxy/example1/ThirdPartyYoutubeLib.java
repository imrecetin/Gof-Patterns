package com.designpatterns.structural.proxy.example1;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    
    public HashMap<String, Video> popularVideos();
    public Video getVideo(String videoId);
}
