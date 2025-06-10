
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika meli = new Matematika(1,9);
        
        System.out.println("Hasuk Penjumlahan" + meli.setPenjumlahan());
        System.out.println("Hasuk Pengurangan" + meli.setPengurangan());
        System.out.println("Hasuk Perkalian" + meli.setPerkalian());
        System.out.println("Hasuk Pembagian" + meli.setPembagian());
    }
}
