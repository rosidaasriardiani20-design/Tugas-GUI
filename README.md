# Aplikasi Pemilihan Hari

Nama: Rosida Asri Ardiani
NIM: F1D02410142

## Deskripsi

Aplikasi Pemilihan Hari merupakan aplikasi sederhana yang dibuat menggunakan Java Swing. Aplikasi ini digunakan untuk memilih hari dari Senin sampai Sabtu. Pengguna dapat memasukkan nama, memilih hari melalui menu dropdown, kemudian menekan tombol Pilih untuk menampilkan hasil pilihan pada area teks.

## Komponen GUI yang Digunakan

1. Top-Level Container Class

- JFrame: Jendela utama aplikasi yang menampung seluruh elemen antarmuka, termasuk title bar dan tombol kontrol jendela. Pada kode, class "PemilihanHari" merupakan turunan ("extends") dari "JFrame".

2. Intermediate Container Class

- JPanel: Mengelompokkan komponen ke dalam beberapa bagian, yaitu "panelUtama", "panelHeader", "panelTengah", "panelForm", dan "panelTombol", agar tata letak lebih mudah diatur.
- JScrollPane: Membungkus "JTextArea" sehingga daftar hasil pilihan hari dapat digulir ketika isi teks melebihi area tampilan.

3. Atomic Component Class

Komponen dasar yang digunakan untuk berinteraksi langsung dengan pengguna:

- JLabel: Menampilkan judul aplikasi dan keterangan pada form input.
- JTextField: Kolom input satu baris untuk memasukkan nama pengguna.
- JComboBox: Menu dropdown untuk memilih hari, mulai dari Senin sampai Sabtu.
- JButton: Tombol aksi yang terdiri dari Pilih, Bersihkan, dan Keluar.
- JTextArea: Area teks multi-baris untuk menampilkan daftar nama dan hari yang telah dipilih.

4. Layout Classes

Program ini menerapkan tiga Layout Manager berbeda:

- BorderLayout: Mengatur posisi bagian header, bagian tengah, dan area hasil pada panel utama.
- FlowLayout: Mengatur posisi judul dan tombol agar tersusun secara berurutan.
- GridLayout: Mengatur komponen form nama dan pilihan hari dalam dua baris dan dua kolom.

5. Event Listener

- ActionListener: Digunakan untuk mendeteksi tindakan pengguna ketika menekan tombol.
- actionPerformed(): Method yang menangani aksi tombol Pilih, Bersihkan, dan Keluar.
- ActionEvent: Digunakan untuk memperoleh informasi mengenai peristiwa ketika tombol ditekan.

Cara Kerja Aplikasi

1. Pengguna memasukkan nama pada kolom yang tersedia.
2. Pengguna memilih hari melalui menu dropdown.
3. Pengguna menekan tombol Pilih untuk menampilkan hasil.
4. Hasil pilihan ditampilkan pada area teks.
5. Tombol Bersihkan digunakan untuk menghapus isian dan hasil.
6. Tombol Keluar digunakan untuk menutup aplikasi.

Cara Menjalankan

1. Buka project menggunakan Visual Studio Code.
2. Buka folder "src".
3. Jalankan file "PemilihanHari.java".

## Screenshot Hasil Aplikasi

Berikut merupakan dokumentasi screenshot aplikasi setelah dijalankan.

### Screenshot 1
![Hasil 1](sreenshot/hasil1.png)

### Screenshot 2
![Hasil 2](sreenshot/hasil2.png)

### Screenshot 3
![Hasil 3](sreenshot/hasil3.png)

### Screenshot 4
![Hasil 4](sreenshot/hasil4.png)

### Screenshot 5
![Hasil 5](sreenshot/hasil5.png)
