package com.ajsherrell.javajokes;

import java.util.Random;

public class JavaJokes {

    // array of random jokes
    private final String jokesArray[] = {
            "Joke number one ",
            "A second joke ",
            "Jokey Jokerson ",
            "Jokeman Jones ",
            "Jokey McJokeface ",
            "Joke fourteen! ",
            "Joke the Third"
    };

    public String getJoke() {
        return jokesArray[new Random().nextInt(jokesArray.length)];
    }

}
