package xyz.orthocube.animedb.model.details;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class TechnicalDetails {
    private final ObjectProperty<GeneralDetails> generalDetails;
    private final ObjectProperty<VideoDetails> videoDetails;
    private final ObjectProperty<AudioDetails> audioDetails;
    private final ObjectProperty<SubtitleDetails> subtitleDetails;
    private final ObjectProperty<OtherDetails> otherDetails;

    public TechnicalDetails() {
        this.generalDetails = new SimpleObjectProperty<>(new GeneralDetails());
        this.videoDetails = new SimpleObjectProperty<>(new VideoDetails());
        this.audioDetails = new SimpleObjectProperty<>(new AudioDetails());
        this.subtitleDetails = new SimpleObjectProperty<>(new SubtitleDetails());
        this.otherDetails = new SimpleObjectProperty<>(new OtherDetails());
    }

    public TechnicalDetails(GeneralDetails generalDetails, VideoDetails videoDetails, AudioDetails audioDetails, SubtitleDetails subtitleDetails, OtherDetails otherDetails) {
        this.generalDetails = new SimpleObjectProperty<>(generalDetails);
        this.videoDetails = new SimpleObjectProperty<>(videoDetails);
        this.audioDetails = new SimpleObjectProperty<>(audioDetails);
        this.subtitleDetails = new SimpleObjectProperty<>(subtitleDetails);
        this.otherDetails = new SimpleObjectProperty<>(otherDetails);
    }

    public GeneralDetails getGeneralDetails() {
        return generalDetails.get();
    }

    public void setGeneralDetails(GeneralDetails generalDetails) {
        this.generalDetails.set(generalDetails);
    }

    public ObjectProperty<GeneralDetails> generalDetailsProperty() {
        return generalDetails;
    }

    public VideoDetails getVideoDetails() {
        return videoDetails.get();
    }

    public void setVideoDetails(VideoDetails videoDetails) {
        this.videoDetails.set(videoDetails);
    }

    public ObjectProperty<VideoDetails> videoDetailsProperty() {
        return videoDetails;
    }

    public AudioDetails getAudioDetails() {
        return audioDetails.get();
    }

    public void setAudioDetails(AudioDetails audioDetails) {
        this.audioDetails.set(audioDetails);
    }

    public ObjectProperty<AudioDetails> audioDetailsProperty() {
        return audioDetails;
    }

    public SubtitleDetails getSubtitleDetails() {
        return subtitleDetails.get();
    }

    public void setSubtitleDetails(SubtitleDetails subtitleDetails) {
        this.subtitleDetails.set(subtitleDetails);
    }

    public ObjectProperty<SubtitleDetails> subtitleDetailsProperty() {
        return subtitleDetails;
    }

    public OtherDetails getOtherDetails() {
        return otherDetails.get();
    }

    public void setOtherDetails(OtherDetails otherDetails) {
        this.otherDetails.set(otherDetails);
    }

    public ObjectProperty<OtherDetails> otherDetailsProperty() {
        return otherDetails;
    }
}
