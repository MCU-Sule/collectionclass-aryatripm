package com.arya.tugas2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.function.Predicate;

public class HelloController {

    @FXML
    public TextArea tambahNrp;
    @FXML
    public TextArea tambahNama;
    @FXML
    public TextArea hapusNrp;
    @FXML
    public TableView<Student> table;
    @FXML
    public TableColumn<Student, Integer> columnNrp;
    @FXML
    public TableColumn<Student, String> columnNama;

    private ObservableList<Student> students;

    public void initialize() {
        students = FXCollections.observableArrayList();
        students.add(new Student(2072023, "Arya"));
        table.setItems(students);
        columnNrp.setCellValueFactory(new PropertyValueFactory<Student, Integer>("nrp"));
        columnNama.setCellValueFactory(new PropertyValueFactory<Student, String>("nama"));
    }

    public void tambah(ActionEvent actionEvent) {
        Integer nrp = Integer.parseInt(tambahNrp.getText());
        String nama = tambahNama.getText();
        Student newStudent = new Student(nrp, nama);
        students.add(newStudent);
    }

    public void hapus(ActionEvent actionEvent) {
        Integer nrp = Integer.parseInt(hapusNrp.getText());
//        students.remove(search(nrp));
        students.removeIf(student -> student.getNrp().equals(nrp));
    }

    private Student search(Integer nrp) {
        for (Student student: students) {
            if (student.getNrp().equals(nrp)) {
                return student;
            }
        }
        return null;
    }
}