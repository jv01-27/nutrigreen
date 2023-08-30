package com.example.nutrigreen.controlador;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int numoftabs;

    public PagerController(FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new privacidad();
            case 1:
                return new terminos();
            case 2:
                return new responsabilidad();
            default:
                return null;
        }
        //return null;
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
