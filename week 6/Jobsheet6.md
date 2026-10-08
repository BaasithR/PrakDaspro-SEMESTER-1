# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** Mochamad Razan Al Baasith
* **NIM:** 264107020145
* **Kelas / No. Presensi:** TI-1D / 19

---

## 1: TUJUAN PRAKTIKUM

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus    menggunakan sintaks pemilihan bersarang.
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Jawa.
3. Mahasiswa mampu menerapkan operator logika &&, ||, dan ! pada struktur pemilihan.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

#### 2.1.1 Kode Program Java
```java
// Contoh kode program dummy Percobaan 1
import java.util.Scanner;

public class nestedUjianSkripsi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if(bimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}

```

#### 2.1.2 Hasil Running / Screenshot Output

![Output Percobaan 1](<output ujian skripsi.png>)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
  * **Jawab:** Kode akan menjalankan statement di blok ELSE karena pada kondisi IF mengecek apakah noPenalty memiliki nilai yes sehingga ketika memasukkan nilai no akan menjalankan kode di blok ELSE.
* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut! if (guidanceCount1 >= 8 && guidanceCount2 >= 4) 
  * **Jawab:** Kode tersebut adalah kondisi dalam IF yang mengecek apakah variable guidanceCount1 lebih dari sama dengan 8 *dan guidanceCount lebih dari sama dengan 4. Karena dalam kondisi tersebut terdapat operator &&, maka kedua kondisi variable harus bernilai true agar bisa menghasilkan true.
* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
  * **Jawab:**
   1. Alur yang pertama adalah mengecek apakah variable noPenalty memiliki nilai yes. Jika variable noPenalty tidak bernilai yes maka kode akan menjalankan statement message = "Failed! The student still has an outstanding penalty";. Jika variable noPenalty bernilai yes maka program akan masuk ke nested IF-ELSE.
   2. Alur kedua adalah mengecek apakah variable guidanceCount1 bernilai lebih dari sama dengan 8 dan variable guidanceCount2 bernilai lebih dari sama dengan 4 yang mana jika kondisi tersebut menghasilkan true maka akan menjalankan statement message = "All requirements met. The student may register for the thesis exam;.
   3. Jika kondisi tersebut tidak bernilai true maka program akan mengecek kondisi pada ELSE-IF yaitu mengecek apakah variable guidanceCount1 bernilai kurang dari 8 dan guidanceCount2 bernilai kurang dari 4. Jika kondisi tersebut bernilai true maka akan menjalankan statement message = "Failed! Guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4";.
   4. Jika kondisi tersebut tidak bernilai true maka program akan mengecek kondisi pada ELSE-IF berikutnya yaitu mengecek apakah variable guidanceCount1 kurang dari 8. Jika kondisi tersebut bernilai true maka akan menjalankan statement message = "Failed! Guidance sessions with Supervisor 1 have not reached 8";{:.java}.
   5. Jika kondisi tersebut tidak bernilai true maka akan menjalan statement pada blok ELSE yaitu message = "Failed! Guidance sessions with Supervisor 2 have not reached 4";{:.java}
---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

#### 2.2.1 Kode Program
```java
import java.util.Scanner;

public class operatorLogikaWifi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiblokir;

        System.out.println("Apakah pengguna mahasiswa (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.println("Apakah pengguna dosen (true/false): ");
        dosen = sc.nextBoolean();
        System.out.println("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();
        
        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WIFI diberikan");
        } else {
            System.out.println("Akses WIFI ditolak");
        }
    }
}
```

#### 2.2.2 Hasil Running

![Output Percobaan 2](<output akses WIFI.png>)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jelaskan fungsi operator ||, &&, dan ! pada kondisi program tersebut.
  * **Jawab:** Operator || berfungsi sebagai operator dengan rule OR yaitu minimal satu kondisi bernilai true untuk menghasilkan nilai true. Operator && berfungsi sebagai operator dengan rule AND yang kondisinya harus bernilai true semua agar menghasilkan nilai true. Operator ! berfungsi untuk menegasikan suatu kondisi
* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai mahasiswa = false?
  * **Jawab:** Karena dalam kondisi IF terdapat operator OR
* **Pertanyaan 3:** Ubah operator || menjadi &&. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?
  * **Jawab:** Pada data uji 1 dan 2 program menampilkan Akses wifi ditolak karena operator && mengharuskan dua kondisi bernilai true agar menghasilkan nilai true.
* **Pertanyaan 4:** Pada ekspresi mahasiswa || dosen, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan berdasarkan short-circuit evaluation.
  * **Jawab:** Saat variable mahasiswa bernilai true karena operator || menghasilkan nilai true jika salah satu kondisi bernilai true. Karena program tau jika dengan kondisi mahasiswa true akan menghasilkan nilai true maka program tidak akan mengevaluasi kondisi dosen
* **Pertanyaan 5:** Pada ekspresi (mahasiswa || dosen) && !akunDiblokir, kapan kondisi !akunDiblokir tidak perlu dievaluasi? Jelaskan
  * **Jawab:** Saat kondisi (mahasiswa || dosen) bernilai false. Karena operator && mengharuskan dua kondisi bernilai true agar menghasilkan nilai true jadi !akunDiblokir tidak dievaluasi karena dengan kondisi (mahasiswa || dosen) bernilai false, keseluruhan kondisi akan bernilai false
---

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

#### 2.3.1 Kode Program Java
 ```java
import java.util.Scanner;

public class nestedAksesLab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah status mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah dikenakan sanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.println("Apakah punya izin dari dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.println("Apakah merupakan asisten lab? (true/false): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
```
#### 2.3.2 Hasil Running

![Output Percobaan 3](<output akses lab.png>)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jelaskan fungsi operator &&, ||, dan ! pada program tersebut.
  * **Jawab:** Operator || berfungsi sebagai operator dengan rule OR yaitu minimal satu kondisi bernilai true untuk menghasilkan nilai true. Operator && berfungsi sebagai operator dengan rule AND yang kondisinya harus bernilai true semua agar menghasilkan nilai true. Operator ! berfungsi untuk menegasikan suatu kondisi
* **Pertanyaan 2:**  Apakah syarat akses dapat ditulis menjadi satu kondisi: mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)? Jelaskan apakah keputusan akses akhirnya sama.
  * **Jawab:** Bisa, output yang dihasilkan juga sama karena nested IF sama dengan operator &&
* **Pertanyaan 3:** Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika sistem perlu menampilkan alasan penolakan yang berbeda?
  * **Jawab:** Keuntungan dari nested IF adalah memungkinkan menangani salah satu kondisi yang bernilai false
* **Pertanyaan 4:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua.
  * **Jawab:** 
  1. Kombinasi 1: true, true, false, false
  2. Kombinasi 2: true, false, false, false

## 3: TUGAS MANDIRI
   1. Tugas 1: 
   * **Kode Program java**
```java
import java.util.Scanner;

public class tugas1diskonBuku19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int diskon = 0; 
    String buku;
    int jumlah;

    System.out.print("Buku apa yg ingin kamu beli?  ");
    buku = sc.next();

    System.out.print("Berapa jumlah bukunya? ");
    jumlah = sc.nextInt();

    if (buku.equalsIgnoreCase("kamus")) {
      diskon = 10;
      if (jumlah > 2) {
        diskon += 0.02;
      }
    } else if (buku.equalsIgnoreCase("novel")) {
      diskon = 7;
      if (jumlah > 3) {
        diskon += 3;
      } else {
        diskon += 0.01;
      }
    } else {
      if (jumlah > 3) {
        diskon = 5;
      }

    }
    sc.close();
    System.out.println(String.format("Total diskonmu adalah %d%%",  diskon));
  }
}
```
   * **Hasil Running**
    ![Output Tugas 1](<output diskon buku.png>)

   2. Tugas 2:
   * **Kode Program Java**
```java
import java.util.Scanner;

public class tugas2SeleksiAsisten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAktif;
        boolean sedangDisanksi;
        int nilaiDaspro,nilaiWawancara;
        boolean hasSertifikat;
        
        System.out.print("Apakah status mahasiswa aktif? ");
        isAktif = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa mendapatkan sanksi akademik? ");
        sedangDisanksi = sc.nextBoolean();

        if (isAktif && !sedangDisanksi) {
            System.out.print("Berapa nilai Dasar Pemrograman? ");
            nilaiDaspro = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? ");
            hasSertifikat = sc.nextBoolean();
            if (nilaiDaspro >= 80 || hasSertifikat) {
                System.out.print("Berapa nilai wawancara? ");
                nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten");
                } else {
                    System.out.println("Ditolak sebagai asisten");
                }
            } else {
                System.out.println("Maaf syarat berkas tidak terpenuhi");
            } 
        } else {
            System.out.println("Maaf syaratmu tidak terpenuhi");
        }
        sc.close();
    }
}
```
   * **Hasil Running**
   ![Output Tugas 2](<output seleksi asisten.png>)