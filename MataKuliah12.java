import java.util.Scanner;
public class MataKuliah12 {

    static class matakuliah{
        String kodeMK;
        String namaMK;
        int sks;
        String dosenPengampu;
        
        public matakuliah(String kodeMK, String namaMK, int sks,String dosenPengampu){
            this.kodeMK = kodeMK;
            this.namaMK = namaMK;
            this.sks = sks;
            this.dosenPengampu = dosenPengampu;
        }
        void ubahNamaMK(String ubahNamaMK){
            namaMK = ubahNamaMK;
        }
        void ubahSKS(int ubahsks){
            sks = ubahsks;
        }
        void kurangisks(int kurangiSKS){
            if(sks - kurangiSKS >= 1){
                sks -= kurangiSKS;
                System.out.println("buku berhasil dikurangi " + sks);
            }
            else{
                System.out.println("buku anda tidak bisa dikurnagi "+ sks);
            }
        }

    }
    public static void inputmatakuliah(String[][] Matakuliah, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("\njadwal Mata Kuliah-" + (i + 1));

            System.out.print("kode Mata Kuliah : ");
            Matakuliah[i][0] = input.nextLine();

            System.out.print("Nama Mata Kuliah: ");
            Matakuliah[i][1] = input.nextLine();

            System.out.print("SKS: ");
            Matakuliah[i][2] = input.nextLine();

            System.out.print("Dosen Pengampu: ");
            Matakuliah[i][3] = input.nextLine();
        }
    }
    public static void tampilSemua(String[][] Matakuliah, int n) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "kode MK", "nama MK", "sks", "Dosen Pengampu");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    Matakuliah[i][0],
                    Matakuliah[i][1],
                    Matakuliah[i][2],
                    Matakuliah[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah jadwal mata kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] Matakuliah = new String[n][4];
        inputmatakuliah(Matakuliah, n, input);
        tampilSemua(Matakuliah, n);
        input.close();
    }
}
