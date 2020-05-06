package xyz.orthocube.animedb.model.anime;

import xyz.orthocube.animedb.model.data.Run;
import xyz.orthocube.animedb.model.data.Studio;
import xyz.orthocube.animedb.model.details.TechnicalDetails;
import xyz.orthocube.animedb.model.multilang.Title;
import xyz.orthocube.animedb.model.people.AnimeCharacter;
import xyz.orthocube.animedb.model.people.Staff;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

import java.time.LocalDate;

public class Album {
    private final IntegerProperty id;

    private final ObjectProperty<Image> albumImage;
    private final ObjectProperty<Title> title;
    private final ObjectProperty<Studio> studio;
    private final ObjectProperty<LocalDate> date;
    private final IntegerProperty numEpisodes;

    private final ObservableList<Episode> tracks;
    private final ObservableList<Staff> crew;

    private final ObjectProperty<TechnicalDetails> technicalDetails;

    public Album(int id) {
        this(id, new Title());
    }

    public Album(int id, Title title) {
        this.id = new SimpleIntegerProperty(id);
        this.albumImage = new SimpleObjectProperty<>(null);
        this.title = new SimpleObjectProperty<>(title);
        this.studio = new SimpleObjectProperty<>(null);
        this.date = new SimpleObjectProperty<>(LocalDate.parse("2000-01-01"));
        this.numEpisodes = new SimpleIntegerProperty(0);

        tracks = FXCollections.observableArrayList();
        crew = FXCollections.observableArrayList();

        technicalDetails = new SimpleObjectProperty<>(new TechnicalDetails());
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public Image getAlbumImage() {
        return albumImage.get();
    }

    public ObjectProperty<Image> albumImageProperty() {
        return albumImage;
    }

    public void setAlbumImage(Image albumImage) {
        this.albumImage.set(albumImage);
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

    public Studio getStudio() {
        return studio.get();
    }

    public ObjectProperty<Studio> studioProperty() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio.set(studio);
    }

    public LocalDate getDate() {
        return date.get();
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
    }

    public int getNumEpisodes() {
        return numEpisodes.get();
    }

    public IntegerProperty numEpisodesProperty() {
        return numEpisodes;
    }

    public void setNumEpisodes(int numEpisodes) {
        this.numEpisodes.set(numEpisodes);
    }

    public ObservableList<Episode> getTracks() {
        return tracks;
    }

    public ObservableList<Staff> getCrew() {
        return crew;
    }

    public TechnicalDetails getTechnicalDetails() {
        return technicalDetails.get();
    }

    public ObjectProperty<TechnicalDetails> technicalDetailsProperty() {
        return technicalDetails;
    }

    public void setTechnicalDetails(TechnicalDetails technicalDetails) {
        this.technicalDetails.set(technicalDetails);
    }
}
