package xyz.orthocube.animedb.model.details;

import xyz.orthocube.animedb.model.data.VideoCodec;
import xyz.orthocube.animedb.model.data.VideoResolution;
import javafx.beans.property.*;

public class VideoDetails {
    private final ObjectProperty<VideoCodec> codec;
    private final StringProperty profile;
    private final ObjectProperty<VideoResolution> resolution;
    private final DoubleProperty frameRate;
    private final DoubleProperty bitrate;

    public VideoDetails() {
        codec = new SimpleObjectProperty<>(null);
        profile = new SimpleStringProperty("");
        resolution = new SimpleObjectProperty<>(null);
        frameRate = new SimpleDoubleProperty(0);
        bitrate = new SimpleDoubleProperty(0);
    }

    public VideoCodec getCodec() {
        return codec.get();
    }

    public ObjectProperty<VideoCodec> codecProperty() {
        return codec;
    }

    public void setCodec(VideoCodec codec) {
        this.codec.set(codec);
    }

    public String getProfile() {
        return profile.get();
    }

    public StringProperty profileProperty() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile.set(profile);
    }

    public VideoResolution getResolution() {
        return resolution.get();
    }

    public ObjectProperty<VideoResolution> resolutionProperty() {
        return resolution;
    }

    public void setResolution(VideoResolution resolution) {
        this.resolution.set(resolution);
    }

    public double getFrameRate() {
        return frameRate.get();
    }

    public DoubleProperty frameRateProperty() {
        return frameRate;
    }

    public void setFrameRate(double frameRate) {
        this.frameRate.set(frameRate);
    }

    public double getBitrate() {
        return bitrate.get();
    }

    public DoubleProperty bitrateProperty() {
        return bitrate;
    }

    public void setBitrate(double bitrate) {
        this.bitrate.set(bitrate);
    }
}
