package com.designpatterns.behavioral.state.example1;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        PlayerUI ui = new PlayerUI(player);
        ui.init();
    }
}
