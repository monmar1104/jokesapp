package com.monmar.jokes.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServicesImpl implements JokeService {

    public final ChuckNorrisQuotes chuckNorrisQuotes;


    public JokeServicesImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }




    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
