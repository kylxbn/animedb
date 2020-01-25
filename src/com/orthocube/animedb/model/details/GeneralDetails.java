package com.orthocube.animedb.model.details;

import com.orthocube.animedb.model.data.AnimeSource;
import com.orthocube.animedb.model.data.ContainerFormat;
import javafx.beans.property.*;

public class GeneralDetails {
    private final ObjectProperty<AnimeSource> source;
    private final BooleanProperty fansubbed;
    private final ObjectProperty<ContainerFormat> containerFormat;
    private final DoubleProperty overallBitrate;

    public GeneralDetails() {
        source = new SimpleObjectProperty<>(null);
        fansubbed = new SimpleBooleanProperty(false);
        containerFormat = new SimpleObjectProperty<>(null);
        overallBitrate = new SimpleDoubleProperty(0.0);
    }

    public AnimeSource getSource() {
        return source.get();
    }

    public void setSource(AnimeSource source) {
        this.source.set(source);
    }

    public ObjectProperty<AnimeSource> sourceProperty() {
        return source;
    }

    public boolean isFansubbed() {
        return fansubbed.get();
    }

    public void setFansubbed(boolean fansubbed) {
        this.fansubbed.set(fansubbed);
    }

    public BooleanProperty fansubbedProperty() {
        return fansubbed;
    }

    public ContainerFormat getContainerFormat() {
        return containerFormat.get();
    }

    public void setContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat.set(containerFormat);
    }

    public ObjectProperty<ContainerFormat> containerFormatProperty() {
        return containerFormat;
    }

    public double getOverallBitrate() {
        return overallBitrate.get();
    }

    public void setOverallBitrate(double overallBitrate) {
        this.overallBitrate.set(overallBitrate);
    }

    public DoubleProperty overallBitrateProperty() {
        return overallBitrate;
    }
}
