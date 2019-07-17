package com.stackroute.domain;

public class Movie {

    Actor actor, actor1;

    //Movie constructor
    public Movie(Actor actor, Actor actor1) {
        this.actor = actor;
        this.actor1 = actor1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actor1=" + actor1 +
                '}';
    }
}
