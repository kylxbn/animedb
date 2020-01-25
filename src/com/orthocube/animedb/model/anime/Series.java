package com.orthocube.animedb.model.anime;

import com.orthocube.animedb.model.multilang.Title;
import com.orthocube.animedb.model.people.AnimeCharacter;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Series {
    private final IntegerProperty id;

    private final ObjectProperty<Title> title;

    private final ObservableList<Season> seasons;
    private final ObservableList<Movie> movies;
    private final ObservableList<Album> music;

    private final ObservableList<AnimeCharacter> characters;

    public Series() {
        this(0);
    }

    public Series(int id) {
        this(id, new Title());
    }

    public Series(Title title) {
        this(0, title);
    }

    public Series(int id, Title title) {
        this.id = new SimpleIntegerProperty(id);
        this.title = new SimpleObjectProperty<>(title);
        seasons = FXCollections.observableArrayList();
        movies = FXCollections.observableArrayList();
        music = FXCollections.observableArrayList();
        characters = FXCollections.observableArrayList();
    }

    public Title getTitle() {
        return title.get();
    }

    public ObservableList<Season> seasonsProperty() {
        return seasons;
    }

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public void addCharacter(AnimeCharacter character) {
        characters.add(character);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public ObjectProperty<Title> titleProperty() {
        return title;
    }

    public void setTitle(Title title) {
        this.title.set(title);
    }

    public ObservableList<Season> getSeasons() {
        return seasons;
    }

    public ObservableList<Movie> getMovies() {
        return movies;
    }

    public ObservableList<Album> getMusic() {
        return music;
    }

    public ObservableList<AnimeCharacter> getCharacters() {
        return characters;
    }
}
