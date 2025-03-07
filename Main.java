package Tahap1;

public class Main {
    public static void main(String[] args) {

        Perusahaan perusahaan = new Perusahaan("PT. Astra Group");
        Karyawan karyawan1 = new Karyawan("Angga", 4500000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Lolly", 5000000, perusahaan);
        Karyawan karyawan3 = new Karyawan("Zara", 7000000, perusahaan);

        karyawan1.info();
        System.out.println();
        karyawan2.info();
        System.out.println();
        karyawan3.info();

    }
}
