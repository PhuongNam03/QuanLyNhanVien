/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nvn.fxquanlinhanvien;

import com.nvn.conf.JdbcUtils;
import com.nvn.conf.Utils;
import com.nvn.service.AccountService;
import com.pojo.Account;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class FXMLAccountController implements Initializable {
    @FXML private TableView<Account> tbvAccount;
    @FXML private TextField txtAccount;
    @FXML private TextField txtPass;
    @FXML private TextField txtId;
    
    ObservableList<Account> accountList = FXCollections.observableArrayList();
    /** 
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
             this.loadTableView();
        AccountService S = new AccountService();
        this.tbvAccount.setItems(FXCollections.observableList(S.getAccounts()));
        //Utils.getBox("Thêm tài khoản mới thành công", Alert.AlertType.INFORMATION).show();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLAccountController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }    
    
    public void loadTableView(){
        TableColumn colId = new TableColumn("Mã TK");
        colId.setCellValueFactory(new PropertyValueFactory("id")); 
        colId.setPrefWidth(100);
        
        TableColumn colaccName = new TableColumn("Tài khoản");
        colaccName.setCellValueFactory(new PropertyValueFactory("accName")); 
        colaccName.setPrefWidth(300);
        
        TableColumn colpass = new TableColumn("Mật khẩu");
        colpass.setCellValueFactory(new PropertyValueFactory("password")); 
        colpass.setPrefWidth(300);
        
        
        this.tbvAccount.getColumns().addAll(colId,colaccName,colpass);
    }
    
    public void addAccountHandler(ActionEvent event) throws SQLException{
        Account a = new Account(txtAccount.getText(),txtPass.getText());
        AccountService s = new AccountService();
        s.addAccount(a);
    }
    
    public void delAccountHandler(ActionEvent event) throws SQLException{
        AccountService s = new AccountService();
        s.delAccount(Integer.parseInt(this.txtId.getText()));   
    }

    public void refreshTable(ActionEvent event) throws SQLException{
       
       accountList.clear();
       
       String sql = "SELECT * FROM account";
        try(Connection conn = JdbcUtils.getConn()){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM account");
            
            while(rs.next()){
                accountList.add(new Account(rs.getInt("id"), rs.getString("accName"), rs.getString("password"))) ;
            }
            this.tbvAccount.setItems(accountList);
            this.txtAccount.setText("");
            this.txtPass.setText("");
            
       }
    }
}
