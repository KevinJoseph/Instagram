package com.example.kevin.tarea.Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suhail on 09/03/2016.
 */
public class LoginAdaptador extends FragmentPagerAdapter {
    List<Fragment> mFragments = new ArrayList<>();
    List<String> mFragmentsLabels=new ArrayList<>();

    public LoginAdaptador(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void addFragment(Fragment fragment,String label){
            mFragments.add(fragment);
            mFragmentsLabels.add(label);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentsLabels.get(position);
    }
}
