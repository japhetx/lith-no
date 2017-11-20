package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class MainController implements Initializable{

    @FXML
    private TableView<Worker> tblWorker;

    @FXML
    private TableColumn<Worker, Integer> clmNumberWorker;

    @FXML
    private TableColumn<Worker, String> clmNameWorker;

    @FXML
    private TableColumn<Worker, String> clmPostionWorker;

    public ObservableList<Worker> listWorker = FXCollections.observableArrayList(
			new Worker (1, "Dondon", "Leadman"),
			new Worker (2, "Bert", "Carpenter")
			);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		clmNumberWorker.setCellValueFactory(new PropertyValueFactory<Worker, Integer>("id"));
		clmNameWorker.setCellValueFactory(new PropertyValueFactory<Worker, String>("WorkerName"));
		clmPostionWorker.setCellValueFactory(new PropertyValueFactory<Worker, String>("Position"));
		tblWorker.setItems(listWorker);
	}

}
