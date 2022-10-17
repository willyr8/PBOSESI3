
package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Mahasiswa21A extends Mahasiswa{
    Mahasiswa21A(String nim, String nama, int nilai){
        super(nim, nama, nilai);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa21A> daftar = new ArrayList<>();
        System.out.print("Masukan Total Data : ");
        int tot_data = Integer.parseInt(input.nextLine());
        int tot_lulus = 0, tot_tdk_lulus = 0, nil_a = 0, nil_b = 0, nil_c = 0, nil_d = 0, nil_e = 0, tot_nilai = 0;
        String nm_lulus = "", nm_tlulus = "", nm_a = "", nm_b = "", nm_c = "", nm_d = "", nm_e = "";
        for (int i = 0; i < tot_data; i++) {
            System.out.print("Masukan NIM : ");
            String nim = input.nextLine();

            System.out.print("Masukan Nama : ");
            String nama = input.nextLine();

            System.out.print("Masukan Nilai :");
            int nilai = Integer.parseInt(input.nextLine());
            System.out.println("===============================");
            Mahasiswa21A willy = new Mahasiswa21A(nim, nama, nilai);
            daftar.add(willy);
            if (willy.isLulus()) {
                tot_lulus++;
                nm_lulus += nama + ", ";
            } else {
                tot_tdk_lulus++;
                nm_tlulus += nama + ", ";

            }
            if (willy.getGradeGG() == 'A') {
                nil_a++;
                nm_a += nama + ", ";
            } else if (willy.getGradeGG() == 'B') {
                nil_b++;
                nm_b += nama + ", ";
            } else if (willy.getGradeGG() == 'C') {
                nil_c++;
                nm_c += nama + ", ";
            } else if (willy.getGradeGG() == 'D') {
                nil_d++;
                nm_d += nama + ", ";
            } else if (willy.getGradeGG() == 'E') {
                nil_e++;
                nm_e += nama + ", ";
            }
            tot_nilai += nilai;
        }
        double rata_rata = tot_nilai / tot_data;
//            Ini untuk output    
        System.out.println("Hasil");
        for (int i = 0; i < tot_data; i++) {
            daftar.get(i).info();
        }
        System.out.println("Jumlah Mahasiswa :" + tot_data);
        if(tot_lulus>0){
            System.out.println("Total Lulus :" + tot_lulus + " Yaitu " + nm_lulus);
        }else{
            System.out.println("Total Lulus :" + tot_lulus);
        }
        if(tot_tdk_lulus>0){
            System.out.println("Tidak Lulus :" + tot_tdk_lulus + " Yaitu " + nm_tlulus);
        }else{
            System.out.println("Tidak Lulus :" + tot_tdk_lulus);
        }
        if(nil_a>0){
            System.out.println("Nilai A :" + nil_a + " Yaitu " + nm_a);
        }else{
            System.out.println("Nilai A :" + nil_a);
        }
        if(nil_b>0){
            System.out.println("Nilai B :" + nil_b + " Yaitu " + nm_b);
        }else{
            System.out.println("Nilai B :" + nil_b);
        }
        if(nil_c>0){
            System.out.println("Nilai C :" + nil_c + " Yaitu " + nm_c);
        }else{
            System.out.println("Nilai C :" + nil_c);
        }
        if(nil_d>0){
              System.out.println("Nilai D :" + nil_d + " Yaitu " + nm_d);
        }else{
              System.out.println("Nilai D :" + nil_d);
        }
        if(nil_e>0){
            System.out.println("Nilai E :" + nil_e + " Yaitu " + nm_e);
        }else{
            System.out.println("Nilai E :" + nil_e);
        }
        System.out.println("Total Nilai mahasiswa adalah :" + tot_nilai + " / " + tot_data + " = " + rata_rata);
    }

}
