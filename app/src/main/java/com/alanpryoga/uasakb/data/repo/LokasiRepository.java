/**
 * Tanggal Pengerjaan   : 06/08/2020
 * NIM                  : 10117210
 * Nama                 : Ade Syahlan Prayoga
 * Kelas                : IF-7
 */
package com.alanpryoga.uasakb.data.repo;

import com.alanpryoga.uasakb.data.model.Lokasi;

import java.util.List;

public interface LokasiRepository {

    List<Lokasi> listLokasi();

    Lokasi getLokasi();

    void saveLokasi();
}