package xyz.orthocube.animedb.model.details;

import xyz.orthocube.animedb.model.data.AudioChannels;
import xyz.orthocube.animedb.model.data.AudioCodec;
import xyz.orthocube.animedb.model.data.Languages;
import xyz.orthocube.animedb.model.data.SampleRate;
import javafx.beans.property.*;

public class AudioDetails {
    public final ObjectProperty<AudioCodec> codec;
    public final StringProperty profile;
    public final ObjectProperty<SampleRate> sampleRate;
    public final IntegerProperty bitrate;
    public final IntegerProperty bitdepth;
    public final ObjectProperty<AudioChannels> channels;

    public final ObjectProperty<Languages> languages;

    public final BooleanProperty hasCommentaries;

    public AudioDetails() {
        codec = new SimpleObjectProperty<>(null);
        profile = new SimpleStringProperty("");
        sampleRate = new SimpleObjectProperty<>(null);
        bitrate = new SimpleIntegerProperty(0);
        bitdepth = new SimpleIntegerProperty(0);
        channels = new SimpleObjectProperty<>(null);
        languages = new SimpleObjectProperty<>(new Languages());
        hasCommentaries = new SimpleBooleanProperty(false);
    }
}