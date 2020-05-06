package xyz.orthocube.animedb.model.data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VideoResolution {
    private final IntegerProperty id;
    private final StringProperty resolution;

    public VideoResolution(int id) {
        this(id, "");
    }

    public VideoResolution(int id, String c) {
        this.id = new SimpleIntegerProperty(id);
        this.resolution = new SimpleStringProperty(c);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getResolution() {
        return resolution.get();
    }

    public StringProperty resolutionProperty() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution.set(resolution);
    }
}
