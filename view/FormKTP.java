package view;

import java.awt.*;
import javax.swing.*;

public class FormKTP extends JFrame {
    static JButton submit = new JButton("Submit");

    public static JButton getSubmit() {
        return submit;
    }
    // static class Form extends JFrame{
    // CardLayout cardLayout = new CardLayout();
    // JPanel cardPanel = new JPanel(cardLayout);

    // }
    public FormKTP() {
        setTitle("FORM KTP");
        inputForm();
        // setLocationRelativeTo(null);
        // setSize(500, 700);
    }

    private void inputForm() {
        JPanel frame = new JPanel();
        frame.setSize(500,500);
        frame.setBackground(new Color(0, 175, 239));
        frame.setBackground(Color.BLACK);

        JPanel inputPanel = new JPanel();
        
        JLabel NIK = new JLabel("NIK");
        JTextField iNIK = new JTextField();
        inputPanel.add(NIK);
        inputPanel.add(iNIK);

        JLabel nama = new JLabel("Nama");
        JTextField iNama = new JTextField();
        inputPanel.add(nama);
        inputPanel.add(iNama);

        JLabel tempatLahir = new JLabel("Tempat Lahir");
        JTextField itempatLahir = new JTextField();
        inputPanel.add(tempatLahir);
        inputPanel.add(itempatLahir);

        JLabel TanggalLahir = new JLabel("Tanggal Lahir");
        JTextField iTanggalLahir = new JTextField();
        inputPanel.add(TanggalLahir);
        inputPanel.add(iTanggalLahir);

        //Date picker untuk tanggal lahir

        JLabel jenisKelamin = new JLabel("Jenis Kelamin");
        JRadioButton jkPria = new JRadioButton("Pria");
        JRadioButton jkWanita = new JRadioButton("Wanita");
        ButtonGroup jkGroup = new ButtonGroup();
        jkGroup.add(jkPria);
        jkGroup.add(jkWanita);
        
        inputPanel.add(jenisKelamin);
        inputPanel.add(jkPria);
        inputPanel.add(jkWanita);

        JLabel golDarah = new JLabel("Gol Darah");
        JRadioButton golA = new JRadioButton("A");
        JRadioButton golB = new JRadioButton("B");
        JRadioButton golO = new JRadioButton("O");
        JRadioButton golAB = new JRadioButton("AB");
        ButtonGroup golGroup = new ButtonGroup();
        golGroup.add(golA);
        golGroup.add(golB);
        golGroup.add(golO);
        golGroup.add(golB);

        inputPanel.add(golDarah);
        inputPanel.add(golA);
        inputPanel.add(golB);
        inputPanel.add(golO);
        inputPanel.add(golAB);

        JLabel alamat = new JLabel("Alamat");
        JTextField iAlamat = new JTextField();
        inputPanel.add(alamat);
        inputPanel.add(iAlamat);

        JLabel rt = new JLabel("RT");
        JTextField iRT = new JTextField();
        JLabel rw = new JLabel("RW");
        JTextField iRW = new JTextField();

        inputPanel.add(rt);
        inputPanel.add(iRT);
        inputPanel.add(rw);
        inputPanel.add(iRW);

        JLabel kelurahan = new JLabel("Kel/Desa");
        JTextField iKelurahan = new JTextField();
        inputPanel.add(kelurahan);
        inputPanel.add(iKelurahan);
        JLabel desa = new JLabel("Kel/Desa");
        JTextField iDesa = new JTextField();
        inputPanel.add(desa);
        inputPanel.add(iDesa);

        JLabel kecamatan = new JLabel("Kecamatan");
        JTextField iKecamatan = new JTextField();
        inputPanel.add(kecamatan);
        inputPanel.add(iKecamatan);

        JLabel agama = new JLabel("Agama");
        JTextField iAgama = new JTextField();
        inputPanel.add(agama);
        inputPanel.add(iAgama);

        JLabel statusPerkawinan = new JLabel("Status Perkawinan");
        JTextField iStatusPerkawinan = new JTextField();
        inputPanel.add(statusPerkawinan);
        inputPanel.add(iStatusPerkawinan);

        JLabel pekerjaan = new JLabel("Pekerjaan");
        JTextField iPekerjaan = new JTextField();
        inputPanel.add(pekerjaan);
        inputPanel.add(iPekerjaan);

        JLabel kewarganegaraan = new JLabel("Kewarganegaraan");
        JTextField iKewarganegaraan = new JTextField();
        inputPanel.add(kewarganegaraan);
        inputPanel.add(iKewarganegaraan);
        
        JLabel masaBerlaku = new JLabel("Berlaku Hingga");
        JTextField iMasaBerlaku = new JTextField();
        inputPanel.add(masaBerlaku);
        inputPanel.add(iMasaBerlaku);

        frame.add(inputPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FormKTP().setVisible(true);
    }
}
