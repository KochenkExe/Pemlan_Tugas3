package Tugas3;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int nilaiAngka;

    public MataKuliah(String kodeMK, String namaMK, int nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getNilaiAngka() {
        return nilaiAngka;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka <= 80) {
            return "B";
        } else if (nilaiAngka <= 60) {
            return "C";
        } else if (nilaiAngka <= 50) {
            return "D";
        } else if (nilaiAngka <= 40) {
            return "E";
        } else {
            return "Nilai tidak valid.";
        }
    }
}
