import java.util.Scanner;

public class DosenDemo {

    static class Dosen {
        String kode;
        String nama;
        Boolean jenisKelamin;
        int usia;

        public Dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.usia = usia;
        }

        public void tampilData() {
            System.out.println("Kode          : " + kode);
            System.out.println("Nama          : " + nama);
            System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + usia);
            System.out.println("-------------------------------");
        }
    }
    static class DataDosen {

        void dataSemuaDosen(Dosen[] arrayOfDosen) {
            System.out.println("\n=== DATA SEMUA DOSEN ===");
            for (Dosen d : arrayOfDosen) {
                d.tampilData();
            }
        }

        void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
            int pria = 0, wanita = 0;

            for (Dosen d : arrayOfDosen) {
                if (d.jenisKelamin)
                    pria++;
                else
                    wanita++;
            }

            System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
            System.out.println("Pria   : " + pria);
            System.out.println("Wanita : " + wanita);
        }

        void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
            int totalPria = 0, totalWanita = 0;
            int jmlPria = 0, jmlWanita = 0;

            for (Dosen d : arrayOfDosen) {
                if (d.jenisKelamin) {
                    totalPria += d.usia;
                    jmlPria++;
                } else {
                    totalWanita += d.usia;
                    jmlWanita++;
                }
            }

            System.out.println("\n=== RATA-RATA USIA DOSEN ===");
            if (jmlPria > 0)
                System.out.println("Pria   : " + (totalPria / jmlPria));
            if (jmlWanita > 0)
                System.out.println("Wanita : " + (totalWanita / jmlWanita));
        }

        void infoDosenPalingTua(Dosen[] arrayOfDosen) {
            Dosen tertua = arrayOfDosen[0];

            for (Dosen d : arrayOfDosen) {
                if (d.usia > tertua.usia) {
                    tertua = d;
                }
            }

            System.out.println("\n=== DOSEN PALING TUA ===");
            tertua.tampilData();
        }

        void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
            Dosen termuda = arrayOfDosen[0];

            for (Dosen d : arrayOfDosen) {
                if (d.usia < termuda.usia) {
                    termuda = d;
                }
            }

            System.out.println("\n=== DOSEN PALING MUDA ===");
            termuda.tampilData();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen[] arrayDosen = new Dosen[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("L");

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        DataDosen data = new DataDosen();

        data.dataSemuaDosen(arrayDosen);
        data.jumlahDosenPerJenisKelamin(arrayDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        data.infoDosenPalingTua(arrayDosen);
        data.infoDosenPalingMuda(arrayDosen);

        sc.close();
    }
}