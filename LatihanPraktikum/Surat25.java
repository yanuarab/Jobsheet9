package LatihanPraktikum;

public class Surat25 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' untuk sakit, 'I' untuk izin
    int durasi;

    public Surat25() {}

    public Surat25(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}

