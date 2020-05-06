package xyz.orthocube.animedb.model.data;

import javafx.beans.property.*;

public class AudioCodec {
    private final IntegerProperty id;
    private final StringProperty abbreviation;

    public AudioCodec(int id) {
        this(id, "");
    }

    public AudioCodec(int id, String abb) {
        this.id = new SimpleIntegerProperty(id);
        this.abbreviation = new SimpleStringProperty(abb);
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
}
