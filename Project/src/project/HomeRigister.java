
package project;

import com.formdev.flatlaf.FlatLightLaf;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import Componant.Dailog;
import Controller.RegisterController;
import Model.RegisterModel;
import java.text.ParseException;
import java.util.Date;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class HomeRigister extends javax.swing.JFrame {

    RegisterController controller ;
    
    public HomeRigister() {
        initComponents();
        controller = new RegisterController();
        getData();
    }
    public void getData(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        try{
            controller.getList().forEach(student-> {
                Object[] row ={
                    student.getId(),
                    student.getName(),
                    student.getGender(),
                    student.getCourse(),
                    student.getPrice(),
                    student.getShift(),
                    student.getDob(),
                    student.getPob()
                };
                model.addRow(row);
            });
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void clear(){
        txtID.setText("");
        txtName.setText("");
        buttonGroupGender.clearSelection();
        cbCourse.setSelectedIndex(0);
        txtPrice.setText("");
        cbShift.setSelectedIndex(0);       
        cbPOB.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        DOB = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cbPOB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbCourse = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbShift = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAdd = new com.k33ptoo.components.KButton();
        btnUpdate = new com.k33ptoo.components.KButton();
        btnClear = new com.k33ptoo.components.KButton();
        btnExit = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 255, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Rigister");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 204, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(204, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Register.jpg"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(204, 255, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID          ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtID.setEditable(false);
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtID.setKeymap(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gender");

        buttonGroupGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rbMale.setText("Male");

        buttonGroupGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rbFemale.setText("Female");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DOB");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("POB");

        cbPOB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PhomPhen", "KanDal", "TaKav", "KomPongCharm", "KomPongTom", "KomPot", "SearmReap", "Rotanakiri", " " }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Course");

        cbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UX/UI design", "Html / CSS / JS", "C / C++ / OOP", "Java / SQL /  Database", "PHP / Database", "Note JS / React JS ", "Veu Js", "Java Android", "React Native", "Flutter" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Shift");

        cbShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Evening" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Price");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPOB, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbShift, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbShift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFemale)
                    .addComponent(rbMale)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPOB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel5.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 204, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Course", "Price", "Shift", "Date of Brith", "Place of Brith"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        btnAdd.setText("Add");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setkEndColor(new java.awt.Color(255, 204, 255));
        btnAdd.setkHoverEndColor(new java.awt.Color(204, 255, 255));
        btnAdd.setkHoverForeGround(new java.awt.Color(102, 102, 102));
        btnAdd.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnAdd.setkStartColor(new java.awt.Color(102, 102, 255));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setkEndColor(new java.awt.Color(204, 204, 255));
        btnUpdate.setkHoverEndColor(new java.awt.Color(204, 255, 255));
        btnUpdate.setkHoverForeGround(new java.awt.Color(102, 102, 102));
        btnUpdate.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnUpdate.setkStartColor(new java.awt.Color(0, 204, 204));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Remove");
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setkEndColor(new java.awt.Color(255, 255, 0));
        btnClear.setkHoverEndColor(new java.awt.Color(204, 255, 255));
        btnClear.setkHoverForeGround(new java.awt.Color(102, 102, 102));
        btnClear.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnClear.setkStartColor(new java.awt.Color(255, 0, 0));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setkEndColor(new java.awt.Color(0, 255, 204));
        btnExit.setkHoverEndColor(new java.awt.Color(204, 255, 255));
        btnExit.setkHoverForeGround(new java.awt.Color(102, 102, 102));
        btnExit.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnExit.setkStartColor(new java.awt.Color(255, 255, 0));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(140, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String name   = txtName.getText();
        String gender ;
        if (rbMale.isSelected() ){
            gender = "Male" ;
        } else if(rbFemale.isSelected()){
            gender = "Female";
        } else {
            gender = null;
        }
        String course = cbCourse.getSelectedItem().toString();
        String price  = txtPrice.getText();
        String shift  = cbShift.getSelectedItem().toString();
        SimpleDateFormat df = new SimpleDateFormat(DOB.getDateFormatString());
        String dob = null;
        if (DOB.getDate() != null ){
            dob = df.format(DOB.getDate());
        }
        String pob    = cbPOB.getSelectedItem().toString();
        if (name == null || gender == null || course == null ||  price == null  ){
            Dailog.warning(rootPane, "Please enter enough data !.🙏", "Warning");
        } else {
            controller.Add(new RegisterModel(0, name, gender, course, price, shift, dob, pob));
            getData();
            clear(); 
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int id = Integer.parseInt(txtID.getText());
        String name   = txtName.getText();
        String gender ;
        if (rbMale.isSelected() ){
            gender = "Male" ;
        } else if(rbFemale.isSelected()){
            gender = "Female";
        } else {
            gender = null;
        }
        String course = cbCourse.getSelectedItem().toString();
        String price  = txtPrice.getText();
        String shift  = cbShift.getSelectedItem().toString();
        SimpleDateFormat df = new SimpleDateFormat(DOB.getDateFormatString());
        String dob = null;
        if (DOB.getDate() != null ){
            dob = df.format(DOB.getDate());
        }
        String pob    = cbPOB.getSelectedItem().toString();
        controller.Update(new RegisterModel(id, name, gender, course, price, shift, dob, pob));
        getData();
        clear();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        controller.Remove(Integer.valueOf(txtID.getText()));
        clear();
        getData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try{
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        txtID.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        if(model.getValueAt(row, 2).toString().equalsIgnoreCase("male")){
            rbMale.setSelected(true);
        }else{
            rbFemale.setSelected(true);
        }
        cbCourse.setSelectedItem(model.getValueAt(row, 3).toString());
        txtPrice.setText(model.getValueAt(row, 4).toString());
        cbShift.setSelectedItem(model.getValueAt(row, 5).toString());
        try {
            Date date;
            SimpleDateFormat df = new SimpleDateFormat(DOB.getDateFormatString());
            date = df.parse(model.getValueAt(row, 6).toString());
            DOB.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cbPOB.setSelectedItem(model.getValueAt(row, 7).toString());
        
        } catch(Exception e){
            Dailog.warning(rootPane,"Don't have data", "Warning");
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeRigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeRigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeRigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeRigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
  
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(HomeRigister.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeRigister().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private com.k33ptoo.components.KButton btnAdd;
    private com.k33ptoo.components.KButton btnClear;
    private com.k33ptoo.components.KButton btnExit;
    private com.k33ptoo.components.KButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JComboBox<String> cbCourse;
    private javax.swing.JComboBox<String> cbPOB;
    private javax.swing.JComboBox<String> cbShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
