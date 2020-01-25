package com.orthocube.animedb.model.anime;

import com.orthocube.animedb.model.data.Demographic;
import com.orthocube.animedb.model.data.Network;
import com.orthocube.animedb.model.data.Run;
import com.orthocube.animedb.model.data.Studio;
import com.orthocube.animedb.model.details.TechnicalDetails;
import com.orthocube.animedb.model.multilang.Title;
import com.orthocube.animedb.model.people.AnimeCharacter;
import com.orthocube.animedb.model.people.Staff;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

public class Season {
    private final IntegerProperty id;

    private final ObjectProperty<Image> seasonImage;
    private final ObjectProperty<Title> title;
    private final ObjectProperty<Staff> writer;
    private final ObjectProperty<Demographic> demographic;
    private final ObjectProperty<Staff> director;
    private final ObjectProperty<Studio> studio;
    private final ObjectProperty<Network> network;
    private final ObjectProperty<Run> run;
    private final IntegerProperty numEpisodes;

    private final ObservableList<Episode> episodes;
    private final ObservableList<AnimeCharacter> characters;
    private final ObservableList<Staff> crew;

    private final ObjectProperty<TechnicalDetails> technicalDetails;

    public Season() {
        this(0);
    }

    public Season(int id) {
        this(id, new Title());
    }

    public Season(Title title) {
        this(0, title);
    }

    public Season(int id, Title title) {
        this.id = new SimpleIntegerProperty(id);
        this.seasonImage = new SimpleObjectProperty<>(null);
        this.title = new SimpleObjectProperty<>(title);
        this.writer = new SimpleObjectProperty<>(null);
        this.demographic = new SimpleObjectProperty<>(null);
        this.director = new SimpleObjectProperty<>(null);
        this.studio = new SimpleObjectProperty<>(null);
        this.network = new SimpleObjectProperty<>(null);
        this.run = new SimpleObjectProperty<>(new Run());
        this.numEpisodes = new SimpleIntegerProperty(0);

        episodes = FXCollections.observableArrayList();
        characters = FXCollections.observableArrayList();
        crew = FXCollections.observableArrayList();

        technicalDetails = new SimpleObjectProperty<>(new TechnicalDetails());
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public Image getSeasonImage() {
        return seasonImage.get();
    }

    public ObjectProperty<Image> seasonImageProperty() {
        return seasonImage;
    }

    public void setSeasonImage(Image seasonImage) {
        this.seasonImage.set(seasonImage);
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

    public Staff getWriter() {
        return writer.get();
    }

    public ObjectProperty<Staff> writerProperty() {
        return writer;
    }

    public void setWriter(Staff writer) {
        this.writer.set(writer);
    }

    public Demographic getDemographic() {
        return demographic.get();
    }

    public ObjectProperty<Demographic> demographicProperty() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic.set(demographic);
    }

    public Staff getDirector() {
        return director.get();
    }

    public ObjectProperty<Staff> directorProperty() {
        return director;
    }

    public void setDirector(Staff director) {
        this.director.set(director);
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

    public Network getNetwork() {
        return network.get();
    }

    public ObjectProperty<Network> networkProperty() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network.set(network);
    }

    public Run getRun() {
        return run.get();
    }

    public ObjectProperty<Run> runProperty() {
        return run;
    }

    public void setRun(Run run) {
        this.run.set(run);
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

    public ObservableList<Episode> getEpisodes() {
        return episodes;
    }

    public ObservableList<AnimeCharacter> getCharacters() {
        return characters;
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
