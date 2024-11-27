import java.io.File;
import java.util.Date;

public class Penduduk {
    private String nik;
    private String nama;
    private String tempatLahir;
    private Date tanggalLagir;
    private JenisKelamin jenisKelamin;
    private GolDarah golDarah;
    private String alamat;
    private String rt;
    private String rw;
    private String kel;
    private String Desa;
    private String kecamatan;
    private Agama agama;
    private StatusPerkawinan statusPerkawinan;
    private String Pekerjaan;
    private String kewarganegaraan;
    private File foto;
    private File tandaTangan;
    private String berlakuHingga;
    private String kotaPembuatanKTP;
    private String tanggalPembuatanKTP;

    public Penduduk() {
    }

    public Penduduk(String nik, String nama, String tempatLahir, Date tanggalLagir, JenisKelamin jenisKelamin,
            GolDarah golDarah, String alamat, String rt, String rw, String kel, String desa, String kecamatan,
            Agama agama, StatusPerkawinan statusPerkawinan, String pekerjaan, String kewarganegaraan, File foto,
            File tandaTangan, String berlakuHingga, String kotaPembuatanKTP, String tanggalPembuatanKTP) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLagir = tanggalLagir;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.alamat = alamat;
        this.rt = rt;
        this.rw = rw;
        this.kel = kel;
        this.Desa = desa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.Pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.foto = foto;
        this.tandaTangan = tandaTangan;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatanKTP = kotaPembuatanKTP;
        this.tanggalPembuatanKTP = tanggalPembuatanKTP;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLagir() {
        return tanggalLagir;
    }

    public void setTanggalLagir(Date tanggalLagir) {
        this.tanggalLagir = tanggalLagir;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public GolDarah getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(GolDarah golDarah) {
        this.golDarah = golDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public String getKel() {
        return kel;
    }

    public void setKel(String kel) {
        this.kel = kel;
    }

    public String getDesa() {
        return Desa;
    }

    public void setDesa(String desa) {
        Desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public Agama getAgama() {
        return agama;
    }

    public void setAgama(Agama agama) {
        this.agama = agama;
    }

    public StatusPerkawinan getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(StatusPerkawinan statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        Pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public File getTandaTangan() {
        return tandaTangan;
    }

    public void setTandaTangan(File tandaTangan) {
        this.tandaTangan = tandaTangan;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatanKTP() {
        return kotaPembuatanKTP;
    }

    public void setKotaPembuatanKTP(String kotaPembuatanKTP) {
        this.kotaPembuatanKTP = kotaPembuatanKTP;
    }

    public String getTanggalPembuatanKTP() {
        return tanggalPembuatanKTP;
    }

    public void setTanggalPembuatanKTP(String tanggalPembuatanKTP) {
        this.tanggalPembuatanKTP = tanggalPembuatanKTP;
    }
}