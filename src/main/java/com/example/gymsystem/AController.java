package com.example.gymsystem;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class AController implements Initializable {


    @FXML
    private Button AddAClassPane_btn;

    @FXML
    private Button AddClass_btn;

    @FXML
    private Button AddTrainerPane_btn;

    @FXML
    private Button AddTrainer_btn;

    @FXML
    private AnchorPane AddTrainer_pane;

    @FXML
    private Button AssignTrToClassPane_btn;

    @FXML
    private Button AssignTrToMemPane_btn;

    @FXML
    private TextField AssignTrainerNID;

    @FXML
    private Button AssignTrainerPane_btn;

    @FXML
    private Button AssignTrainerToClass_btn;

    @FXML
    private AnchorPane AssignTrainerToClass_pane;

    @FXML
    private Button AssignTrainerToMem_btn;

    @FXML
    private AnchorPane AssignTrainerToMem_pane;

    @FXML
    private AnchorPane AssignTrainer_pane;

    @FXML
    private TextField AssignTrainerFirstN;

    @FXML
    private TextField AssignTrainerLastN;

    @FXML
    private TextField AssignTrainerPhoneN;

    @FXML
    private TextField ClassName;

    @FXML
    private TextField ClassTrainerFirstN;

    @FXML
    private ComboBox<String> ClassTrainerGender_combo;

    @FXML
    private TextField ClassTrainerLastN;

    @FXML
    private TextField ClassTrainerNID;

    @FXML
    private TextField ClassTrainerPhoneN;

    @FXML
    private Button Class_btn;

    @FXML
    private AnchorPane CreateNewClass_Pane;

    @FXML
    private ComboBox<String> Day_combo;

    @FXML
    private TextField DelClassName;

    @FXML
    private ComboBox<String> DelDay_combo;

    @FXML
    private TextField DelDescription;

    @FXML
    private ComboBox<String> DelGender_combo;

    @FXML
    private TextField DelMemCount;

    @FXML
    private ComboBox<String> DelTime_combo;

    @FXML
    private TextField DelTrainerFirstN;

    @FXML
    private TextField DelTrainerID;

    @FXML
    private TextField DelTrainerLastN;

    @FXML
    private TextField DelTrainerPhoneN;

    @FXML
    private AnchorPane DeleteClass_Pane;

    @FXML
    private Button DeleteClass_btn;

    @FXML
    private Button DeleteTrainerPane_btn;

    @FXML
    private Button DeleteTrainer_btn;

    @FXML
    private AnchorPane DeleteTrainer_pane;

    @FXML
    private TextField Description;


    @FXML
    private TableView<Classes> EditClass;

    @FXML
    private TableColumn<Classes, Integer> EditClassCount;

    @FXML
    private TableColumn<Classes, String> EditClassDay;

    @FXML
    private TableColumn<Classes, String> EditClassDescription;

    @FXML
    private AnchorPane EditClassInfo_Pane;

    @FXML
    private TableColumn<Classes, String> EditClassName;


    @FXML
    private TableColumn<Classes, String> EditClassTime;

    @FXML
    private TableView<Person> EditTrainer;

    @FXML
    private TableColumn<Person, String> EditTrainerFirstN;

    @FXML
    private TableColumn<Person, String> EditTrainerGender;

    @FXML
    private TableColumn<Person, String> EditTrainerLastN;

    @FXML
    private TableColumn<Person, String> EditTrainerNID;

    @FXML
    private TableColumn<Person, String> EditTrainerPhoneN;

    @FXML
    private Button EditClassPane_btn;

    @FXML
    private Button EditTrainerPane_btn;

    @FXML
    private AnchorPane EditTrainer_pane;

    @FXML
    private Button Home_btn;

    @FXML
    private AnchorPane Home_pane;

    @FXML
    private Button Logout;

    @FXML
    private TextField MemCount;

    @FXML
    private TextField MemberFirstN;

    @FXML
    private ComboBox<String> MemberGender_combo;

    @FXML
    private TextField MemberLastN;

    @FXML
    private ComboBox<String> MemberMembership_combo;

    @FXML
    private TextField MemberNID;

    @FXML
    private TextField MemberPhoneN;

    @FXML
    private ComboBox<String> Membership_combo;

    @FXML
    private TextField NewClassName;

    @FXML
    private ComboBox<String> NewDay_combo;

    @FXML
    private TextField NewDescription;

    @FXML
    private TextField NewMemCount;

    @FXML
    private ComboBox<String> NewTime_combo;

    @FXML
    private Button RemoveClassPane_btn;

    @FXML
    private Button Settings_btn;

    @FXML
    private AnchorPane Settings_pane;

    @FXML
    private ComboBox<String> Time_combo;

    @FXML
    private TextField TrainerFirstN;

    @FXML
    private ComboBox<String> TrainerGender_combo;

    @FXML
    private TextField TrainerLastN;

    @FXML
    private TextField TrainerNID;

    @FXML
    private TextField TrainerPhoneN;

    @FXML
    private AnchorPane ViewClasses_Pane;

    @FXML
    private Button ViewMemPane_btn;

    @FXML
    private TableColumn<Person, String> ViewMemberFirstN;

    @FXML
    private TableColumn<Person, String> ViewMemberGender;

    @FXML
    private TableColumn<Person, String> ViewMemberLastN;

    @FXML
    private TableColumn<Person, String> ViewMemberNID;

    @FXML
    private TableColumn<Person, String> ViewMemberPhoneN;

    @FXML
    private TableView<Person> ViewMemberTable;

    @FXML
    private TableColumn<Person, String> ViewMemberType;

    @FXML
    private AnchorPane ViewMember_Pane;

    @FXML
    private AnchorPane ViewTrainerAcc_pane;

    @FXML
    private ComboBox<String> gender_comboBox;

    @FXML
    private Button trainer_btn;

    @FXML
    private Button EditTrainer_btn;

    @FXML
    private Button EditClass_btn;

    @FXML
    private TextField ViewClassMember;

    @FXML
    private Button ViewMemberWith_btn;


    @FXML
    void logout(ActionEvent event) {
        try {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Warning");
            alert.setHeaderText("Logging Out");
            alert.setContentText("Are you sure you want to Log Out?");
            if (alert.showAndWait().get() == ButtonType.OK) {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }


        } catch (Exception exception) {
            exception.printStackTrace();
            exception.getCause();
        }
    }

    String[] Day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] Time = {"12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00",
            "18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00", "22:00-23:00", "23:00-00:00"};
    String[] Gender = {"Male", "Female"};
    String[] MemberShipType = {"PAYG", "Open membership", "Term membership"};

    ObservableList<Person> list = FXCollections.observableArrayList(Main.gymTrainers);
    ObservableList<Classes> classList = FXCollections.observableArrayList(Main.gymClasses);
    ObservableList<Person> list2 = FXCollections.observableArrayList(Main.gymMembers);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gender_comboBox.getItems().addAll(Gender);
        gender_comboBox.setOnAction(this::getGender);
        Day_combo.getItems().addAll(Day);
        Day_combo.setOnAction(this::getDay);
        Time_combo.getItems().addAll(Time);
        Time_combo.setOnAction(this::getTime);
        Membership_combo.getItems().addAll(MemberShipType);
        Membership_combo.setOnAction(this::getMembershipType);
        DelGender_combo.getItems().addAll(Gender);
        DelGender_combo.setOnAction(this::getGender);
        ClassTrainerGender_combo.getItems().addAll(Gender);
        ClassTrainerGender_combo.setOnAction(this::getGender);
        NewDay_combo.getItems().addAll(Day);
        NewDay_combo.setOnAction(this::getDay);
        NewTime_combo.getItems().addAll(Time);
        NewTime_combo.setOnAction(this::getTime);
        DelDay_combo.getItems().addAll(Day);
        DelDay_combo.setOnAction(this::getDay);
        DelTime_combo.getItems().addAll(Time);
        DelTime_combo.setOnAction(this::getTime);
        MemberGender_combo.getItems().addAll(Gender);
        MemberGender_combo.setOnAction(this::getGender);
        MemberMembership_combo.getItems().addAll(MemberShipType);
        MemberMembership_combo.setOnAction(this::getMembershipType);
        TrainerGender_combo.getItems().addAll(Gender);
        TrainerGender_combo.setOnAction(this::getGender);


        EditTrainerFirstN.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        EditTrainerFirstN.setCellFactory(TextFieldTableCell.forTableColumn());
        EditTrainerLastN.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        EditTrainerLastN.setCellFactory(TextFieldTableCell.forTableColumn());
        EditTrainerNID.setCellValueFactory(new PropertyValueFactory<>("NationalID"));
        EditTrainerNID.setCellFactory(TextFieldTableCell.forTableColumn());
        EditTrainerPhoneN.setCellValueFactory(new PropertyValueFactory<>("PhoneNumber"));
        EditTrainerPhoneN.setCellFactory(TextFieldTableCell.forTableColumn());
        EditTrainerGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        EditTrainerGender.setCellFactory(TextFieldTableCell.forTableColumn());
        EditTrainer.setItems(list);
        EditTrainer.setEditable(true);

        EditClassName.setCellValueFactory(new PropertyValueFactory<>("name"));
        EditClassName.setCellFactory(TextFieldTableCell.forTableColumn());
        EditClassDay.setCellValueFactory(new PropertyValueFactory<>("Day"));
        EditClassDay.setCellFactory(TextFieldTableCell.forTableColumn());
        EditClassTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        EditClassTime.setCellFactory(TextFieldTableCell.forTableColumn());
        EditClassDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
        EditClassDescription.setCellFactory(TextFieldTableCell.forTableColumn());
        EditClassCount.setCellValueFactory(new PropertyValueFactory<>("maxMemberCount"));
        EditClassCount.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        EditClass.setEditable(true);
        EditClass.setItems(classList);

        ViewMemberFirstN.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        ViewMemberLastN.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ViewMemberNID.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        ViewMemberGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        ViewMemberPhoneN.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        ViewMemberType.setCellValueFactory(new PropertyValueFactory<>("membershipType"));
        ViewMemberTable.setEditable(true);
        ViewMemberTable.setItems(list2);
    }

    public void getMembershipType(ActionEvent event) {
        String MembershipType = Membership_combo.getValue();
    }

    public void getTime(ActionEvent event) {
        String Time = Time_combo.getValue();
    }

    public void getDay(ActionEvent event) {
        String Day = Day_combo.getValue();
    }

    public void getGender(ActionEvent event) {
        String Gender = gender_comboBox.getValue();
    }

    public void showViewMemberPane() {
        ViewMember_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showDeleteClassPane() {
        DeleteClass_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showEditClassInfoPane() {
        EditClassInfo_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showAddNewClassPane() {
        CreateNewClass_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showAssignTrToMemPane() {
        AssignTrainerToMem_pane.setVisible(true);
        AssignTrainer_pane.setVisible(false);
    }

    public void showAssignTrToClassPane() {
        AssignTrainerToClass_pane.setVisible(true);
        AssignTrainer_pane.setVisible(false);
    }

    public void showAssignTrainerPane() {
        AssignTrainer_pane.setVisible(true);
        ViewTrainerAcc_pane.setVisible(false);
    }

    public void showDeleteTrainerPane() {
        DeleteTrainer_pane.setVisible(true);
        ViewTrainerAcc_pane.setVisible(false);
    }

    public void showEditTrainerPane() {
        EditTrainer_pane.setVisible(true);
        ViewTrainerAcc_pane.setVisible(false);
    }

    public void showAddTrainerPane() {
        AddTrainer_pane.setVisible(true);
        ViewTrainerAcc_pane.setVisible(false);
    }

    public void showHomePane() {
        Home_pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
        ViewTrainerAcc_pane.setVisible(false);
        AddTrainer_pane.setVisible(false);
        EditTrainer_pane.setVisible(false);
        DeleteTrainer_pane.setVisible(false);
        CreateNewClass_Pane.setVisible(false);
        DeleteClass_Pane.setVisible(false);
        EditClassInfo_Pane.setVisible(false);
        ViewMember_Pane.setVisible(false);
        AssignTrainer_pane.setVisible(false);
        AssignTrainerToClass_pane.setVisible(false);
        AssignTrainerToMem_pane.setVisible(false);
    }

    public void showViewTrainerAccPane() {

        ViewTrainerAcc_pane.setVisible(true);
        Home_pane.setVisible(false);
        AddTrainer_pane.setVisible(false);
        EditTrainer_pane.setVisible(false);
        DeleteTrainer_pane.setVisible(false);
        AssignTrainer_pane.setVisible(false);
        AssignTrainerToClass_pane.setVisible(false);
        AssignTrainerToMem_pane.setVisible(false);
        CreateNewClass_Pane.setVisible(false);
        DeleteClass_Pane.setVisible(false);
        EditClassInfo_Pane.setVisible(false);
        ViewMember_Pane.setVisible(false);
        ViewClasses_Pane.setVisible(false);
    }

    public void showViewClassesPane() {
        ViewClasses_Pane.setVisible(true);
        Home_pane.setVisible(false);
        AddTrainer_pane.setVisible(false);
        EditTrainer_pane.setVisible(false);
        DeleteTrainer_pane.setVisible(false);
        AssignTrainer_pane.setVisible(false);
        AssignTrainerToClass_pane.setVisible(false);
        AssignTrainerToMem_pane.setVisible(false);
        CreateNewClass_Pane.setVisible(false);
        DeleteClass_Pane.setVisible(false);
        EditClassInfo_Pane.setVisible(false);
        ViewMember_Pane.setVisible(false);
        ViewTrainerAcc_pane.setVisible(false);
    }


    Admin admin = new Admin("Admin", "password",
            "Ahmed", "Mostafa", "30209051901011", "M", "01280070695");

    public void addTrainer(ActionEvent event) {
        if (TrainerFirstN.getText().equals("") || TrainerLastN.getText().equals("") || TrainerNID.getText().equals("")
                || TrainerPhoneN.getText().equals("") || gender_comboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender has been specified");
            alert.setContentText("Please Choose a gender and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = TrainerFirstN.getText();
                String lastName = TrainerLastN.getText();
                String nationalID = TrainerNID.getText();
                String phoneNumer = TrainerPhoneN.getText();
                String gender = gender_comboBox.getValue();
                Trainer trainer = new Trainer(firstName, lastName, nationalID, gender, phoneNumer);
                if ((Main.gymAdmin.addTrainer(trainer, Main.gymTrainers)) == false) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Account already exists");
                    alert.setContentText(TrainerFirstN.getText() + " " + TrainerLastN.getText() + " already has an account");
                    alert.show();
                    TrainerFirstN.clear();
                    TrainerLastN.clear();
                    TrainerNID.clear();
                    TrainerPhoneN.clear();
                    gender_comboBox.setPromptText("Gender");
                } else {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("Account successfully added");
                    alert.setContentText(TrainerFirstN.getText() + " " + TrainerLastN.getText() + " successfully added");
                    alert.show();
                    TrainerFirstN.clear();
                    TrainerLastN.clear();
                    TrainerNID.clear();
                    TrainerPhoneN.clear();
                    gender_comboBox.setPromptText("Gender");
                    AddTrainer_pane.setVisible(false);
                    ViewTrainerAcc_pane.setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void editTrainer(ActionEvent event) {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Successful");
            alert.setHeaderText("Successful operation");
            alert.setContentText("All changes have been saved");
            if (alert.showAndWait().get() == ButtonType.OK) {
                EditTrainer_pane.setVisible(false);
                ViewTrainerAcc_pane.setVisible(true);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            exception.getCause();
        }
    }

    public void editClass(ActionEvent event) {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Successful");
            alert.setHeaderText("Successful operation");
            alert.setContentText("All changes have been saved");
            if (alert.showAndWait().get() == ButtonType.OK) {
                EditClassInfo_Pane.setVisible(false);
                ViewClasses_Pane.setVisible(true);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            exception.getCause();
        }
    }

    public void deleteTrainer(ActionEvent event) {
        if (DelTrainerFirstN.getText().equals("") || DelTrainerLastN.getText().equals("")
                || DelTrainerID.getText().equals("") || DelTrainerPhoneN.getText().equals("") || DelGender_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender has been specified");
            alert.setContentText("Please Choose a gender and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = DelTrainerFirstN.getText();
                String lastName = DelTrainerLastN.getText();
                String nationalID = DelTrainerID.getText();
                String phoneNumber = DelTrainerPhoneN.getText();
                String gender = DelGender_combo.getValue();
                Trainer trainer = new Trainer(firstName, lastName, nationalID, gender, phoneNumber);
                if (!Main.gymAdmin.deleteTrainer(trainer, Main.gymTrainers)) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setHeaderText("Are you sure you want to delete this account?");
                    alert.setContentText("You are about to permanently delete " + DelTrainerFirstN.getText() +
                            " " + DelTrainerLastN.getText() + " from the system");
                    if (alert.showAndWait().get() == ButtonType.OK) {
                        Alert alert1 = new Alert(Alert.AlertType.ERROR);
                        alert1.setTitle("ERROR");
                        alert1.setHeaderText("This account doesn't exits");
                        alert1.setContentText(DelTrainerFirstN.getText() + " " + DelTrainerLastN.getText() + " does not exist");
                        alert1.show();
                        DelTrainerFirstN.clear();
                        DelTrainerLastN.clear();
                        DelTrainerID.clear();
                        DelTrainerPhoneN.clear();
                        DelGender_combo.setPromptText("Gender");
                    }
                } else {
                    Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                    alert1.setTitle("Success");
                    alert1.setHeaderText("Account successfully deleted");
                    alert1.setContentText(DelTrainerFirstN.getText() + " " + DelTrainerLastN.getText() + " successfully deleted");
                    alert1.show();
                    DelTrainerFirstN.clear();
                    DelTrainerLastN.clear();
                    DelTrainerID.clear();
                    DelTrainerPhoneN.clear();
                    DelGender_combo.setPromptText("Gender");
                    DeleteTrainer_pane.setVisible(false);
                    ViewTrainerAcc_pane.setVisible(true);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void assignTrainerToClass(ActionEvent event){
        if (ClassName.getText().equals("") || ClassTrainerNID.getText().equals("") || Description.getText().equals("")
                || MemCount.getText().equals("") || Day_combo.getValue() == null || Time_combo.getValue() == null
                || ClassTrainerFirstN.getText().equals("") || ClassTrainerLastN.getText().equals("") || ClassTrainerPhoneN.getText().equals("")
                || ClassTrainerGender_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no Day or Time have been specified");
            alert.setContentText("Please Choose a Day and Time and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = ClassTrainerFirstN.getText();
                String lastName = ClassTrainerLastN.getText();
                String nationalID = ClassTrainerNID.getText();
                String phoneNumber = ClassTrainerPhoneN.getText();
                String gender = ClassTrainerGender_combo.getValue();
                String className = ClassName.getText();
                String description = Description.getText();
                String day = Day_combo.getValue();
                String time = Time_combo.getValue();
                int maxMemCount = Integer.parseInt(MemCount.getText());
                Trainer trainer = new Trainer(firstName, lastName, nationalID, gender, phoneNumber);
                Classes classes = new Classes(className, trainer, day, time, description, maxMemCount);
                if (!Main.gymAdmin.assignTrainerToClass(trainer, classes)) {
                    Alert alert1 = new Alert(Alert.AlertType.ERROR);
                    alert1.setTitle("Error");
                    alert1.setHeaderText("Trainer isn't available");
                    alert1.setContentText(ClassTrainerFirstN.getText() + " " + ClassTrainerLastN.getText() + " cannot be assigned to this class");
                    alert1.show();
                    ClassTrainerFirstN.clear();
                    ClassTrainerLastN.clear();
                    ClassTrainerNID.clear();
                    ClassTrainerPhoneN.clear();
                    ClassTrainerGender_combo.setPromptText("Gender");
                    ClassName.clear();
                    Description.clear();
                    MemCount.clear();
                    Day_combo.setPromptText("Day");
                    Time_combo.setPromptText("Time");
                } else if (Main.gymAdmin.assignTrainerToClass(trainer, classes)) {
                    Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                    alert1.setTitle("Success");
                    alert1.setHeaderText("Trainer successfully assigned to class");
                    alert1.setContentText(ClassTrainerFirstN.getText() + " " + ClassTrainerLastN.getText() + " has been successfully assigned to " + ClassName.getText());
                    alert1.show();
                    ClassTrainerFirstN.clear();
                    ClassTrainerLastN.clear();
                    ClassTrainerNID.clear();
                    ClassTrainerPhoneN.clear();
                    ClassTrainerGender_combo.setPromptText("Gender");
                    ClassName.clear();
                    Description.clear();
                    MemCount.clear();
                    Day_combo.setPromptText("Day");
                    Time_combo.setPromptText("Time");
                    AssignTrainerToClass_pane.setVisible(false);
                    ViewTrainerAcc_pane.setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void createClass(ActionEvent event){
        if (NewClassName.getText().equals("") || NewDescription.getText().equals("") || NewMemCount.getText().equals("")
                || NewDay_combo.getValue() == null || NewTime_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no Day or Time have been specified");
            alert.setContentText("Please Choose a Day and Time and fill in all the fields.");
            alert.show();
        } else {
            try {
                String className = NewClassName.getText();
                String description = NewDescription.getText();
                String day = NewDay_combo.getValue();
                String time = NewTime_combo.getValue();
                int maxMemCount = Integer.parseInt(NewMemCount.getText());
                Classes myClass = new Classes(className, day, time, description, maxMemCount);
                if (Main.gymAdmin.openClass(myClass, Main.gymClasses)) {
                    Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                    alert1.setTitle("Success");
                    alert1.setHeaderText("Class successfully created");
                    alert1.setContentText(NewClassName.getText() + " class successfully created");
                    alert1.show();
                    NewClassName.clear();
                    NewDescription.clear();
                    NewMemCount.clear();
                    NewDay_combo.setPromptText("Day");
                    NewTime_combo.setPromptText("Time");
                    CreateNewClass_Pane.setVisible(false);
                    ViewClasses_Pane.setVisible(true);
                } else {
                    Alert alert1 = new Alert(Alert.AlertType.ERROR);
                    alert1.setTitle("Error");
                    alert1.setHeaderText("Cannot create this class");
                    alert1.setContentText(NewClassName.getText() + " class already exists");
                    alert1.show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteClass(ActionEvent event){
        if (DelClassName.getText().equals("") || DelDescription.getText().equals("") || DelMemCount.getText().equals("")
                || DelDay_combo.getValue() == null || DelTime_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no Day or Time have been specified");
            alert.setContentText("Please Choose a Day and Time and fill in all the fields.");
            alert.show();
        } else {
            try {
                String className = DelClassName.getText();
                String description = DelDescription.getText();
                String day = DelDay_combo.getValue();
                String time = DelTime_combo.getValue();
                int maxMemCount = Integer.parseInt(DelMemCount.getText());
                Classes myClass = new Classes(className, day, time, description, maxMemCount);
                if (Main.gymAdmin.deleteClass(myClass, Main.gymClasses)) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setHeaderText("Are you sure you want to delete this class?");
                    alert.setContentText("You are about to permanently delete " + DelClassName.getText() +
                            " class from the system");
                    if (alert.showAndWait().get() == ButtonType.OK) {
                        Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                        alert1.setTitle("Success");
                        alert1.setHeaderText("Class successfully deleted");
                        alert1.setContentText(DelClassName.getText() + " class successfully deleted");
                        alert1.show();
                        DelClassName.clear();
                        DelDescription.clear();
                        DelMemCount.clear();
                        DelDay_combo.setPromptText("Day");
                        DelTime_combo.setPromptText("time");
                        DeleteClass_Pane.setVisible(false);
                        ViewClasses_Pane.setVisible(true);
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("This class doesn't exits");
                    alert.setContentText(DelClassName.getText() + " class does not exist");
                    alert.show();
                    DelClassName.clear();
                    DelDescription.clear();
                    DelMemCount.clear();
                    DelDay_combo.setPromptText("Day");
                    DelTime_combo.setPromptText("time");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void assignTrainerToMember(ActionEvent event) {
        if (MemberFirstN.getText().equals("") || MemberLastN.getText().equals("") || MemberNID.getText().equals("")
                || MemberPhoneN.getText().equals("") || AssignTrainerFirstN.getText().equals("") || AssignTrainerLastN.getText().equals("")
                || AssignTrainerPhoneN.getText().equals("") || MemberGender_combo.getValue() == null || MemberMembership_combo.getValue() == null
                || TrainerGender_combo.getValue() == null || AssignTrainerNID.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no Gender or Membership type have been specified");
            alert.setContentText("Please Choose a Gender and Membership type and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = AssignTrainerFirstN.getText();
                String lastName = AssignTrainerLastN.getText();
                String nationalID = AssignTrainerNID.getText();
                String phoneNumber = AssignTrainerPhoneN.getText();
                String gender = TrainerGender_combo.getValue();
                Trainer trainer = new Trainer(firstName, lastName, nationalID, gender, phoneNumber);
                String memberFirstName = MemberFirstN.getText();
                String memberLastName = MemberLastN.getText();
                String memberNationalID = MemberNID.getText();
                String memberPhoneNumber = MemberPhoneN.getText();
                String memberGender = MemberGender_combo.getValue();
                String memberMembershipType = MemberMembership_combo.getValue();
                Member member = new Member(memberFirstName, memberLastName, memberNationalID, memberGender, memberPhoneNumber, memberMembershipType);
                if (Main.gymAdmin.assignTrainerToMember(trainer, member) == true) {
                    Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                    alert1.setTitle("Success");
                    alert1.setHeaderText("Trainer successfully assigned to member");
                    alert1.setContentText(AssignTrainerFirstN.getText() + " " + AssignTrainerLastN.getText() + " has been successfully assigned to "
                            + MemberFirstN.getText() + " " + MemberLastN);
                    alert1.show();
                    AssignTrainerFirstN.clear();
                    AssignTrainerLastN.clear();
                    AssignTrainerNID.clear();
                    AssignTrainerPhoneN.clear();
                    MemberFirstN.clear();
                    MemberLastN.clear();
                    MemberPhoneN.clear();
                    MemberNID.clear();
                    TrainerGender_combo.setPromptText("Gender");
                    MemberMembership_combo.setPromptText("Membership Type");
                    MemberGender_combo.setPromptText("Gender");
                    AssignTrainerToMem_pane.setVisible(false);
                    ViewTrainerAcc_pane.setVisible(true);
                } else {
                    Alert alert1 = new Alert(Alert.AlertType.ERROR);
                    alert1.setTitle("Error");
                    alert1.setHeaderText("Trainer isn't available");
                    alert1.setContentText(AssignTrainerFirstN.getText() + " " + AssignTrainerLastN.getText() + " cannot be assigned to this member");
                    alert1.show();
                    AssignTrainerFirstN.clear();
                    AssignTrainerLastN.clear();
                    AssignTrainerNID.clear();
                    AssignTrainerPhoneN.clear();
                    MemberFirstN.clear();
                    MemberLastN.clear();
                    MemberPhoneN.clear();
                    MemberNID.clear();
                    TrainerGender_combo.setPromptText("Gender");
                    MemberMembership_combo.setPromptText("Membership Type");
                    MemberGender_combo.setPromptText("Gender");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void viewMemberWith(ActionEvent event) {
        if (ViewClassMember.getText().equals("") && Membership_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Class name or Membership type are empty");
            alert.setContentText("Please enter a class name in the text field or choose a Membership Type");
            alert.show();
        } else {
            String className = ViewClassMember.getText();
            String membershipType = Membership_combo.getValue();
            if(!ViewClassMember.getText().equals("") && Main.findClass(className, Main.gymClasses) != null && membershipType == null){
                Classes myClass = Main.findClass(className, Main.gymClasses);
                List<Person> viewClassMembers = new ArrayList<>();
                for (int i = 0; i < myClass.getMembers().size(); i++) {

                    viewClassMembers.add(myClass.getMembers().get(i));
                }
                ObservableList<Person> list1 = FXCollections.observableArrayList(viewClassMembers);
                if (Main.gymEmployee.viewMembersInClass(myClass) != null && Membership_combo.getValue() == null) {
                    ViewMemberFirstN.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                    ViewMemberLastN.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                    ViewMemberNID.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
                    ViewMemberGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
                    ViewMemberPhoneN.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
                    ViewMemberType.setCellValueFactory(new PropertyValueFactory<>("membershipType"));
                    ViewMemberTable.setEditable(true);
                    ViewMemberTable.setItems(list1);
                    ViewClassMember.clear();
                }}
            else if (membershipType!= null && Main.gymAdmin.viewMembersInSpecificMembership(membershipType.toUpperCase(Locale.ROOT), Main.gymMembers) != null
                        && ViewClassMember.getText().equals("")) {
                    ObservableList<Person> list2 = FXCollections.observableArrayList(Main.gymAdmin.viewMembersInSpecificMembership(membershipType.toUpperCase(Locale.ROOT)
                            , Main.gymMembers));
                    ViewMemberFirstN.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                    ViewMemberLastN.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                    ViewMemberNID.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
                    ViewMemberGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
                    ViewMemberPhoneN.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
                    ViewMemberType.setCellValueFactory(new PropertyValueFactory<>("membershipType"));
                    ViewMemberTable.setEditable(true);
                    ViewMemberTable.setItems(list2);
                    Membership_combo.setPromptText("Membership Type");
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Only one field must be filled");
                    alert.setContentText("Please fill only one data field");
                    alert.show();
                }
            }
        }
    }



