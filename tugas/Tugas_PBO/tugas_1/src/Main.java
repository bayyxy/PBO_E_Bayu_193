import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        System.out.print("Pilih login:\n1. Admin\n2. Mahasiswa");
        System.out.print("\nMasukkan pilihan: ");
        int pilih = objInput.nextInt();
        objInput.nextLine();
        if (pilih == 1){
            System.out.print("masukkan username");
            String username = objInput.nextLine();
            System.out.print("masukkan password");
            String password = objInput.nextLine();
            if (username.equals("Admin193") && password.equals("Password193")){
                System.out.print("Login Admin berhasil!");
            }else {
                System.out.print("Login gagal! Username atau Password salah.");
            }
        } else if (pilih==2) {
            System.out.print("Masukkan Nama: ");
            String username = objInput.nextLine();
            System.out.print("Masukkan NIM: ");
            String password = objInput.nextLine();
            if (username.equals("Bayu adi nugroho")&&password.equals("202410370110193")){
                System.out.print("Login Mahasiswa berhasil!");
            }else {
                System.out.print("Login gagal! Nama atau NIM salah.");
            }

        }else {
            System.out.print("Pilihan tidak valid!");
        }

    }
}