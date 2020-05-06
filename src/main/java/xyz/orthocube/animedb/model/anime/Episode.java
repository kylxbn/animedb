package xyz.orthocube.animedb.model.anime;

import xyz.orthocube.animedb.model.multilang.Description;
import xyz.orthocube.animedb.model.multilang.Title;
import javafx.beans.property.*;
import javafx.scene.image.Image;

public class Episode {
    private final IntegerProperty id;

    private final ObjectProperty<Image> episodeImage;
    private final ObjectProperty<Title> title;
    private final ObjectProperty<Description> plot;

    private final StringProperty path;

    public Episode(int id, String p) {
        this(id, new Title(), p, new Description());
    }

    public Episode(int id, Title title, String p, Description plot) {
        this.episodeImage = new SimpleObjectProperty<>(null);
        this.id = new SimpleIntegerProperty(id);
        this.title = new SimpleObjectProperty<>(title);
        this.path = new SimpleStringProperty(p);
        this.plot = new SimpleObjectProperty<>(plot);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public Image getEpisodeImage() {
        return episodeImage.get();
    }

    public ObjectProperty<Image> episodeImageProperty() {
        return episodeImage;
    }

    public void setEpisodeImage(Image episodeImage) {
        this.episodeImage.set(episodeImage);
    }

    public Title getTitle() {
        return title.get();
    }

    public ObjectProperty<Title> titleProperty() {
        return title;
    }

    public void setTitle(Title title) {
        this.title.set(title);
    }

    public Description getPlot() {
        return plot.get();
    }

    public ObjectProperty<Description> plotProperty() {
        return plot;
    }

    public void setPlot(Description plot) {
        this.plot.set(plot);
    }

    public String getPath() {
        return path.get();
    }

    public StringProperty pathProperty() {
        return path;
    }

    public void setPath(String path) {
        this.path.set(path);
    }
}
