package xyz.orthocube.animedb.model.data;

import xyz.orthocube.animedb.model.multilang.Description;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Demographic {
    private final IntegerProperty id;

    private final ObjectProperty<Description> demographic;

    public Demographic(int id) {
        this(id, new Description());
    }

    public Demographic(int id, Description desc) {
        this.id = new SimpleIntegerProperty(id);
        this.demographic = new SimpleObjectProperty<>(desc);
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

    public Description getDemographic() {
        return demographic.get();
    }

    public void setDemographic(Description demographic) {
        this.demographic.set(demographic);
    }

    public ObjectProperty<Description> demographicProperty() {
        return demographic;
    }
}
