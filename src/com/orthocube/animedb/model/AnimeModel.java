package com.orthocube.animedb.model;

import com.orthocube.animedb.model.anime.Series;
import com.orthocube.animedb.model.data.AnimeSource;
import com.orthocube.animedb.model.people.Staff;
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
