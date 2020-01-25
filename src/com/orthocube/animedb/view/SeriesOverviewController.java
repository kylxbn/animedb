package com.orthocube.animedb.view;

import com.orthocube.animedb.MainApp;
import com.orthocube.animedb.model.anime.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class SeriesOverviewController {

    private final Season currentSeason;
    private final Series currentSeries;
    private final Episode currentEpisode;
    // the reference to the main application
    private MainApp mainApp;
    private boolean inEnglish = false;
    //<editor-fold desc="FXML injections">
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtSearch;
    @FXML
    private Button cmdAdvancedSearch;
    @FXML
    private TableView<Series> tblAnimeSeries;
    @FXML
    private Label lblNumSeries;
    @FXML
    private Button cmdAddSeries;
    @FXML
    private TableView<Season> tblSeasons;
    @FXML
    private Label lblNumSeasons;
    @FXML
    private Button cmdAddSeason;
    @FXML
    private TableView<Movie> tblMovies;
    @FXML
    private Label lblNumMovies;
    @FXML
    private Button cmdAddMovie;
    @FXML
    private TableView<Album> tblMusic;
    @FXML
    private Label lblNumMusic;
    @FXML
    private Button cmdAddMusic;
    @FXML
    private ImageView pboInfoPicture;
    @FXML
    private Label lblInfoFurigana;
    @FXML
    private Label lblInfoTitle;
    @FXML
    private Label lblInfoWriter;
    @FXML
    private Label lblInfoDemographic;
    @FXML
    private Label lblInfoDirector;
    @FXML
    private Label lblInfoStudio;
    @FXML
    private Label lblInfoNetwork;
    @FXML
    private Label lblInfoRun;
    @FXML
    private Label lblInfoEpisodes;
    @FXML
    private Label lblInfoPlot;
    @FXML
    private Label lblInfoMusic;
    @FXML
    private ImageView pboEpisodePicture;
    @FXML
    private Label lblEpisodeTitle;
    @FXML
    private Label lblEpisodePlot;
    @FXML
    private TableView<Episode> tblEpisodes;
    @FXML
    private Label lblNumEpisodes;
    @FXML
    private Button cmdAddEpisode;
    @FXML
    private ImageView pboCastPicture;
    @FXML
    private Label lblCastName;
    @FXML
    private Label lblCastDescription;
    @FXML
    private TableView<?> tblCast;
    @FXML
    private Label lblNumCast;
    @FXML
    private Button cmdAddCast;
    @FXML
    private ImageView pboVoicePicture;
    @FXML
    private Label lblVoiceName;
    @FXML
    private TableView<?> tblVoice;
    @FXML
    private Label lblNumVoice;
    @FXML
    private Button cmdAddVoice;
    @FXML
    private ImageView pboCrewPicture;
    @FXML
    private Label lblCrewName;
    @FXML
    private TableView<?> tblCrew;
    @FXML
    private Label lblNumCrew;
    @FXML
    private Button cmdAddCrew;
    @FXML
    private ChoiceBox<?> cboGenSource;
    @FXML
    private ChoiceBox<?> cboGenContainer;
    @FXML
    private TextField txtGenBitrate;
    @FXML
    private CheckBox chkGenFansubbed;
    @FXML
    private Button cmdGenSave;
    @FXML
    private ChoiceBox<?> cboVCodec;
    @FXML
    private ChoiceBox<?> cboVProfile;
    @FXML
    private ChoiceBox<?> cboVResolution;
    @FXML
    private ChoiceBox<?> cboVFramerate;
    @FXML
    private TextField txtVBitrate;
    @FXML
    private CheckBox chkVPostprocessed;
    @FXML
    private Button cmdVSave;
    @FXML
    private ChoiceBox<?> cmdACodec;
    @FXML
    private ChoiceBox<?> cmdAProfile;
    @FXML
    private ChoiceBox<?> cmdASampleRate;
    @FXML
    private ChoiceBox<?> cmdABitdepth;
    @FXML
    private CheckBox chkALJapOfficial;
    @FXML
    private CheckBox chkALJap;
    @FXML
    private CheckBox chkALEng;
    @FXML
    private CheckBox chkALOthers;
    @FXML
    private CheckBox chkALEngOfficial;
    @FXML
    private CheckBox chkALOthersOfficial;
    @FXML
    private TextField txtALOthers;
    @FXML
    private ChoiceBox<?> cmdAChannels;
    @FXML
    private CheckBox chkACommentaries;
    @FXML
    private TextField cmdABitrate;
    @FXML
    private Button cmdASave;
    @FXML
    private ChoiceBox<?> cboSCodec;
    @FXML
    private CheckBox cboSLJapOfficial;
    @FXML
    private CheckBox cboSLJap;
    @FXML
    private CheckBox cboSLEng;
    @FXML
    private CheckBox cboSLOthers;
    @FXML
    private CheckBox cboSLEngOfficial;
    @FXML
    private CheckBox cboSLOthersOfficial;
    @FXML
    private TextField txtSLOthers;
    @FXML
    private CheckBox chkSHDialogue;
    @FXML
    private CheckBox chkSHSigns;
    @FXML
    private Button cmdSSave;
    @FXML
    private DatePicker dpkOGetDate;
    @FXML
    private TextField txtOSource;
    @FXML
    private TextArea txtONotes;
    @FXML
    private Button cmdOSave;
    @FXML
    private TableColumn<Series, String> colSeriesTitle;
    @FXML
    private TableColumn<Season, String> colSeasonTitle;
    @FXML
    private TableColumn<Movie, String> colMovieTitle;
    @FXML
    private TableColumn<Album, String> colMusicTitle;
    @FXML
    private TableColumn<Episode, String> colEpisodeNum;
    @FXML
    private TableColumn<Episode, String> colEpisodeTitle;
    @FXML
    private TableColumn<?, ?> colCastName;
    @FXML
    private TableColumn<?, ?> colVoiceCharacter;
    @FXML
    private TableColumn<?, ?> colVoiceName;
    @FXML
    private TableColumn<?, ?> colCrewPosition;
    @FXML
    private TableColumn<?, ?> colCrewName;
    public SeriesOverviewController() {
        currentSeason = null;
        currentSeries = null;
        currentEpisode = null;
    }
    //</editor-fold>

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        tblAnimeSeries.setItems(mainApp.getAnimeData());
    }

    private void showAnimeSeasons(Series series) {
        if (series != null) {
            tblSeasons.setItems(series.seasonsProperty());
        } else {
            tblSeasons.setItems(null);
        }
    }

    private void showSeriesDetails(Season season) {
        if (season != null) {
            if (inEnglish) {
                lblInfoTitle.setText(season.getTitle().getRomajiTitle());
                lblInfoFurigana.setText(season.getTitle().getEnglishTitle());
            } else {
                lblInfoTitle.setText(season.getTitle().getJapaneseTitle());
                lblInfoFurigana.setText(season.getTitle().getFuriganaTitle());
            }
        } else {
            lblInfoTitle.setText("");
            lblInfoFurigana.setText("");
        }
    }

    @FXML
    void cmdSeriesClickedAction(MouseEvent event) {
        if (event.getClickCount() == 2) {
            Series selectedSeries = tblAnimeSeries.getSelectionModel().getSelectedItem();
            if (selectedSeries != null) {
                boolean okClicked = mainApp.showAnimeSeriesEditDialog(selectedSeries);
//            if (okClicked) {
//                showAnimeSeasons(selectedSeries);
//            }
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("Edit Error");
                alert.setHeaderText("No Anime Series is selected");
                alert.setContentText("Please select a series to edit first.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void cmdSeasonClickedAction(MouseEvent event) {
        if (event.getClickCount() == 2) {
            Season selectedSeason = tblSeasons.getSelectionModel().getSelectedItem();
            if (selectedSeason != null) {
                boolean okClicked = mainApp.showAnimeSeasonEditDialog(selectedSeason);
                if (okClicked) {
                    showSeriesDetails(selectedSeason);
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("Edit Error");
                alert.setHeaderText("No Anime Season is selected");
                alert.setContentText("Please select a season to edit first.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void cmdASaveAction(ActionEvent event) {

    }

    @FXML
    void cmdAddCastAction(ActionEvent event) {

    }

    @FXML
    void cmdAddCrewAction(ActionEvent event) {

    }

    @FXML
    void cmdAddEpisodeAction(ActionEvent event) {

    }

    @FXML
    void cmdAddMovieAction(ActionEvent event) {

    }

    @FXML
    void cmdAddMusicAction(ActionEvent event) {

    }

    @FXML
    void cmdAddSeasonAction(ActionEvent event) {
        int selectedIndex = tblAnimeSeries.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Season tempSeason = new Season();
            Series series = tblAnimeSeries.getItems().get(selectedIndex);
            tempSeason.getTitle().setJapaneseTitle(series.getTitle().getJapaneseTitle());
            tempSeason.getTitle().setFuriganaTitle(series.getTitle().getFuriganaTitle());
            tempSeason.getTitle().setRomajiTitle(series.getTitle().getRomajiTitle());
            tempSeason.getTitle().setEnglishTitle(series.getTitle().getEnglishTitle());
            boolean okClicked = mainApp.showAnimeSeasonEditDialog(tempSeason);
            if (okClicked) {
                series.addSeason(tempSeason);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Add Season Error");
            alert.setHeaderText("No Anime Series is selected");
            alert.setContentText("Please select a series first.");
            alert.showAndWait();
        }
    }

    @FXML
    void cmdAddSeriesAction(ActionEvent event) {
        Series tempAnime = new Series();
        boolean okClicked = mainApp.showAnimeSeriesEditDialog(tempAnime);
        if (okClicked) {
            mainApp.getAnimeData().add(tempAnime);
        }
    }

    @FXML
    void cmdAddVoiceAction(ActionEvent event) {

    }

    @FXML
    void cmdAdvancedSearchAction(ActionEvent event) {

    }

    @FXML
    void cmdEditInfoAction(ActionEvent event) {

    }

    @FXML
    void cmdGenSaveAction(ActionEvent event) {

    }

    @FXML
    void cmdVSaveAction(ActionEvent event) {

    }

    @FXML
    void cmsSSaveAction(ActionEvent event) {

    }

    @FXML
    void cmdDeleteSeriesAction(ActionEvent event) {
        int selectedIndex = tblAnimeSeries.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tblAnimeSeries.getItems().remove(selectedIndex);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Delete Error");
            alert.setHeaderText("No Anime Series is selected");
            alert.setContentText("Please select a series to delete first.");
            alert.showAndWait();
        }
    }

    @FXML
    void cmdDeleteSeasonAction(ActionEvent event) {
        int selectedIndex = tblSeasons.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tblSeasons.getItems().remove(selectedIndex);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Delete Error");
            alert.setHeaderText("No Anime Season is selected");
            alert.setContentText("Please select a season to delete first.");
            alert.showAndWait();
        }
    }

    @FXML
    void cmdDeleteMovieAction(ActionEvent event) {

    }

    @FXML
    void cmdDeleteMusicAction(ActionEvent event) {

    }

    @FXML
    void cmdDeleteEpisodeAction(ActionEvent event) {

    }

    @FXML
    void cmdDeleteCastAction(ActionEvent event) {

    }

    @FXML
    void cmdDeleteVoiceAction(ActionEvent event) {

    }

    @FXML
    void cmdDeleteCrewAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        //<editor-fold desc="Not NULL asserts">
        assert txtSearch != null : "fx:id=\"txtSearch\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAdvancedSearch != null : "fx:id=\"cmdAdvancedSearch\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblAnimeSeries != null : "fx:id=\"tblAnimeSeries\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumSeries != null : "fx:id=\"lblNumSeries\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddSeries != null : "fx:id=\"cmdAddSeries\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblSeasons != null : "fx:id=\"tblSeasons\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumSeasons != null : "fx:id=\"lblNumSeasons\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddSeason != null : "fx:id=\"cmdAddSeason\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblMovies != null : "fx:id=\"tblMovies\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumMovies != null : "fx:id=\"lblNumMovies\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddMovie != null : "fx:id=\"cmdAddMovie\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblMusic != null : "fx:id=\"tblMusic\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumMusic != null : "fx:id=\"lblNumMusic\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddMusic != null : "fx:id=\"cmdAddMusic\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert pboInfoPicture != null : "fx:id=\"pboInfoPicture\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoFurigana != null : "fx:id=\"lblInfoFurigana\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoTitle != null : "fx:id=\"lblInfoTitle\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoWriter != null : "fx:id=\"lblInfoWriter\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoDemographic != null : "fx:id=\"lblInfoDemographic\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoDirector != null : "fx:id=\"lblInfoDirector\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoStudio != null : "fx:id=\"lblInfoStudio\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoNetwork != null : "fx:id=\"lblInfoNetwork\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoRun != null : "fx:id=\"lblInfoRun\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoEpisodes != null : "fx:id=\"lblInfoEpisodes\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoPlot != null : "fx:id=\"lblInfoPlot\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblInfoMusic != null : "fx:id=\"lblInfoMusic\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert pboEpisodePicture != null : "fx:id=\"pboEpisodePicture\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblEpisodeTitle != null : "fx:id=\"lblEpisodeTitle\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblEpisodePlot != null : "fx:id=\"lblEpisodePlot\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblEpisodes != null : "fx:id=\"tblEpisodes\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumEpisodes != null : "fx:id=\"lblNumEpisodes\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddEpisode != null : "fx:id=\"cmdAddEpisode\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert pboCastPicture != null : "fx:id=\"pboCastPicture\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblCastName != null : "fx:id=\"lblCastName\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblCastDescription != null : "fx:id=\"lblCastDescription\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblCast != null : "fx:id=\"tblCast\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumCast != null : "fx:id=\"lblNumCast\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddCast != null : "fx:id=\"cmdAddCast\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert pboVoicePicture != null : "fx:id=\"pboVoicePicture\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblVoiceName != null : "fx:id=\"lblVoiceName\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblVoice != null : "fx:id=\"tblVoice\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumVoice != null : "fx:id=\"lblNumVoice\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddVoice != null : "fx:id=\"cmdAddVoice\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert pboCrewPicture != null : "fx:id=\"pboCrewPicture\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblCrewName != null : "fx:id=\"lblCrewName\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert tblCrew != null : "fx:id=\"tblCrew\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert lblNumCrew != null : "fx:id=\"lblNumCrew\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAddCrew != null : "fx:id=\"cmdAddCrew\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboGenSource != null : "fx:id=\"cboGenSource\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboGenContainer != null : "fx:id=\"cboGenContainer\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert txtGenBitrate != null : "fx:id=\"txtGenBitrate\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkGenFansubbed != null : "fx:id=\"chkGenFansubbed\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdGenSave != null : "fx:id=\"cmdGenSave\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboVCodec != null : "fx:id=\"cboVCodec\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboVProfile != null : "fx:id=\"cboVProfile\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboVResolution != null : "fx:id=\"cboVResolution\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboVFramerate != null : "fx:id=\"cboVFramerate\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert txtVBitrate != null : "fx:id=\"txtVBitrate\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkVPostprocessed != null : "fx:id=\"chkVPostprocessed\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdVSave != null : "fx:id=\"cmdVSave\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdACodec != null : "fx:id=\"cmdACodec\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAProfile != null : "fx:id=\"cmdAProfile\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdASampleRate != null : "fx:id=\"cmdASampleRate\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdABitdepth != null : "fx:id=\"cmdABitdepth\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkALJapOfficial != null : "fx:id=\"chkALJapOfficial\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkALJap != null : "fx:id=\"chkALJap\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkALEng != null : "fx:id=\"chkALEng\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkALOthers != null : "fx:id=\"chkALOthers\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkALEngOfficial != null : "fx:id=\"chkALEngOfficial\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkALOthersOfficial != null : "fx:id=\"chkALOthersOfficial\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert txtALOthers != null : "fx:id=\"txtALOthers\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdAChannels != null : "fx:id=\"cmdAChannels\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkACommentaries != null : "fx:id=\"chkACommentaries\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdABitrate != null : "fx:id=\"cmdABitrate\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdASave != null : "fx:id=\"cmdASave\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSCodec != null : "fx:id=\"cboSCodec\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSLJapOfficial != null : "fx:id=\"cboSLJapOfficial\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSLJap != null : "fx:id=\"cboSLJap\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSLEng != null : "fx:id=\"cboSLEng\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSLOthers != null : "fx:id=\"cboSLOthers\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSLEngOfficial != null : "fx:id=\"cboSLEngOfficial\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cboSLOthersOfficial != null : "fx:id=\"cboSLOthersOfficial\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert txtSLOthers != null : "fx:id=\"txtSLOthers\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkSHDialogue != null : "fx:id=\"chkSHDialogue\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert chkSHSigns != null : "fx:id=\"chkSHSigns\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdSSave != null : "fx:id=\"cmdSSave\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert dpkOGetDate != null : "fx:id=\"dpkOGetDate\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert txtOSource != null : "fx:id=\"txtOSource\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert txtONotes != null : "fx:id=\"txtONotes\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        assert cmdOSave != null : "fx:id=\"cmdOSave\" was not injected: check your FXML file 'SeriesOverview.fxml'.";
        //</editor-fold>

        colSeriesTitle.setCellValueFactory(
                cellData -> {
                    if (inEnglish) {
                        return cellData.getValue().getTitle().romajiTitleProperty();
                    } else {
                        return cellData.getValue().getTitle().japaneseTitleProperty();
                    }
                }
        );

        colSeasonTitle.setCellValueFactory(
                cellData -> {
                    if (inEnglish) {
                        return cellData.getValue().getTitle().romajiTitleProperty();
                    } else {
                        return cellData.getValue().getTitle().japaneseTitleProperty();
                    }
                }
        );

        showAnimeSeasons(null);
        showSeriesDetails(null);

        tblAnimeSeries.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldV, newV) -> showAnimeSeasons(newV));

        tblSeasons.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldV, newV) -> showSeriesDetails(newV));
    }
}
