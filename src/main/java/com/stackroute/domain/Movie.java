package com.stackroute.domain;

public class Movie {

    Actor actor, actor1;

    public Movie() {
    }

    //Movie constructor for initializing
    public Movie(Actor actor, Actor actor1) {
        this.actor = actor;
        this.actor1 = actor1;
    }

    //Setters
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActor1(Actor actor1) {
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
