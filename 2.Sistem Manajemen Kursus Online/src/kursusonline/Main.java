package kursusonline;

import kursusonline.model.*;
import kursusonline.service.KursusService;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi service
        KursusService kursusService = new KursusService();

        // Membuat instruktur
        Instruktur instruktur1 = new Instruktur("INS001", "Budi Santoso", "Pemrograman Java");
        Instruktur instruktur2 = new Instruktur("INS002", "Ani Wijaya", "Data Science");

        // Membuat kursus
        Kursus kursus1 = new Kursus("JAV101", "Pemrograman Java Dasar", instruktur1);
        Kursus kursus2 = new Kursus("DS201", "Pengantar Data Science", instruktur2);

        // Menambahkan kursus ke service
        kursusService.tambahKursus(kursus1);
        kursusService.tambahKursus(kursus2);

        // Membuat materi
        Materi materi1 = new Materi("Pengenalan Java", "Dasar-dasar pemrograman Java", 120);
        Materi materi2 = new Materi("OOP di Java", "Konsep Object-Oriented Programming", 180);
        Materi materi3 = new Materi("Pengenalan Data", "Konsep dasar data science", 90);

        // Menambahkan materi ke kursus
        kursus1.tambahMateri(materi1);
        kursus1.tambahMateri(materi2);
        kursus2.tambahMateri(materi3);

        // Membuat peserta
        Peserta peserta1 = new Peserta("P001", "Dewi Lestari", "dewi@gmail.com", "08123456789");
        Peserta peserta2 = new Peserta("P002", "Fajar Nugraha", "fajar@gmail.com", "08234567890");
        Peserta peserta3 = new Peserta("P003", "Gita Putri", "gita@yahoo.com", "08345678901"); // Email tidak valid

        // Menambahkan peserta ke kursus
        kursusService.tambahPesertaKeKursus("JAV101", peserta1);
        kursusService.tambahPesertaKeKursus("JAV101", peserta2);
        kursusService.tambahPesertaKeKursus("DS201", peserta1);
        
        // Peserta dengan email tidak valid akan gagal ditambahkan
        try {
            kursusService.tambahPesertaKeKursus("DS201", peserta3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Menampilkan semua kursus
        kursusService.tampilkanSemuaKursus();

        // Membuat sertifikat
        Sertifikat sertifikat1 = new Sertifikat("SERT001", "Pemrograman Java Dasar", "2023-05-15");
        peserta1.setSertifikat(sertifikat1);

        // Menampilkan detail kursus setelah sertifikat ditambahkan
        System.out.println("\n=== Setelah Sertifikat Ditambahkan ===");
        kursusService.tampilkanSemuaKursus();
    }
}