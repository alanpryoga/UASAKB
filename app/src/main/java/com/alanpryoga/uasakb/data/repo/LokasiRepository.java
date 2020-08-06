package com.alanpryoga.uasakb.data.repo;

import com.alanpryoga.uasakb.data.model.Lokasi;

import java.util.List;

public interface LokasiRepository {

    List<Lokasi> listLokasi();

    Lokasi getLokasi();

    void saveLokasi();
}