package com.mycompany.supermarket_project.forms.admin_form;

import com.mycompany.supermarket_project.*;
import com.mycompany.supermarket_project.forms.change_info_form.ChangeOwnInfoForm;
import com.mycompany.supermarket_project.forms.logIn_form.LoginForm;
import com.mycompany.supermarket_project.model.Employee;
import utility.database_navigation.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class AdminForm extends javax.swing.JFrame {
    public AdminForm() {
        initComponents();

        for (String employeeRole : Supermarket.employeeRoles) {
            roleChoose.addItem(employeeRole);
        }


        roleChoose.setSelectedIndex(0);
        addDataToTable();
    }

    public boolean checkEmptyInputs() {
        if (nameInput.getText().length() == 0 ||
                mobileInput.getText().length() == 0 ||
                ageInput.getText().length() == 0 ||
                emailInput.getText().length() == 0 ||
                addressInput.getText().length() == 0 ||
                passwordInput.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "You have to enter all felids");
            return false;
        }
        return true;
    }

    public void clearForm() {
        idInput.setText("");
        nameInput.setText("");
        mobileInput.setText("");
        emailInput.setText("");
        addressInput.setText("");
        ageInput.setText("");
        passwordInput.setText("");
        roleChoose.setSelectedItem("Admin");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLable = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        mobileLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        roleLbl = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        mobileInput = new javax.swing.JTextField();
        ageInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        addEmplyeeBtn = new javax.swing.JButton();
        EditEmplyeeBtn = new javax.swing.JButton();
        searchByIdBtn = new javax.swing.JButton();
        deleteEmployeeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        roleChoose = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ChgAdminData = new javax.swing.JMenu();
        signOutBtn1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(null);

        idLable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idLable.setForeground(new java.awt.Color(255, 102, 0));
        idLable.setText("ID");

        nameLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 102, 0));
        nameLbl.setText("Name");

        mobileLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mobileLbl.setForeground(new java.awt.Color(255, 102, 0));
        mobileLbl.setText("Mobile Number");

        ageLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(255, 102, 0));
        ageLbl.setText("age");

        emailLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 102, 0));
        emailLbl.setText("Email");

        addressLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(255, 102, 0));
        addressLbl.setText("Address");

        passwordLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 102, 0));
        passwordLbl.setText("Password");

        roleLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        roleLbl.setForeground(new java.awt.Color(255, 102, 0));
        roleLbl.setText("Role");

        addEmplyeeBtn.setBackground(new java.awt.Color(255, 102, 0));
        addEmplyeeBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addEmplyeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        addEmplyeeBtn.setLabel("Add Emplyee");
        addEmplyeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmplyeeBtnMouseClicked(evt);
            }
        });

        EditEmplyeeBtn.setBackground(new java.awt.Color(255, 102, 0));
        EditEmplyeeBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditEmplyeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditEmplyeeBtn.setLabel("Update info");
        EditEmplyeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditEmplyeeBtnMouseClicked(evt);
            }
        });

        searchByIdBtn.setBackground(new java.awt.Color(255, 102, 0));
        searchByIdBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        searchByIdBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchByIdBtn.setText("Search");
        searchByIdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByIdBtnMouseClicked(evt);
            }
        });

        deleteEmployeeBtn.setBackground(new java.awt.Color(255, 102, 0));
        deleteEmployeeBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deleteEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmployeeBtn.setLabel("Delete Employee");
        deleteEmployeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmployeeBtnMouseClicked(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Mobile ", "age", "Email", "Address", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultTable);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Emplyee LIST");

        ChgAdminData.setText("Change My Information");
        ChgAdminData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChgAdminDataMouseClicked(evt);
            }
        });
        jMenuBar1.add(ChgAdminData);

        signOutBtn1.setText("Sign Out");
        signOutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutBtn1MouseClicked(evt);
            }
        });
        jMenuBar1.add(signOutBtn1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mobileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteEmployeeBtn)
                                .addGap(18, 18, 18)
                                .addComponent(idLable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mobileInput, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(emailInput, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(nameInput))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(addEmplyeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditEmplyeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roleChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mobileInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mobileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmplyeeBtn)
                    .addComponent(EditEmplyeeBtn))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmployeeBtn)
                    .addComponent(searchByIdBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currntActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_currntActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_currntActionPerformed

    private void signOutBtn1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signOutBtn1MouseClicked
        Supermarket.signout();
        this.dispose();
        new LoginForm().setVisible(true);
    }// GEN-LAST:event_signOutBtn1MouseClicked

    private void addEmplyeeBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addEmplyeeBtnMouseClicked
        employeeDB empDB = new employeeDB();
        if (checkEmptyInputs() &&
                utility.Utilities.isValidInteger(this, ageInput.getText()) &&
                utility.Utilities.passwordValidation(this, passwordInput.getPassword())) {
            int emp = empDB.addEmployee(nameInput.getText(),
                    mobileInput.getText(), Integer.parseInt(ageInput.getText()),
                    emailInput.getText(), addressInput.getText(),
                    new String(passwordInput.getPassword()), roleChoose.getSelectedItem().toString());
            if (emp != -1 && emp != 0) {
                addDataToTable();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "something went wrong check the console");
            }
        }

    }// GEN-LAST:event_addEmplyeeBtnMouseClicked

    private void EditEmplyeeBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_EditEmplyeeBtnMouseClicked
        if (checkEmptyInputs() &&
                utility.Utilities.isValidLong(this, idInput.getText()) &&
                utility.Utilities.isValidInteger(this, ageInput.getText()) &&
                utility.Utilities.passwordValidation(this, passwordInput.getPassword())) {
            long id = Long.parseLong(idInput.getText());
            employeeDB empDB = new employeeDB();
            int res = empDB.updateEmployeeById(
                    id,
                    nameInput.getText(),
                    mobileInput.getText(),
                    Integer.parseInt(ageInput.getText()),
                    emailInput.getText(),
                    addressInput.getText(),
                    new String(passwordInput.getPassword()),
                    roleChoose.getSelectedItem().toString());
            if (res != -1 && res != 0) {
                JOptionPane.showMessageDialog(this, "Info updated Successfully");
                addDataToTable();
            } else {
                JOptionPane.showMessageDialog(this, "id is wrong");
            }

        }
    }// GEN-LAST:event_EditEmplyeeBtnMouseClicked

    private void searchByIdBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchByIdBtnMouseClicked
        employeeDB empDB = new employeeDB();
        List<Employee> employeesList = empDB.getAllEmployees();

        String input = JOptionPane.showInputDialog("Enter Employee ID");

        if (input.length() == 0 || !utility.Utilities.isValidLong(this, input)) {
            // if user input empty string or non-numeric characters
            JOptionPane.showMessageDialog(this, "Invalid ID it should be numbers");
        } else {
            long id = Long.parseLong(input);
            for (int i = 0; i < employeesList.size(); i++) {
                if (employeesList.get(i).getId() == id) {
                    Employee emp = employeesList.get(i);
                    idInput.setText(emp.getId() + "");
                    nameInput.setText(emp.getName());
                    mobileInput.setText(emp.getPhoneNumber());
                    emailInput.setText(emp.getEmail());
                    addressInput.setText(emp.getAddress());
                    ageInput.setText(emp.getAge() + "");
                    passwordInput.setText(emp.getPassword());
                    roleChoose.setSelectedItem(emp.getRole());
                    return;
                }
            }
            // If user search for non exist id
            JOptionPane.showMessageDialog(this, "This ID not exist in system");
            clearForm();
        }
    }// GEN-LAST:event_searchByIdBtnMouseClicked

    private void deleteEmployeeBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteEmployeeBtnMouseClicked

        if (!utility.Utilities.isValidLong(this, idInput.getText())) {
            return;
        }
        long id = Long.parseLong(idInput.getText());

        if (id == Supermarket.currentEmplyee.getId()) {
            JOptionPane.showMessageDialog(this, "can not delete current employee");
            return;
        }

        employeeDB empDB = new employeeDB();

        int res = empDB.deleteEmployeeById(id);
        if (res != -1 && res != 0) {
            addDataToTable();
            clearForm();
            JOptionPane.showMessageDialog(this, "employee info deleted successfully");
        } else {
            JOptionPane.showMessageDialog(this, "This ID isn't exist");
        }

    }// GEN-LAST:event_deleteEmployeeBtnMouseClicked

    private void ChgAdminDataMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ChgAdminDataMouseClicked
        new ChangeOwnInfoForm().setVisible(true);
    }// GEN-LAST:event_ChgAdminDataMouseClicked

    private void addDataToTable() {
        employeeDB empDB = new employeeDB();
        List<Employee> employees = empDB.getAllEmployees();
        DefaultTableModel tableModel = (DefaultTableModel) resultTable.getModel();

        tableModel.setRowCount(0);
        Object rowData[] = new Object[7];
        for (int i = 0; i < employees.size(); i++) {
            rowData[0] = employees.get(i).getId();
            rowData[1] = employees.get(i).getName();
            rowData[2] = employees.get(i).getPhoneNumber();
            rowData[3] = employees.get(i).getAge();
            rowData[4] = employees.get(i).getEmail();
            rowData[5] = employees.get(i).getAddress();
            rowData[6] = employees.get(i).getRole();
            tableModel.addRow(rowData);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame adminForm = new AdminForm();
                adminForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ChgAdminData;
    private javax.swing.JButton EditEmplyeeBtn;
    private javax.swing.JButton addEmplyeeBtn;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobileInput;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTable resultTable;
    private javax.swing.JComboBox<String> roleChoose;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JButton searchByIdBtn;
    private javax.swing.JMenu signOutBtn1;
    // End of variables declaration//GEN-END:variables
}
