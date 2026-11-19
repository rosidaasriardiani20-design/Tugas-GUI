import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PemilihanHari extends JFrame implements ActionListener {

    JLabel judul;
    JLabel hasil;
    JPanel panelJudul;
    JPanel panelTombol;
    JPanel panelHasil;
    JButton tombolSenin;
    JButton tombolSelasa;
    JButton tombolRabu;
    JButton tombolKamis;
    JButton tombolJumat;
    JButton tombolSabtu;

    public PemilihanHari() {
        judul = new JLabel(
            "APLIKASI PEMILIHAN HARI",
            SwingConstants.CENTER
        );
        hasil = new JLabel(
            "Hari yang dipilih: Belum ada pilihan",
            SwingConstants.CENTER
        );
        panelJudul = new JPanel();
        panelTombol = new JPanel();
        panelHasil = new JPanel();

        tombolSenin = new JButton("Senin");
        tombolSelasa = new JButton("Selasa");
        tombolRabu = new JButton("Rabu");
        tombolKamis = new JButton("Kamis");
        tombolJumat = new JButton("Jumat");
        tombolSabtu = new JButton("Sabtu");

        panelJudul.setLayout(new FlowLayout());
        panelTombol.setLayout(new GridLayout(2, 3, 10, 10));
        panelHasil.setLayout(new FlowLayout());

        panelJudul.add(judul);
        panelTombol.add(tombolSenin);
        panelTombol.add(tombolSelasa);
        panelTombol.add(tombolRabu);
        panelTombol.add(tombolKamis);
        panelTombol.add(tombolJumat);
        panelTombol.add(tombolSabtu);

        panelHasil.add(hasil);

        setLayout(new BorderLayout(10, 10));

        add(panelJudul, BorderLayout.NORTH);
        add(panelTombol, BorderLayout.CENTER);
        add(panelHasil, BorderLayout.SOUTH);

        tombolSenin.addActionListener(this);
        tombolSelasa.addActionListener(this);
        tombolRabu.addActionListener(this);
        tombolKamis.addActionListener(this);
        tombolJumat.addActionListener(this);
        tombolSabtu.addActionListener(this);

        setTitle("Aplikasi Pemilihan Hari");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tombolSenin) {
            hasil.setText("Hari yang dipilih: Senin");

        } else if (e.getSource() == tombolSelasa) {
            hasil.setText("Hari yang dipilih: Selasa");

        } else if (e.getSource() == tombolRabu) {
            hasil.setText("Hari yang dipilih: Rabu");

        } else if (e.getSource() == tombolKamis) {
            hasil.setText("Hari yang dipilih: Kamis");

        } else if (e.getSource() == tombolJumat) {
            hasil.setText("Hari yang dipilih: Jumat");

        } else if (e.getSource() == tombolSabtu) {
            hasil.setText("Hari yang dipilih: Sabtu");
        }
    }

    public static void main(String[] args) {

        PemilihanHari frame = new PemilihanHari();
        frame.setVisible(true);

    }
}