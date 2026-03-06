public class buku{
    String genre;
    String judul;
    int id_buku;
    int jumlahBuku;

    buku(){
    }
    public buku(String genre, String judul, int id_buku){
    }
    void tampilkanInformasi(){
        System.out.println("genre buku =" + genre);
        System.out.println("judul buku =" + judul);
        System.out.println("id buku =" + id_buku);
        System.out.println("jumlah buku" + jumlahBuku);
        System.out.println("-------------------");
    }
    void ubahId(int idbaru){
        this.id_buku = idbaru;
        System.out.println("id diubah menjadi yang terbaru " + id_buku);
    }
    void ubahgenre(String genreBaru){
        this.genre = genreBaru;
    }
    void ubahJudul(String judulBaru){
        judul = judulBaru;
    }
    void ubahjumlah(int jumlahtambah){
        jumlahBuku += jumlahtambah;
        System.out.println("buku berhasil ditambahkan " + jumlahBuku);
    }
    void kurangibuku(int kurangiBuku){
        if(jumlahBuku - kurangiBuku >= 1){
            jumlahBuku -= kurangiBuku;
            System.out.println("buku berhasil dikurangi " + jumlahBuku);
        }
        else{
            System.out.println("buku anda tidak bisa dikurnagi "+ jumlahBuku);
        }
    }
    public static void main(String[] args) {
        buku buku1 = new buku();
        buku1.genre = "lalaland";
        buku1.judul = "romantis";
        buku1.id_buku = 123;
        buku1.jumlahBuku = 2;
        buku1.tampilkanInformasi();
        buku1.ubahId(234);
        buku1.ubahJudul("lolo");
        buku1.ubahgenre("fara");
        buku1.ubahjumlah( 3);
        buku1.kurangibuku(2);
        buku1.kurangibuku(2);
        buku1.kurangibuku(1);
        buku1.tampilkanInformasi();
    }
}