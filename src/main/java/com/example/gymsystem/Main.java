package com.example.gymsystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.Month;
import java.util.*;

import static javafx.application.Application.launch;

public class Main extends Application implements Initializable {

    @FXML
    private Button Check_btn;

    @FXML
    private Button FinalRegAccPane_btn;

    @FXML
    private Pane FinalRegAcc_pane;

    @FXML
    private ComboBox<String> Gender_combo;

    @FXML
    private TextField RegCheck;

    @FXML
    private Button RegCreateAcc_btn;

    @FXML
    private TextField RegFirstN;

    @FXML
    private TextField RegLastN;

    @FXML
    private TextField RegNationalID;

    @FXML
    private PasswordField RegPassword;

    @FXML
    private TextField RegPhoneN;

    @FXML
    private TextField RegUserName;

    @FXML
    private Pane createAcc_pane;

    @FXML
    private Button goBack_btn;

    @FXML
    private Button login_btn;

    @FXML
    private Pane login_pane;

    @FXML
    private PasswordField password;

    @FXML
    private Button registerAcc;

    @FXML
    private ComboBox<String> type;

    @FXML
    private TextField userName;


    //    static Scanner myScanner = new Scanner(System.in);
    public static String adminUsername;
    public static String adminPassword;
    public static String employeeUsername;
    public static String employeePassword;
    public static String employeeNationalID;
//    public static String UserName = userName.getText();

    static Employee gymEmployee = new Employee("EM1234", "13456", "Ahmed",
            "Mostafa", "123", "Male", "01280070695");
    static Employee gymEmployee2 = new Employee("Employee", "123456", "Ziyad",
            "Mahmoud", "1234", "Male", "0987654321");


    static Admin gymAdmin = new Admin("Admin", "password", "Ahmed", "Mostafa", "30209051901011", "Male", "01280070695");

    static Classes myClasses = new Classes("Dance", "Sunday", "12:00-13:00",
            "Advanced dancers", 15);
    static Classes myClasses2 = new Classes("CrossFit", "Monday", "13:00-14:00",
            "Beginners allowed", 25);

    static Trainer myTrainer = new Trainer("Ziyad", "Mahmoud", "123400", "Male", "12345");
    static Trainer myTrainer2 = new Trainer("Ahmed", "Mostafa", "004321", "Male", "54321");
    static Trainer myTrainer3 = new Trainer("Mohamed", "Ali", "001234", "Male", "67890");

    static Member myMember = new Member("Tamer", "Ihab", "5678", "Male",
            "000000", "PAYG");
    static Member myMember2 = new Member("Osama", "Khaled", "220033", "Male",
            "098765434", "Open Membership");
    static Member myMember3 = new Member("Tasama", "Khab", "3456765", "Female",
            "573687492", "Term Membership");

    static List<Person> gymAdmins = new ArrayList<>();
    static List<Person> gymTrainers = new ArrayList<>();
    static List<Classes> gymClasses = new ArrayList<>();
    static List<Person> gymMembers = new ArrayList<>();
    static List<Person> gymEmployees = new ArrayList<>();

    public static void main(String[] args) {

        gymAdmins.add(gymAdmin);

        gymEmployees.add(gymEmployee);
        gymEmployees.add(gymEmployee2);

        gymClasses.add(myClasses);
        gymClasses.add(myClasses2);

        gymTrainers.add(myTrainer);
        gymTrainers.add(myTrainer2);
        gymTrainers.add(myTrainer3);

        gymMembers.add(myMember);
        gymMembers.add(myMember2);
        gymMembers.add(myMember3);

        launch();
    }





    public static Person findPerson(String nationalID, List<Person> personList) {

        if (!personList.isEmpty()) {
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getNationalID().equals(nationalID)) {
                    System.out.println("Found");
                    return personList.get(i);
                } else {
                    System.out.println("Not Found");
                }
            }
        }
        return null;
    }

    public static Person findUser(String userName, List<Person> personList, String type) {

        if (type.equals("Employee")) {
            if (!personList.isEmpty()) {
                for (int i = 0; i < personList.size(); i++) {
                    Employee employee = (Employee) personList.get(i);
                    if (employee.getUsername().equals(userName)) {
                        System.out.println("Found");
                        return personList.get(i);
                    } else {
                        System.out.println("Not Found");
                    }
                }
            }
        }
        return null;
    }

    public static Classes findClass(String className, List<Classes> classesList){
        if (!classesList.isEmpty()){
            for (int i = 0; i < classesList.size(); i++) {
                if (classesList.get(i).getName().equals(className)){
                    return classesList.get(i);
                }
            }
        } return null;
    }



    @FXML
    public void showFinalRegPane() {
        FinalRegAcc_pane.setVisible(true);
        createAcc_pane.setVisible(false);
    }

    @FXML
    public void createAcc() {
        login_pane.setVisible(false);
        createAcc_pane.setVisible(true);
    }

    @FXML
    public void backToMain() {
        login_pane.setVisible(true);
        createAcc_pane.setVisible(false);
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        if (type.getValue() == null || userName.getText().equals("") || password.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no user type has been specified");
            alert.setContentText("Please Choose a user type and fill in the fields.");
            alert.show();
        } else {
            String userNameText = userName.getText();
            String passwordText = password.getText();
//            String userType = type.getValue();
            Admin admin = (Admin) findUser(userNameText, gymAdmins, "Administrator");
            Employee employee = (Employee) findUser(userNameText, gymEmployees, "Employee");
            try {
                if (type.getValue().equals("Administrator")) {
                    if (admin == null || !password.getText().equals(admin.getPassword())) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Incorrect Login Information");
                        alert.setHeaderText("Incorrect Username or Password");
                        alert.setContentText("Pleaser Try again.");
                        alert.show();
                    } else if ((userName.getText().equals(admin.getUsername()) && password.getText().equals(admin.getPassword()))) {
                        Stage stage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.centerOnScreen();
                        stage.setScene(scene);
                        stage.show();
                    }
                } else if (type.getValue().equals("Employee")) {
                    if (employee == null || !password.getText().equals(employee.getPassword())) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Incorrect Login Information");
                        alert.setHeaderText("Incorrect Username or Password");
                        alert.setContentText("Pleaser Try again.");
                        alert.show();
                    } else if ((userName.getText().equals(employee.getUsername())) && password.getText().equals(employee.getPassword())) {
                        Stage stage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("Employee.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.centerOnScreen();
                        stage.setScene(scene);
                        stage.show();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getCause());
            }
        }
    }


    @FXML
    public void registerAcc(ActionEvent event) {
        if (RegCheck.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Field");
            alert.setHeaderText("Field are empty");
            alert.setContentText("Please fill in the field.");
            alert.show();
        } else {
            try {
                String ID = RegCheck.getText();
                employeeNationalID = ID;
                if (findPerson(ID, gymEmployees) != null) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Account already exists");
                    alert.setContentText("The National ID you entered belongs to an account");
                    alert.show();
                    createAcc_pane.setVisible(false);
                    login_pane.setVisible(true);
                } else {
                    RegUserName.setDisable(false);
                    RegPassword.setDisable(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void registerAcc2() {
        if (RegUserName.getText().equals("") || RegPassword.getText().equals("") || RegFirstN.getText().equals("")
                || RegLastN.getText().equals("") || RegNationalID.getText().equals("") || RegPhoneN.getText().equals("")
                || Gender_combo.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText("Fields are empty or no gender has been specified");
            alert.setContentText("Please Choose a gender and fill in the fields.");
            alert.show();
        } else {
            try {
                String userName = RegUserName.getText();
                String password = RegPassword.getText();
                String firstName = RegFirstN.getText();
                String lastName = RegLastN.getText();
                String nationalID = RegNationalID.getText();
                String phoneNumber = RegPhoneN.getText();
                String gender = Gender_combo.getValue();
                Employee employee = new Employee(userName, password, firstName, lastName, nationalID, gender, phoneNumber);
                if (employee.register(gymEmployees) == true) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("Account successfully created");
                    alert.setContentText(RegFirstN.getText() + " " + RegLastN.getText() + " successfully added");
                    alert.show();
                    RegCheck.clear();
                    RegUserName.clear();
                    RegPassword.clear();
                    RegFirstN.clear();
                    RegLastN.clear();
                    RegNationalID.clear();
                    RegPhoneN.clear();
                    Gender_combo.setPromptText("Gender");
                    RegUserName.setDisable(true);
                    RegPassword.setDisable(true);
                    FinalRegAcc_pane.setVisible(false);
                    login_pane.setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();
            Main controller = loader.getController();
            Scene scene = new Scene(root);
//            String css = this.getClass().getResource("Buttons.css").toExternalForm();
//            String css1 = this.getClass().getResource("Register.css").toExternalForm();
//            scene.getStylesheets().add(css);
//            scene.getStylesheets().add(css1);
//            stage.setResizable(true);
            Image icon = new Image("logo.png");
            stage.getIcons().add(icon);

            stage.centerOnScreen();

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getCause());
        }
    }


    String[] items = {"Administrator", "Employee"};
    String[] Gender = {"Male", "Female"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        type.getItems().addAll(items);
        type.setOnAction(this::getItems);
        Gender_combo.getItems().addAll(Gender);
        Gender_combo.setOnAction(this::getGender);
    }

    public void getItems(ActionEvent e) {
        String items = type.getValue();
    }

    public void getGender(ActionEvent event) {
        String Gender = Gender_combo.getValue();
    }

}