package kursusonline.model;

public class Materi {
    private String judul;
    private String deskripsi;
    private int durasi; // dalam menit

    public Materi(String judul, String deskripsi, int durasi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getDurasi() {
        return durasi;
    }

    @Override
    public String toString() {
        return "Materi: " + judul + " (" + durasi + " menit) - " + deskripsi;
    }
}