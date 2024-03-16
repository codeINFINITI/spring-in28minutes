package com.jagyasi.spring01.game;

public class GameRunner {
    ContraGame game;
    public GameRunner(ContraGame game) {
        this.game=game;
    }

    public void run() {
        System.out.println("running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
