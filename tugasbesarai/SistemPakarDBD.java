package com.rifgi.praktikumpbo.tugasbesarai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemPakarDBD extends JFrame{
    private JTextField namaTextField;
    private JTextField umurTextField;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JButton prosesButton;
    private JButton clearButton;
    private JLabel namaLabel;
    private JLabel umurLabel;
    private JCheckBox g1;
    private JCheckBox g11;
    private JCheckBox g10;
    private JCheckBox g9;
    private JCheckBox g8;
    private JCheckBox g7;
    private JCheckBox g2;
    private JCheckBox g3;
    private JCheckBox g5;
    private JCheckBox g4;
    private JCheckBox g6;
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JLabel dgsLabel;
    private JButton keluarButton;
    private JTextField dgsTextField;
    private JLabel tindakanLabel;
    private JTextPane tdnTextPane;

    public SistemPakarDBD(){
        super("Konsultasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(400,400);


        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ks1, ks2, ks3, ks4, ks5;
                String tdn1, tdn2, tdn3, tdn4;
                if (g3.isSelected()) {
                    if (g4.isSelected()) {
                        if (g7.isSelected()) {
                            ks5 = "Anda terkena Demam Berdarah";
                            dgsTextField.setText(ks5);
                            tdn4 = " - ";
                            tdnTextPane.setText(tdn4);
                        } else {
                            if (g6.isSelected()) {
                                ks5 = "Anda terkena Demam Berdarah";
                                dgsTextField.setText(ks5);
                                tdn4 = " - ";
                                tdnTextPane.setText(tdn4);
                            } else {
                                if (g5.isSelected()) {
                                    ks5 = "Mohon maaf Gejala Penyakit Tidak Dikenali";
                                    dgsTextField.setText(ks5);
                                    tdn4 = " - ";
                                    tdnTextPane.setText(tdn4);
                                } else {
                                    if (g10.isSelected()) {
                                        if (g2.isSelected()) {
                                            ks5 = "Anda terkena Demam Berdarah";
                                            dgsTextField.setText(ks5);
                                            tdn4 = " - ";
                                            tdnTextPane.setText(tdn4);
                                        } else {
                                            ks5 = "Mohon maaf Gejala Penyakit Tidak Dikenali";
                                            dgsTextField.setText(ks5);
                                            tdn4 = " - ";
                                            tdnTextPane.setText(tdn4);
                                        }
                                    } else {
                                        ks5 = "Mohon maaf Gejala Penyakit Tidak Dikenali";
                                        dgsTextField.setText(ks5);
                                        tdn4 = " - ";
                                        tdnTextPane.setText(tdn4);
                                    }
                                }
                            }
                        }
                    } else {
                        if (g1.isSelected()) {
                            ks5 = "Anda terkena Demam Berdarah";
                            dgsTextField.setText(ks5);
                            tdn4 = " - ";
                            tdnTextPane.setText(tdn4);
                        } else {
                            ks5 = "Mohon maaf Gejala Penyakit Tidak Dikenali";
                            dgsTextField.setText(ks5);
                            tdn4 = " - ";
                            tdnTextPane.setText(tdn4);
                        }
                    }
                }else if (g2.isSelected()||g5.isSelected()||g6.isSelected()||g9.isSelected()){
                    ks1 = "Anda terkena Gejala Ringan DBD";
                    dgsTextField.setText(ks1);
                    tdn1 = "Melakukan pemberian obat terhadap pasien yang terkena gejala Demam Beradarah Dengue dan memberikan suntikan antibiotic.";
                    tdnTextPane.setText(tdn1);
                }else if (g4.isSelected()||g7.isSelected()||g8.isSelected()||g10.isSelected()){
                    ks2 = "Anda Terkena Gejala DBD Cukup Berat";
                    dgsTextField.setText(ks2);
                    tdn2 = "Merawat inap pasien yang menderita gejala Demam Berdarah Dengue, memberikan infus, dan anti biotik";
                    tdnTextPane.setText(tdn2);
                }else if (g1.isSelected()||g3.isSelected()||g11.isSelected()){
                    ks3 = "Anda Terkena Gejala Berat DBD";
                    dgsTextField.setText(ks3);
                    tdn3 = "Langsung merujuk ke rumah sakit untuk di bawa ke ruangan intensive (ICU),dan melakukan transfusi darah.";
                    tdnTextPane.setText(tdn3);
                }else {
                    ks4 = "Mohon maaf Gejala Penyakit Tidak Dikenali";
                    dgsTextField.setText(ks4);
                    tdn4 = " - ";
                    tdnTextPane.setText(tdn4);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearform();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        lakiLakiRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lakiLakiRadioButton.isSelected()){
                    perempuanRadioButton.setSelected(false);
                }
            }
        });
        perempuanRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (perempuanRadioButton.isSelected()){
                    lakiLakiRadioButton.setSelected(false);
                }
            }
        });
    }

    public void clearform(){
        this.namaTextField.setText("");
        this.umurTextField.setText("");
        this.lakiLakiRadioButton.setSelected(false);
        this.perempuanRadioButton.setSelected(false);
        this.g1.setSelected(false);
        this.g2.setSelected(false);
        this.g3.setSelected(false);
        this.g4.setSelected(false);
        this.g5.setSelected(false);
        this.g6.setSelected(false);
        this.g7.setSelected(false);
        this.g8.setSelected(false);
        this.g9.setSelected(false);
        this.g10.setSelected(false);
        this.g11.setSelected(false);
        this.dgsTextField.setText("");
        this.tdnTextPane.setText("");
    }

    public static void main(String[] args) {
        JFrame mainFrame = new SistemPakarDBD();

        mainFrame.setVisible(true);
    }
}
