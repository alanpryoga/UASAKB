/**
 * NIM      : 10117210
 * Nama     : Ade Syahlan Prayoga
 * Kelas    : IF-7
 */
package com.alanpryoga.uasakb.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alanpryoga.uasakb.R;

public class AboutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, container, false);
    }
}