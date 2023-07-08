package com.example.gymsystem;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class EController implements Initializable {

    @FXML
    private ComboBox<String> AddClassDay_combo;

    @FXML
    private TextField AddClassDescription;

    @FXML
    private TextField AddClassMemCount;

    @FXML
    private Button AddClassMember_btn;

    @FXML
    private TextField AddClassName;

    @FXML
    private ComboBox<String> AddClassTime_combo;

    @FXML
    private TextField AddFirstN;

    @FXML
    private TextField AddLastN;

    @FXML
    private Button AddMemToClassPane_btn;

    @FXML
    private AnchorPane AddMemberToClass_Pane;

    @FXML
    private Button AddMember_btn;

    @FXML
    private TextField AddNationalID;

    @FXML
    private Button AddNewMemberPane_btn;

    @FXML
    private AnchorPane AddNewMember_pane;

    @FXML
    private TextField AddPhoneN;

    @FXML
    private TextField ClassMemFirstN;

    @FXML
    private ComboBox<String> ClassMemGender_combo;

    @FXML
    private TextField ClassMemLastN;

    @FXML
    private TextField ClassMemNID;

    @FXML
    private TextField ClassMemPhoneN;

    @FXML
    private ComboBox<String> ClassMemType_combo;

    @FXML
    private Button Class_btn;

    @FXML
    private TextField DelFirstN;

    @FXML
    private ComboBox<String> DelGender_combo;

    @FXML
    private TextField DelLastN;

    @FXML
    private ComboBox<String> DelMemType_combo;

    @FXML
    private Button DelMember_btn;

    @FXML
    private TextField DelNationalID;

    @FXML
    private TextField DelPhoneN;

    @FXML
    private AnchorPane DeleteAcc_pane;

    @FXML
    private Button DeleteMemberPane_btn;

    @FXML
    private Button EditMemberPane_btn;

    @FXML
    private AnchorPane EditMember_pane;

    @FXML
    private Button Home_btn;

    @FXML
    private AnchorPane Home_pane;

    @FXML
    private Button Logout;

    @FXML
    private ComboBox<String> Membership_comboBox;

    @FXML
    private ComboBox<String> RemoveClassDay_combo;

    @FXML
    private TextField RemoveClassDescription;

    @FXML
    private TextField RemoveClassMemCount;

    @FXML
    private TextField RemoveClassMemFirstN;

    @FXML
    private ComboBox<String> RemoveClassMemGender_combo;

    @FXML
    private TextField RemoveClassMemLastN;

    @FXML
    private TextField RemoveClassMemNID;

    @FXML
    private TextField RemoveClassMemPhoneN;

    @FXML
    private ComboBox<String> RemoveClassMemType_combo;

    @FXML
    private TextField RemoveClassName;

    @FXML
    private ComboBox<String> RemoveClassTime_combo;

    @FXML
    private Button RemoveMemFromClassPane_btn;

    @FXML
    private Button RemoveMemFromClass_btn;

    @FXML
    private AnchorPane RemoveMemberFromClass_Pane;

    @FXML
    private Button Settings_btn;

    @FXML
    private AnchorPane Settings_pane;

    @FXML
    private AnchorPane ViewClasses_Pane;

    @FXML
    private Button ViewMemInClassPane_btn;

    @FXML
    private AnchorPane ViewMemberAcc_pane;

    @FXML
    private AnchorPane ViewMemberInClass_Pane;

    @FXML
    private ComboBox<String> gender_comboBox;

    @FXML
    private Button membr_btn;

    @FXML
    private TableColumn<Person, String> EditMemberFirstN;

    @FXML
    private TableColumn<Person, String> EditMemberGender;

    @FXML
    private TableColumn<Person, String> EditMemberLastN;

    @FXML
    private TableColumn<Person, String> EditMemberNationalID;

    @FXML
    private TableColumn<Person, String> EditMemberPhoneN;

    @FXML
    private TableColumn<Person, String> EditMemberType;

    @FXML
    private TableView<Person> EditMemberData;

    @FXML
    private Button EditMemberData_btn;

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
    private TextField FindMemberInClass;

    @FXML
    private Button CheckFind_btn;

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

    ObservableList<Person> list = FXCollections.observableArrayList(Main.gymMembers);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gender_comboBox.getItems().addAll(Gender);
        gender_comboBox.setOnAction(this::getGender);
        Membership_comboBox.getItems().addAll(MemberShipType);
        Membership_comboBox.setOnAction(this::getMembershipType);
        DelGender_combo.getItems().addAll(Gender);
        DelGender_combo.setOnAction(this::getGender);
        DelMemType_combo.getItems().addAll(MemberShipType);
        DelMemType_combo.setOnAction(this::getMembershipType);
        AddClassDay_combo.getItems().addAll(Day);
        AddClassDay_combo.setOnAction(this::getDay);
        AddClassTime_combo.getItems().addAll(Time);
        AddClassTime_combo.setOnAction(this::getTime);
        ClassMemGender_combo.getItems().addAll(Gender);
        ClassMemGender_combo.setOnAction(this::getGender);
        ClassMemType_combo.getItems().addAll(MemberShipType);
        ClassMemType_combo.setOnAction(this::getMembershipType);
        RemoveClassMemGender_combo.getItems().addAll(Gender);
        RemoveClassMemGender_combo.setOnAction(this::getGender);
        RemoveClassMemType_combo.getItems().addAll(MemberShipType);
        RemoveClassMemType_combo.setOnAction(this::getMembershipType);
        RemoveClassDay_combo.getItems().addAll(Day);
        RemoveClassDay_combo.setOnAction(this::getDay);
        RemoveClassTime_combo.getItems().addAll(Time);
        RemoveClassTime_combo.setOnAction(this::getTime);

        EditMemberFirstN.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        EditMemberFirstN.setCellFactory(TextFieldTableCell.forTableColumn());
        EditMemberLastN.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        EditMemberLastN.setCellFactory(TextFieldTableCell.forTableColumn());
        EditMemberNationalID.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        EditMemberNationalID.setCellFactory(TextFieldTableCell.forTableColumn());
        EditMemberPhoneN.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        EditMemberPhoneN.setCellFactory(TextFieldTableCell.forTableColumn());
        EditMemberGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        EditMemberGender.setCellFactory(TextFieldTableCell.forTableColumn());
        EditMemberType.setCellValueFactory(new PropertyValueFactory<>("membershipType"));
        EditMemberType.setCellFactory(TextFieldTableCell.forTableColumn());
        EditMemberData.setItems(list);
        EditMemberData.setEditable(true);

        ViewMemberFirstN.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        ViewMemberLastN.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ViewMemberNID.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
        ViewMemberGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        ViewMemberPhoneN.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        ViewMemberType.setCellValueFactory(new PropertyValueFactory<>("membershipType"));
        ViewMemberTable.setEditable(true);
        ViewMemberTable.setItems(list);
    }

    public void getTime(ActionEvent event) {
        String Time = AddClassTime_combo.getValue();
    }

    public void getDay(ActionEvent event) {
        String Day = AddClassDay_combo.getValue();
    }

    public void getGender(ActionEvent event) {
        String Gender = gender_comboBox.getValue();
    }

    public void getMembershipType(ActionEvent event) {
        String MembershipType = Membership_comboBox.getValue();
    }

    public void showViewMemInClassPane() {
        ViewMemberInClass_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showRemoveMemFromClassPane() {
        RemoveMemberFromClass_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showAddMemToClassPane() {
        AddMemberToClass_Pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
    }

    public void showDeleteAccPane() {
        DeleteAcc_pane.setVisible(true);
        ViewMemberAcc_pane.setVisible(false);
    }

    public void showEditMemberPane() {
        EditMember_pane.setVisible(true);
        ViewMemberAcc_pane.setVisible(false);
    }

    public void showAddNewMemberPane() {
        AddNewMember_pane.setVisible(true);
        ViewMemberAcc_pane.setVisible(false);
    }

    public void showHomePane() {
        Home_pane.setVisible(true);
        ViewClasses_Pane.setVisible(false);
        ViewMemberAcc_pane.setVisible(false);
        AddNewMember_pane.setVisible(false);
        EditMember_pane.setVisible(false);
        DeleteAcc_pane.setVisible(false);
        AddMemberToClass_Pane.setVisible(false);
        RemoveMemberFromClass_Pane.setVisible(false);
        ViewMemberInClass_Pane.setVisible(false);
    }

    public void showViewMemberPane() {
        Home_pane.setVisible(false);
        ViewClasses_Pane.setVisible(false);
        ViewMemberAcc_pane.setVisible(true);
        AddNewMember_pane.setVisible(false);
        EditMember_pane.setVisible(false);
        DeleteAcc_pane.setVisible(false);
        AddMemberToClass_Pane.setVisible(false);
        RemoveMemberFromClass_Pane.setVisible(false);
        ViewMemberInClass_Pane.setVisible(false);
    }

    public void showViewClassPane() {
        Home_pane.setVisible(false);
        ViewClasses_Pane.setVisible(true);
        ViewMemberAcc_pane.setVisible(false);
        AddNewMember_pane.setVisible(false);
        EditMember_pane.setVisible(false);
        DeleteAcc_pane.setVisible(false);
        AddMemberToClass_Pane.setVisible(false);
        RemoveMemberFromClass_Pane.setVisible(false);
        ViewMemberInClass_Pane.setVisible(false);
    }


    public void addMember(ActionEvent event) {
        if (AddFirstN.getText().equals("") || AddLastN.getText().equals("") || AddNationalID.getText().equals("")
                || AddPhoneN.getText().equals("") || gender_comboBox.getValue() == null || Membership_comboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender or Membership type has been specified");
            alert.setContentText("Please Choose a gender and a Membership type and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = AddFirstN.getText();
                String lastName = AddLastN.getText();
                String nationalID = AddNationalID.getText();
                String phoneNumber = AddPhoneN.getText();
                String gender = gender_comboBox.getValue();
                String membershipType = Membership_comboBox.getValue();
                Member member = new Member(firstName, lastName, nationalID, gender, phoneNumber, membershipType);
                if (Main.gymEmployee.addMember(member, Main.gymMembers) == true) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("Member successfully added");
                    alert.setContentText(AddFirstN.getText() + " " + AddLastN.getText() + " successfully added");
                    alert.show();
                    AddFirstN.clear();
                    AddLastN.clear();
                    AddNationalID.clear();
                    AddPhoneN.clear();
                    gender_comboBox.setPromptText("Gender");
                    Membership_comboBox.setPromptText("Membership Type");
                    AddNewMember_pane.setVisible(false);
                    ViewMemberAcc_pane.setVisible(true);
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Account already exists");
                    alert.setContentText(AddFirstN.getText() + " " + AddLastN.getText() + " already has an account");
                    alert.show();
                    AddFirstN.clear();
                    AddLastN.clear();
                    AddNationalID.clear();
                    AddPhoneN.clear();
                    gender_comboBox.setPromptText("Gender");
                    Membership_comboBox.setPromptText("Membership Type");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void editMember(ActionEvent event) {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Successful");
            alert.setHeaderText("Successful operation");
            alert.setContentText("All changes have been saved");
            if (alert.showAndWait().get() == ButtonType.OK) {
                EditMember_pane.setVisible(false);
                ViewMemberAcc_pane.setVisible(true);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            exception.getCause();
        }
    }

    public void deleteMember(ActionEvent event) {
        if (DelFirstN.getText().equals("") || DelLastN.getText().equals("") || DelNationalID.getText().equals("")
                || DelPhoneN.getText().equals("") || DelGender_combo.getValue() == null || DelMemType_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender or Membership type has been specified");
            alert.setContentText("Please Choose a gender and a Membership type and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = DelFirstN.getText();
                String lastName = DelLastN.getText();
                String nationalID = DelNationalID.getText();
                String phoneNumber = DelPhoneN.getText();
                String gender = DelGender_combo.getValue();
                String membershipType = DelMemType_combo.getValue();
                Member member = new Member(firstName, lastName, nationalID, gender, phoneNumber, membershipType);
                if (Main.gymEmployee.deleteMember(member, Main.gymMembers) == true) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setHeaderText("Are you sure you want to delete this account?");
                    alert.setContentText("You are about to permanently delete " + DelFirstN.getText() +
                            " " + DelLastN.getText() + " from the system");
                    if (alert.showAndWait().get() == ButtonType.OK) {
                        Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                        alert1.setTitle("Success");
                        alert1.setHeaderText("Account successfully deleted");
                        alert1.setContentText(DelFirstN.getText() + " " + DelLastN.getText() + " successfully deleted");
                        alert1.show();
                        DelFirstN.clear();
                        DelLastN.clear();
                        DelNationalID.clear();
                        DelPhoneN.clear();
                        DelGender_combo.setPromptText("Gender");
                        DelMemType_combo.setPromptText("Membership Type");
                        DeleteAcc_pane.setVisible(false);
                        ViewMemberAcc_pane.setVisible(true);
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("This member doesn't exists");
                    alert.setContentText(DelFirstN.getText() + " " + DelLastN.getText() + " does not exist");
                    alert.show();
                    DelFirstN.clear();
                    DelLastN.clear();
                    DelNationalID.clear();
                    DelPhoneN.clear();
                    DelGender_combo.setPromptText("Gender");
                    DelMemType_combo.setPromptText("Membership Type");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void addMemberToClass(ActionEvent event) {
        if (ClassMemFirstN.getText().equals("") || ClassMemLastN.getText().equals("") || ClassMemNID.getText().equals("")
                || ClassMemPhoneN.getText().equals("") || AddClassName.getText().equals("") || AddClassDescription.getText().equals("")
                || AddClassMemCount.getText().equals("") || ClassMemGender_combo.getValue() == null || ClassMemType_combo.getValue() == null
                || AddClassDay_combo.getValue() == null || AddClassTime_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender or Membership type or Day or Time has been specified");
            alert.setContentText("Please Choose a gender and Membership type and Class Day and Time and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = ClassMemFirstN.getText();
                String lastName = ClassMemLastN.getText();
                String nationalID = ClassMemNID.getText();
                String phoneNumber = ClassMemPhoneN.getText();
                String gender = ClassMemGender_combo.getValue();
                String membershipType = ClassMemType_combo.getValue();
                Member member = (Member) Main.findPerson(nationalID, Main.gymMembers);
                String className = AddClassName.getText();
                String description = AddClassDescription.getText();
                String day = AddClassDay_combo.getValue();
                String time = AddClassTime_combo.getValue();
                int maxMemCount = Integer.parseInt(AddClassMemCount.getText());
                Classes myClass = Main.findClass(className, Main.gymClasses);
                if (Main.gymEmployee.addMemberToClass(member, myClass) == true) {
                    Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                    alert1.setTitle("Success");
                    alert1.setHeaderText("Member successfully added to class");
                    alert1.setContentText(ClassMemFirstN.getText() + " " + ClassMemLastN.getText() + " has been successfully added to " + AddClassName.getText() + " class");
                    alert1.show();
                    ClassMemFirstN.clear();
                    ClassMemLastN.clear();
                    ClassMemNID.clear();
                    ClassMemPhoneN.clear();
                    ClassMemGender_combo.setPromptText("Gender");
                    ClassMemType_combo.setPromptText("Membership Type");
                    AddClassName.clear();
                    AddClassDescription.clear();
                    AddClassMemCount.clear();
                    AddClassDay_combo.setPromptText("Day");
                    AddClassTime_combo.setPromptText("Time");
                    AddMemberToClass_Pane.setVisible(false);
                    ViewClasses_Pane.setVisible(true);
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("This class is full");
                    alert.setContentText(ClassMemFirstN.getText() + " " + ClassMemLastN.getText() + " cannot be added to " + AddClassName.getText() + " class because it is full");
                    alert.show();
                    ClassMemFirstN.clear();
                    ClassMemLastN.clear();
                    ClassMemNID.clear();
                    ClassMemPhoneN.clear();
                    ClassMemGender_combo.setPromptText("Gender");
                    ClassMemType_combo.setPromptText("Membership Type");
                    AddClassName.clear();
                    AddClassDescription.clear();
                    AddClassMemCount.clear();
                    AddClassDay_combo.setPromptText("Day");
                    AddClassTime_combo.setPromptText("Time");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void removeMemberFromClass(ActionEvent event) {
        if (RemoveClassMemFirstN.getText().equals("") || RemoveClassMemLastN.getText().equals("") || RemoveClassMemNID.getText().equals("")
                || RemoveClassMemPhoneN.getText().equals("") || RemoveClassName.getText().equals("") || RemoveClassDescription.getText().equals("")
                || RemoveClassMemCount.getText().equals("") || RemoveClassMemGender_combo.getValue() == null || RemoveClassMemType_combo.getValue() == null
                || RemoveClassDay_combo.getValue() == null || RemoveClassTime_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender or Membership type or Day or Time has been specified");
            alert.setContentText("Please Choose a gender and Membership type and Class Day and Time and fill in the fields.");
            alert.show();
        } else {
            try {
                String firstName = RemoveClassMemFirstN.getText();
                String lastName = RemoveClassMemLastN.getText();
                String nationalID = RemoveClassMemNID.getText();
                String phoneNumber = RemoveClassMemPhoneN.getText();
                String gender = RemoveClassMemGender_combo.getValue();
                String membershipType = RemoveClassMemType_combo.getValue();
                Member member = new Member(firstName, lastName, nationalID, gender, phoneNumber, membershipType);
                String className = RemoveClassName.getText();
                String description = RemoveClassDescription.getText();
                String day = RemoveClassDay_combo.getValue();
                String time = RemoveClassTime_combo.getValue();
                int maxMemCount = Integer.parseInt(RemoveClassMemCount.getText());
                Classes myClass = new Classes(className, day, time, description, maxMemCount);
                if (Main.gymEmployee.removeMemberFromClass(member, myClass) == true) {
                    Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                    alert1.setTitle("Success");
                    alert1.setHeaderText("Member successfully removed to class");
                    alert1.setContentText(RemoveClassMemFirstN.getText() + " " + RemoveClassMemLastN.getText() + " has been successfully removed from " + RemoveClassName.getText() + " class");
                    alert1.show();
                    RemoveClassMemFirstN.clear();
                    RemoveClassMemLastN.clear();
                    RemoveClassMemNID.clear();
                    RemoveClassMemPhoneN.clear();
                    RemoveClassMemGender_combo.setPromptText("Gender");
                    RemoveClassMemType_combo.setPromptText("Membership Type");
                    RemoveClassName.clear();
                    RemoveClassDescription.clear();
                    RemoveClassMemCount.clear();
                    RemoveClassDay_combo.setPromptText("Day");
                    RemoveClassTime_combo.setPromptText("Time");
                    RemoveMemberFromClass_Pane.setVisible(false);
                    ViewClasses_Pane.setVisible(true);
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("This member isn't in the class");
                    alert.setContentText(ClassMemFirstN.getText() + " " + ClassMemLastN.getText() + " cannot be found in " + AddClassName.getText() + " class");
                    alert.show();
                    RemoveClassMemFirstN.clear();
                    RemoveClassMemLastN.clear();
                    RemoveClassMemNID.clear();
                    RemoveClassMemPhoneN.clear();
                    RemoveClassMemGender_combo.setPromptText("Gender");
                    RemoveClassMemType_combo.setPromptText("Membership Type");
                    RemoveClassName.clear();
                    RemoveClassDescription.clear();
                    RemoveClassMemCount.clear();
                    RemoveClassDay_combo.setPromptText("Day");
                    RemoveClassTime_combo.setPromptText("Time");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void findMemberInClass(ActionEvent event) {
        if (FindMemberInClass.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Field");
            alert.setHeaderText("Class name field is empty");
            alert.setContentText("Please enter a class name in the text field");
            alert.show();
        } else {
            String className = FindMemberInClass.getText();
            Classes myClass = Main.findClass(className, Main.gymClasses);
            List<Person> viewClassMembers = new ArrayList<>();
            for (int i = 0; i < myClass.getMembers().size(); i++) {

                viewClassMembers.add(myClass.getMembers().get(i));
            }
            System.out.println(viewClassMembers);
            ObservableList<Person> list1 = FXCollections.observableArrayList(viewClassMembers);
            if (Main.gymEmployee.viewMembersInClass(myClass) != null) {
                ViewMemberFirstN.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                ViewMemberLastN.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                ViewMemberNID.setCellValueFactory(new PropertyValueFactory<>("nationalID"));
                ViewMemberGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
                ViewMemberPhoneN.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
                ViewMemberType.setCellValueFactory(new PropertyValueFactory<>("membershipType"));
                ViewMemberTable.setEditable(true);
                ViewMemberTable.setItems(list1);
                FindMemberInClass.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("No members");
                alert.setContentText("There are no members in this class");
                alert.show();
            }
        }
    }

}
