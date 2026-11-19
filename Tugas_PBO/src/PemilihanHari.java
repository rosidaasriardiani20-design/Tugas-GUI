import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PemilihanHari extends JFrame implements ActionListener {

    JPanel panelUtama;
    JPanel panelHeader;
    JPanel panelTengah;
    JPanel panelForm;
    JPanel panelTombol;

    JLabel judul;
    JLabel labelNama;
    JLabel labelHari;

    JTextField fieldNama;
    JComboBox<String> comboHari;

    JButton tombolPilih;
    JButton tombolBersihkan;
    JButton tombolKeluar;

    JTextArea areaHasil;
    JScrollPane scrollPane;

    public PemilihanHari() {

        judul = new JLabel(
            "APLIKASI PEMILIHAN HARI",
            SwingConstants.CENTER
        );

        labelNama = new JLabel("Nama Pengguna:");
        labelHari = new JLabel("Pilih Hari:");

        fieldNama = new JTextField(15);

        String[] daftarHari = {
            "Senin", "Selasa", "Rabu",
            "Kamis", "Jumat", "Sabtu"
        };

        comboHari = new JComboBox<>(daftarHari);

        tombolPilih = new JButton("Pilih");
        tombolBersihkan = new JButton("Bersihkan");
        tombolKeluar = new JButton("Keluar");

        areaHasil = new JTextArea(8, 30);
        areaHasil.setEditable(false);
        areaHasil.setLineWrap(true);
        areaHasil.setWrapStyleWord(true);

        scrollPane = new JScrollPane(areaHasil);

        panelUtama = new JPanel();
        panelHeader = new JPanel();
        panelTengah = new JPanel();
        panelForm = new JPanel();
        panelTombol = new JPanel();

        panelUtama.setLayout(new BorderLayout(10, 10));
        panelHeader.setLayout(new FlowLayout());
        panelTengah.setLayout(new BorderLayout(10, 10));
        panelForm.setLayout(new GridLayout(2, 2, 10, 10));
        panelTombol.setLayout(new FlowLayout());

        panelHeader.add(judul);

        panelForm.add(labelNama);
        panelForm.add(fieldNama);
        panelForm.add(labelHari);
        panelForm.add(comboHari);

        panelTombol.add(tombolPilih);
        panelTombol.add(tombolBersihkan);
        panelTombol.add(tombolKeluar);

        panelTengah.add(panelForm, BorderLayout.NORTH);
        panelTengah.add(panelTombol, BorderLayout.CENTER);

        panelUtama.add(panelHeader, BorderLayout.NORTH);
        panelUtama.add(panelTengah, BorderLayout.CENTER);
        panelUtama.add(scrollPane, BorderLayout.SOUTH);

        add(panelUtama);

        tombolPilih.addActionListener(this);
        tombolBersihkan.addActionListener(this);
        tombolKeluar.addActionListener(this);

        setTitle("Aplikasi Pemilihan Hari");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tombolPilih) {

            String nama = fieldNama.getText().trim();
            String hari = (String) comboHari.getSelectedItem();

            if (nama.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Nama pengguna harus diisi!"
                );
            } else {
                areaHasil.append(
                    "Nama: " + nama +
                    " | Hari yang dipilih: " + hari + "\n"
                );
            }

        } else if (e.getSource() == tombolBersihkan) {

            fieldNama.setText("");
            comboHari.setSelectedIndex(0);
            areaHasil.setText("");

        } else if (e.getSource() == tombolKeluar) {

            dispose();
        }
    }

    public static void main(String[] args) {

        PemilihanHari frame = new PemilihanHari();
        frame.setVisible(true);

    }
}
