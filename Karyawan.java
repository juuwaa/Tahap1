package Tahap1;

public class Karyawan {
    private String nama;
    private double gaji;
    private Perusahaan perusahaan;

    public Karyawan (String nama, double gaji, Perusahaan perusahaan) {
        setNama(nama);
        this.gaji = gaji;
        this.perusahaan = perusahaan;
    }

    public void setNama(String nama) {
        if (nama != null && nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus terdiri dari minimal 4 karakter");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void info() {
        System.out.println("Nama Karyawan: " +nama);
        System.out.println("Gaji Pokok : " +gaji);
        System.out.println("Perusahaan : " + perusahaan.getNamaPerusahaan());
    }
}
