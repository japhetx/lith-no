package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Worker {
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty WorkersName;
	private final SimpleStringProperty Position;

	public Worker(Integer id, String WorkersName, String Position) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.WorkersName = new SimpleStringProperty(WorkersName);
		this.Position = new SimpleStringProperty(Position);
	}
	public Integer getId() {
		return id.get();
	}
	public String getWorkersName() {
		return WorkersName.get();
	}
	public String getPosition() {
		return Position.get();
	}



}
