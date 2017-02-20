package com.company.Behavional.Memento;

public class MementoRunner {

    public static void main(String[] args) {
	Game game = new Game();
        game.set("Level 1", 10);
        System.out.println(game);


        File file =  new File();
        file.setSave(game.save());

        game.set("Level 2", 20);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);
    }
}
