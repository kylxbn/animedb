package com.orthocube.animedb.model.people;

import com.orthocube.animedb.model.multilang.Name;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class AnimeCharacter extends Person {
    private final ObjectProperty<Staff> actor;

    public AnimeCharacter() {
        this.setName(new Name());
        actor = new SimpleObjectProperty<>(new Staff());
    }

    public AnimeCharacter(Name name, Staff actor) {
        this.setName(name);
        this.actor = new SimpleObjectProperty<>(actor);
    }

    public Staff getActor() {
        return actor.get();
    }

    public void setActor(Staff actor) {
        this.actor.set(actor);
    }

    public ObjectProperty<Staff> actorProperty() {
        return actor;
    }
}
