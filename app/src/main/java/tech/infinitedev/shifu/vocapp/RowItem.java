package tech.infinitedev.shifu.vocapp;

/**
 * Created by shifu on 7/12/17.
 */

public class RowItem {

    private String nama_jurusan;
    private int gambar_id;
    private String deskripsi;

    public RowItem(String nama_jurusan, int gambar_id, String deskripsi) {

        this.nama_jurusan = nama_jurusan;
        this.gambar_id = gambar_id;
        this.deskripsi = deskripsi;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }

    public int getGambar_id() {
        return gambar_id;
    }

    public void setGambar_id(int gambar_id) {
        this.gambar_id = gambar_id;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
