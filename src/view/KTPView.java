package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.classes.Penduduk;

public class KTPView {
    JFrame frame;
    JPanel panel;

    public KTPView(Penduduk ktp) {
        viewKTP(ktp);
    }

    private void viewKTP(Penduduk ktp) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        final int frameWidth = 700;
        final int frameHeight = 550;

        int frameX = (screenWidth / 2) - (frameWidth / 2);
        int frameY = (screenHeight / 2) - (frameHeight / 2);

        frame = new JFrame("KTP INPUT FORM");
        frame.setBounds(frameX, frameY, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(null);
        inputPanel.setBounds(0, 0, frameWidth, frameHeight);

        StringBuilder hasil = new StringBuilder();

        hasil.append("NIK : " + ktp.getNik() + "\nNama: " + ktp.getNama() + "\nTempat Lahir : " + ktp.getTempatLahir() + "\nTanggal Lahir: " + ktp.getTanggalLahir() + "\nJenis kelamin"+ ktp.getJenisKelamin() + "\nGologan darah"+ktp.getGolDarah());

         JLabel result = new JLabel(hasil.toString());

         inputPanel.add(result);
         frame.add(inputPanel);

    }



}