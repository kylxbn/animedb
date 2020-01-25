package com.orthocube.animedb.model.data;

import com.orthocube.animedb.model.multilang.Description;
import javafx.beans.property.*;

public class AnimeSource {
    private final IntegerProperty id;
    private final StringProperty abbreviation;
    private final ObjectProperty<Description> description;

    public AnimeSource(int id) {
        this(id, "", new Description());
    }

    public AnimeSource(int id, String abb, Description desc) {
        this.id = new SimpleIntegerProperty(id);
        this.abbreviation = new SimpleStringProperty(abb);
        this.description = new SimpleObjectProperty<>(desc);
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

    public String getAbbreviation() {
        return abbreviation.get();
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation.set(abbreviation);
    }

    public StringProperty abbreviationProperty() {
        return abbreviation;
    }

    public Description getDescription() {
        return description.get();
    }

    public void setDescription(Description description) {
        this.description.set(description);
    }

    public ObjectProperty<Description> descriptionProperty() {
        return description;
    }
}