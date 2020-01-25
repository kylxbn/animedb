package com.orthocube.animedb.model.people;

import com.orthocube.animedb.model.data.Position;
import com.orthocube.animedb.model.multilang.Description;
import com.orthocube.animedb.model.multilang.Name;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;

public class Staff extends Person {
    private final ObjectProperty<Position> position;

    public Staff() {
        super();
        this.position = new SimpleObjectProperty<>(null);
    }

    public Staff(Position position) {
        super();
        this.position = new SimpleObjectProperty<>(position);
    }

    public Staff(Name name, LocalDate birthdate, Name birthplace, Description desc, Position position) {
        super(name, birthdate, birthplace, desc);
        this.position = new SimpleObjectProperty<>(position);
    }

    public Position getPosition() {
        return position.get();
    }

    public void setPosition(Position position) {
        this.position.set(position);
    }

    public ObjectProperty<Position> positionProperty() {
        return position;
    }
}
