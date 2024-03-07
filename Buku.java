public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    
    
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    @Override
    public String toString() {
        return "Buku [Judul = " + judul + ", Penulis = " + penulis + ", Tahun Terbit = " + tahunTerbit + "]";
    }   
}