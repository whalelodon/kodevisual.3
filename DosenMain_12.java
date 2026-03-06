public class DosenMain_12{
    
    static class dosen{
        String nidn;
        String nama;
        int tahunMasuk;
        String jenjangPendidikan;
        String prodi;

        public dosen(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi){
            this.nidn = nidn;
            this.nama = nama;
            this.tahunMasuk = tahunMasuk;
            this.jenjangPendidikan = jenjangPendidikan;
            this.prodi = prodi;
        }
        void tampilkaninformasi(){
            System.out.println("Nidn Dosen :" + nidn);
            System.out.println("Nama Dosen :" + nama);
            System.out.println("Tahun Masuk Dosen :" + tahunMasuk);
            System.out.println("Prodi yang diampu Dosen :" + prodi);
        }
        void ubahProdi(String prodiBaru){
            prodi = prodiBaru;
        }
        void ubahPendidikan(String ubahPendidikan){
            jenjangPendidikan = ubahPendidikan;
        }
    }
    public static void main(String[] args) {
        dosen Dosen1 = new dosen("25410", "ida", 2012, "S1", "TI");
        Dosen1.tampilkaninformasi();
        Dosen1.ubahPendidikan("S2");
        Dosen1.ubahProdi("Sistem Informasi Bisnis");
        Dosen1.tampilkaninformasi();

        dosen Dosen2 = new dosen("607017", "zarnoshi", 1993, "S1", "Sistem Informasi Bisnis");
        Dosen2.tampilkaninformasi();
        Dosen2.ubahPendidikan("S3");
        Dosen2.ubahProdi("Teknologi Informasi");
        Dosen2.tampilkaninformasi();
    }
}