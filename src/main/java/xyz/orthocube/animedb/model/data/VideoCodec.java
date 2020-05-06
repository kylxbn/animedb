package xyz.orthocube.animedb.model.data;

import javafx.beans.property.*;

public class VideoCodec {
    private final IntegerProperty id;
    private final StringProperty abbreviation;

    public VideoCodec(int id) {
        this(id, "");
    }

    public VideoCodec(int id, String abb) {
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
