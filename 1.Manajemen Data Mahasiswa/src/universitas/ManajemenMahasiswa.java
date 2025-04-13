package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private final ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilkanSemua() {
        System.out.println("\nDAFTAR MAHASISWA:");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanData();
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getIPK() > tertinggi.getIPK()) {
                tertinggi = mhs;
            }
        }

        System.out.println("\nMAHASISWA DENGAN IPK TERTINGGI:");
        tertinggi.tampilkanData();
    }
}