package modul2202357201054;

import javax.swing.JOptionPane;

public class bantuBudi {

    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double luasLingkaran(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public static void main(String[] args) {

        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang: "));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang: "));
        double luasPersegiPanjang = luasPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);

        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));
        double luasSegitiga = luasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "Luas Segitiga: " + luasSegitiga);
        System.out.println("Luas Segitiga: " + luasSegitiga);

        double jariJariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran: "));
        double luasLingkaran = luasLingkaran(jariJariLingkaran);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran: " + luasLingkaran);
        System.out.println("Luas Lingkaran: " + luasLingkaran);

    }
}
