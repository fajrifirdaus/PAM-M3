# 📱 My Profile App - Compose Multiplatform

Aplikasi **My Profile App** adalah proyek simulasi portofolio personal yang dibangun menggunakan **Compose Multiplatform**. Aplikasi ini dikembangkan sebagai pemenuhan Tugas Praktikum Modul 3 Mata Kuliah Pengembangan Aplikasi Mobile (PAM) di Institut Teknologi Sumatera (ITERA).

Aplikasi ini mengedepankan paradigma **UI Deklaratif** dengan desain **Professional Light Theme** yang bersih, modern, dan responsif.

---

## 📸 Screenshots
*(Tampilan antarmuka "Corporate Blue & Slate" pada perangkat Android)*

<div align="center">
  <img width="400" height="1600" alt="Image" src="https://github.com/user-attachments/assets/76688281-36fb-469e-95d5-e4617c35e576" />
  <img width="400" height="1600" alt="Image" src="https://github.com/user-attachments/assets/cbb6b012-efcc-4add-b358-83cadb2e36b4" />
</div>

---

## ✨ Fitur & Implementasi Teknis

Sesuai dengan kriteria penilaian pada **Modul 3**, aplikasi ini mengimplementasikan:

1. **Reusable Composable Functions** 
   - Membagi UI menjadi komponen mandiri: `ProfileHeader`, `ContactButton`, `ContactCard`, dan `InfoItem` untuk meningkatkan efisiensi dan kebersihan kode (*Clean Code*).
2. **Layout Dasar (Column, Row, Box)** 
   - **Box**: Digunakan untuk teknik *stacking* (menumpuk) elemen banner dan foto profil.
   - **Column**: Digunakan untuk menyusun biodata dan informasi kontak secara vertikal.
   - **Row**: Digunakan di dalam kartu kontak untuk menyelaraskan ikon dan teks secara horizontal.
3. **Komponen UI & Modifiers** 
   - Menggunakan `Card` dengan elevasi halus, `Image` dengan pemotongan lingkaran (*CircleShape*), dan `HorizontalDivider` sebagai pemisah konten.
   - Implementasi `Modifier` yang kompleks untuk mengatur *padding*, *size*, dan *border* berlapis pada foto profil.
4. **State Management & Animasi (Bonus +10%)** 
   - Menggunakan `remember` dan `mutableStateOf` untuk mengelola interaksi tombol.
   - Implementasi `AnimatedVisibility` untuk memberikan transisi halus (*fade-in* dan *expand*) saat menampilkan informasi kontak.

---

## 🎨 Design System

Aplikasi ini menggunakan tema **Professional Light Theme**:
* **Warna Utama**: Blue 600 (`#2563EB`) untuk elemen kunci dan tombol.
* **Tipografi**: Slate 900 untuk keterbacaan tinggi pada teks utama dan Slate 500 untuk sub-informasi.
* **Visual**: Banner gradien vertikal yang memberikan kedalaman tanpa mengurangi kesan formal.

---

## 🛠️ Cara Menjalankan
1. Pastikan folder `drawable` berisi file foto profil dengan nama `foto_profil.jpg`.
2. Buka proyek melalui Android Studio.
3. Lakukan **Build > Rebuild Project** untuk mendaftarkan *resources*.
4. Jalankan aplikasi pada emulator atau perangkat fisik Android.

---

## 👨‍💻 Data Mahasiswa
* **Nama**: Muhammad Fajri Firdaus
* **NIM**: 123140050
* **Program Studi**: Teknik Informatika - ITERA
* **Mata Kuliah**: Pengembangan Aplikasi Mobile (IF25-22017)

---
*Dibuat dengan ❤️ menggunakan Kotlin Multiplatform dan Jetpack Compose.*
