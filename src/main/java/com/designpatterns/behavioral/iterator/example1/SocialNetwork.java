package com.designpatterns.behavioral.iterator.example1;

public interface SocialNetwork {
    
    public ProfileIterator createFriendsIterator(String profileEmail);

    public ProfileIterator createCoworkersIterator(String profileEmail);
}
