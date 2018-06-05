package com.designpatterns.structural.facade.example1;

public class CodecFactory {
    
    private static CodecFactory instance;
    
    private CodecFactory(){}
    
    public static CodecFactory getInstance(){
        if (instance==null) {
            instance=new CodecFactory();
        }
        return instance;
    }
    
    public Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
