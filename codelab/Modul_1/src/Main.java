import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        char gender;
        int tahun_lahir;
        Scanner objInput = new Scanner(System.in);


        System.out.print("Masukkan nama: ");
        nama = objInput.nextLine();
        System.out.print("Masukkan jenis kelamin (P/L):");
        gender = objInput.next().charAt(0);
        System.out.print("Masukkan tahun lahir: ");
        tahun_lahir= objInput.nextInt();
        int tahun_sekarang = LocalDate.now().getYear();
        int umur= tahun_sekarang-tahun_lahir;
        if (gender == 'L'||gender =='l') {
            System.out.println("\nData diri:\nNama\t\t  : " + nama + "\nJenis Kelamin : Laki-Laki\nUmur\t\t  : "+umur);
        }
        else if (gender == 'P'||gender =='p'){
            System.out.println("\nData diri:\nNama\t\t  : " + nama + "\nJenis Kelamin : Perempuan\numur\t\t  : "+umur);
        }else{
            System.out.println("masukkan gender L atau P");
        }

    }
}