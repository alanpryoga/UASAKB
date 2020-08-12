/**
 * Tanggal Pengerjaan   : 07/08/2020
 * NIM                  : 10117210
 * Nama                 : Ade Syahlan Prayoga
 * Kelas                : IF-7
 */
package com.alanpryoga.uasakb.data;

public class DbTable {

    public static final String LOKASI_TABLE             = "tb_lokasi";

    public static final String LOKASI_FIELD_ID          = "id";
    public static final String LOKASI_FIELD_NAMA        = "nama";
    public static final String LOKASI_FIELD_DESKRIPSI   = "deskripsi";
    public static final String LOKASI_FIELD_GAMBAR      = "gambar";
    public static final String LOKASI_FIELD_LONGITUDE   = "longitude";
    public static final String LOKASI_FIELD_LATITUDE    = "latitude";

    public static final String CREATE_LOKASI_TABLE = "CREATE TABLE " + LOKASI_TABLE + " (" +
            LOKASI_FIELD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            LOKASI_FIELD_NAMA + " CHAR(70) NOT NULL, " +
            LOKASI_FIELD_DESKRIPSI + " TEXT, " +
            LOKASI_FIELD_GAMBAR + " BLOB, " +
            LOKASI_FIELD_LONGITUDE + " CHAR(70), " +
            LOKASI_FIELD_LATITUDE + " CHAR(70)" + " )";

    public static final String DROP_LOKASI_TABLE = "DROP TABLE " + LOKASI_TABLE;
}
