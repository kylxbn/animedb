package xyz.orthocube.animedb.model.data;

import xyz.orthocube.animedb.model.multilang.Description;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Position {
    private final IntegerProperty id;

    private final ObjectProperty<Description> position;

    public Position(int id) {
        this(id, new Description());
    }

    public Position(int id, Description desc) {
        this.id = new SimpleIntegerProperty(id);
        this.position = new SimpleObjectProperty<>(desc);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public Description getPosition() {
        return position.get();
    }

    public void setPosition(Description position) {
        this.position.set(position);
    }

    public ObjectProperty<Description> positionProperty() {
        return position;
    }
}
