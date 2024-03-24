package Tugas3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<Mahasiswa>();
        ArrayList<MataKuliah> matkuls = new ArrayList<MataKuliah>();

        Scanner input = new Scanner(System.in);

        boolean next = true;
        while (next) {
            System.out.print("Masukkan nama\t: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM\t: ");
            String nim = input.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
            mahasiswas.add(mahasiswa);
            System.out.print("Masukkan nama mata kuliah\t: ");
            String namaMK = input.nextLine();

            System.out.print("Masukkan kode mata kuliah\t: ");
            String kodeMK = input.nextLine();

            System.out.print("Masukkan nilai\t: ");
            Integer nilaiAngka = input.nextInt();
            input.nextLine();

            MataKuliah matkul = new MataKuliah(kodeMK, namaMK, nilaiAngka);
            matkuls.add(matkul);

            System.out.print("tambah lagi? ");
            String tambah = input.nextLine();
            if (tambah.equals("t")) {
                next = false;
            }
        }

        input.close();

        System.out.println("=======================================================================");
        System.out.printf("%-10s | %-20s | %-10s | %-20s | %-5s%n",
                "NIM", "Nama Mahasiswa", "Kode MK", "Nama MK", "Nilai");
        System.out.println("=======================================================================");
        for (int i = 0; i < mahasiswas.size(); i++) {
            Mahasiswa mhs = mahasiswas.get(i);
            MataKuliah mk = matkuls.get(i);
            System.out.printf("%-10s | %-20s | %-10s | %-20s | %-5s%n",
                    mhs.getNim(), mhs.getNama(), mk.getKodeMK(), mk.getNamaMK(), mk.getNilaiHuruf());
        }
    }
}