package com.gmail.indraramadhona12.tugaspjmdaftarfilm;

public class konfigurasi {
    public static final String URL_ADD="https://arifhhandoko.000webhostapp.com/android/film/tambahPgw.php";
    public static final String URL_GET_ALL = "https://arifhhandoko.000webhostapp.com/android/film/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "https://arifhhandoko.000webhostapp.com/android/film/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "https://arifhhandoko.000webhostapp.com/android/film/updatePgw.php";
    public static final String URL_DELETE_EMP = "https://arifhhandoko.000webhostapp.com/android/film/hapusPgw.php?id=";
    public static final String URL_GET_ALL_JUDUL  = "https://arifhhandoko.000webhostapp.com/android/film/tampilSemuaPgwJudul.php";
    public static final String URL_GET_ALL_ACT  = "https://arifhhandoko.000webhostapp.com/android/film/tampilSemuaPgwAct.php";
    public static final String URL_GET_ALL_COM  = "https://arifhhandoko.000webhostapp.com/android/film/tampilSemuaPgwCom.php";
    public static final String URL_GET_ALL_HOR  = "https://arifhhandoko.000webhostapp.com/android/film/tampilSemuaPgwHor.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_DESKRIPSI = "deskripsi";
    public static final String KEY_EMP_GENRE = "genre";
    public static final String KEY_EMP_TAHUN = "tahun";
    public static final String KEY_EMP_LINK = "link";


    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_DESKRIPSI = "deskripsi";
    public static final String TAG_GENRE = "genre";
    public static final String TAG_TAHUN = "tahun";
    public static final String TAG_LINK = "link";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}

