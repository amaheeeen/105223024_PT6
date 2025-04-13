package kursusonline.model;

import java.util.ArrayList;

public class Kursus {
    private String kode;
    private String nama;
    private Instruktur instruktur;
    private ArrayList<Peserta> daftarPeserta;
    private ArrayList<Materi> daftarMateri;

    public Kursus(String kode, String nama, Instruktur instruktur) {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
        this.daftarPeserta = new ArrayList<>();
        this.daftarMateri = new ArrayList<>();
    }

    public void tambahMateri(Materi m) {
        daftarMateri.add(m);
    }

    public boolean tambahPeserta(Peserta p) {
        // Validasi email
        if (!p.getEmail().endsWith("@gmail.com")) {
            System.out.println("Gagal menambahkan peserta: Email tidak valid");
            return false;
        }

        // Validasi ID duplikat
        for (Peserta peserta : daftarPeserta) {
            if (peserta.getId().equals(p.getId())) {
                System.out.println("Gagal menambahkan peserta: ID sudah terdaftar");
                return false;
            }
        }

        daftarPeserta.add(p);
        return true;
    }

    public void tampilkanDetailKursus() {
        System.out.println("\n=== Detail Kursus ===");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println(instruktur);
        System.out.println("\nMateri:");
        for (Materi m : daftarMateri) {
            System.out.println("- " + m);
        }
        System.out.println("\nPeserta:");
        for (Peserta p : daftarPeserta) {
            System.out.println("- " + p);
        }
        System.out.println("=====================");
    }

    // Getter methods
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Instruktur getInstruktur() {
        return instruktur;
    }

    public ArrayList<Peserta> getDaftarPeserta() {
        return daftarPeserta;
    }

    public ArrayList<Materi> getDaftarMateri() {
        return daftarMateri;
    }
}