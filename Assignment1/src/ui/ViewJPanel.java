/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author Administrator
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Person person;
    
    public ViewJPanel(Person person) {
        initComponents();
        this.person = person;
        displayPerson( );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSsn = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblBankAccount = new javax.swing.JLabel();
        lblHealthPlan = new javax.swing.JLabel();
        lblMedicalRecord = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblUdi = new javax.swing.JLabel();
        lblNUID = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblBirth = new javax.swing.JLabel();
        lblIp = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblVin = new javax.swing.JLabel();
        lblLicensePlate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        txtMedicalRecord = new javax.swing.JTextField();
        txtHealthPlan = new javax.swing.JTextField();
        txtBankAccount = new javax.swing.JTextField();
        txtLicense = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        txtNUID = new javax.swing.JTextField();
        txtUdi = new javax.swing.JTextField();
        txtLicensePlate = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtVin = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPic = new javax.swing.JLabel();

        lblSsn.setText("SSN:");

        lblName.setText("Name:");

        lblBankAccount.setText("Bank Account Number:");

        lblHealthPlan.setText("Health Plan Beneficiary:");

        lblMedicalRecord.setText("Medical Record:");

        lblLinkedIn.setText("LinkedIn Link:");

        lblUdi.setText("UDI:");

        lblNUID.setText("NUID:");

        lblLicense.setText("License Number:");

        lblPhone.setText("Telephone:");

        lblEmail.setText("Email:");

        lblCity.setText("City of Residence:");

        lblBirth.setText("Date of Birth(yyyy-mm-dd):");

        lblIp.setText("Internet Protocol:");

        lblFax.setText("FAX:");

        lblVin.setText("VIN:");

        lblLicensePlate.setText("License Plate:");

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Personal Profile");

        lblAge.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHealthPlan)
                                .addGap(18, 18, 18)
                                .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCity)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCity))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhone)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFax)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSsn)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMedicalRecord)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMedicalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBirth)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAge)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLicensePlate)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUdi)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVin)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVin))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIp)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLinkedIn)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLinkedIn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLicense)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPic)))
                .addContainerGap(573, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBankAccount, lblBirth, lblCity, lblEmail, lblFax, lblHealthPlan, lblIp, lblLicense, lblLicensePlate, lblLinkedIn, lblMedicalRecord, lblNUID, lblName, lblPhone, lblSsn, lblUdi, lblVin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtEmail, txtFax, txtHealthPlan, txtMedicalRecord, txtName, txtPhone, txtSsn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBankAccount, txtIp, txtLicense, txtLicensePlate, txtLinkedIn, txtNUID, txtUdi, txtVin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAccount)
                    .addComponent(txtBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirth)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicense)
                    .addComponent(txtLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIp)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFax)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNUID)
                    .addComponent(txtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVin)
                    .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSsn)
                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUdi)
                    .addComponent(txtUdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecord)
                    .addComponent(txtMedicalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicensePlate)
                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthPlan)
                    .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPic)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBankAccount, lblBirth, lblCity, lblEmail, lblFax, lblHealthPlan, lblIp, lblLicense, lblLicensePlate, lblLinkedIn, lblMedicalRecord, lblNUID, lblName, lblPhone, lblSsn, lblUdi, lblVin});

    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBankAccount;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblHealthPlan;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecord;
    private javax.swing.JLabel lblNUID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUdi;
    private javax.swing.JLabel lblVin;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBankAccount;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtHealthPlan;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecord;
    private javax.swing.JTextField txtNUID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtUdi;
    private javax.swing.JTextField txtVin;
    // End of variables declaration//GEN-END:variables

    private void displayPerson() {
        txtName.setText(person.getName());
        txtBirth.setText(person.getDateOfBirth());
//        get person's age according to the  Date of Birth
        if(person.getDateOfBirth() != null){
            int birthYear = Integer.parseInt(person.getDateOfBirth().substring(0, 4));
            Calendar cal = Calendar.getInstance();
            int currentYear = cal.get(Calendar.YEAR);
            txtAge.setText(currentYear - birthYear +"");
        }
        txtCity.setText(person.getCity());
        txtPhone.setText(person.getPhone());
        txtFax.setText(person.getFax());
        txtEmail.setText(person.getEmail());
        txtSsn.setText(person.getSsn());
        txtMedicalRecord.setText(person.getMedicalRecord());
        txtHealthPlan.setText(person.getHealthPlan());
        txtBankAccount.setText(person.getBankAccount());
        txtLicense.setText(person.getLicense());
        txtLinkedIn.setText(person.getLinkedIn());
        txtIp.setText(person.getIp());
        txtNUID.setText(person.getNuid());
        txtVin.setText(person.getVin());
        txtUdi.setText(person.getUid());
        txtLicensePlate.setText(person.getLicensePlate());
//        show the picture        
        ImageIcon imageIcon = new ImageIcon("src\\image\\Personal Picture.png");
        lblPic.setIcon(imageIcon);
        lblPic.getIcon();
    }
}
