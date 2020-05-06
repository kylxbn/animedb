package xyz.orthocube.animedb.model;

import xyz.orthocube.animedb.model.anime.Series;
import xyz.orthocube.animedb.model.data.AnimeSource;
import xyz.orthocube.animedb.model.people.Staff;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AnimeModel {
    private ObservableList<Series> series;
    private ObservableList<Staff> staff;

    private ObservableList<AnimeSource> sources;


    public AnimeModel() {
        series = FXCollections.observableArrayList();
        staff = FXCollections.observableArrayList();
    }
}
