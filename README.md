## Aplikasi  Recycleview - Data Siswa
Project ini dibuat untuk menampilkan data siswa menggunakan komponen RecyclerView di Android.
Aplikasi ini merupakan tugas praktikum yang bertujuan untuk memahami konsep dasar penggunaan RecyclerView,
termasuk bagaimana menghubungkan data ke tampilan dengan efisien.

## Penjelasan Recycle view
RecyclerView bekerja dengan menampilkan data dalam bentuk daftar secara efisien menggunakan 
tiga komponen utama:
1. Model sebagai struktur data,
2. Adapter sebagai penghubung antara data dan tampilan,
3. ViewHolder untuk mengelola tampilan tiap item,
serta sistem recycle view yang mendaur ulang tampilan item yang tidak terlihat agar tidak dibuat 
ulang dari awal. RecyclerView juga menggunakan LayoutManager (seperti LinearLayoutManager atau GridLayoutManager) 
untuk mengatur posisi item, dan dapat dipadukan dengan fitur interaktif seperti klik, hapus, edit, atau search,
menjadikannya fleksibel dan efisien untuk daftar panjang.


## Tim
1. Bryan Putra M (07)
2. Damasa Shafa A.R (10)
3. Kirana A.U (19)

## Penjelasan Alur Data

- MainActivity membuat daftar siswa dalam bentuk List<Siswa> (berisi: nama, NISN, dan kelas).
- Daftar siswa dikirim ke Adapter (SiswaAdapter), yang bertugas:
- Membuat tampilan untuk setiap item siswa (onCreateViewHolder)
- Mengisi tampilan tersebut dengan data siswa (onBindViewHolder)
- Di dalam ViewHolder, setiap komponen tampilan seperti TextView (untuk nama, NISN, kelas), dan Button (lihat detail, hapus) diatur agar tampil dengan data yang sesuai.
- Saat aplikasi dijalankan, RecyclerView akan menampilkan seluruh daftar siswa secara vertikal, dan hanya item yang terlihat yang akan dirender.
- Saat tombol “Lihat Detail” ditekan, pengguna bisa melihat data siswa secara lebih lengkap (opsional bisa ditampilkan di Toast, Dialog, atau Activity baru).
- Saat tombol “Hapus” ditekan, data siswa pada posisi tersebut akan dihapus dari List, dan RecyclerView akan di-refresh.

## Fitur Aplikasi
-Menampilkan daftar 10 siswa
<https://github.com/BrianPutraMutaafif/app3-recycleview>
Di dalam sana terdapat kode-kode yang akan menampilkan 10 daftar siswa secara vertikal menggunakan Recycle View.
- Setiap data diri siswa dapat di lihat secara detail, dengan di tambahkan nya button 'lihat detail'
  <img width="548" height="275" alt="image" src="https://github.com/user-attachments/assets/5d920645-135a-406c-8638-e83013aa29b7" />

- Setiap data diri memiliki tombol 'hapus'  yang mana setiap data diri yang di pilih bisa di hapus.
  <img width="536" height="262" alt="image" src="https://github.com/user-attachments/assets/5e7b3e59-2795-4123-8377-893ac8c665c9" />

-  Di tambah kan juga beberapa list sebagai penanda siswa tersebut [ Nisn, Kelas, Nama]
  File layout:
activity_main.xml → berisi RecyclerView
item_siswa.xml → berisi TextView dan Button (lihat & hapus)
Kode di MainActivity.java → mengatur data siswa dan menghubungkan Adapter
Kode di SiswaAdapter.java → mengatur isi setiap item list

<img width="556" height="292" alt="image" src="https://github.com/user-attachments/assets/b2c4a75e-dac4-4bc6-812b-0605af8c9061" />


