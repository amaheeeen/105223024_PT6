package kursusonline.model;

public class Sertifikat {
    private String idSertifikat;
    private String namaKursus;
    private String tanggalTerbit;

    public Sertifikat(String idSertifikat, String namaKursus, String tanggalTerbit) {
        this.idSertifikat = idSertifikat;
        this.namaKursus = namaKursus;
        this.tanggalTerbit = tanggalTerbit;
    }

    // Getter methods
    public String getIdSertifikat() {
        return idSertifikat;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    @Override
    public String toString() {
        return "Sertifikat: " + idSertifikat + " untuk kursus " + namaKursus + 
               " (Terbit: " + tanggalTerbit + ")";
    }
}