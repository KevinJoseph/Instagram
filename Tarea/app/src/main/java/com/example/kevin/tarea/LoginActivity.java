package com.example.kevin.tarea;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kevin.tarea.Adaptadores.LoginAdaptador;
import com.example.kevin.tarea.fragments.fragments.LoginFragment;
import com.example.kevin.tarea.fragments.fragments.Sing_up_fragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ViewPager  viewPager= (ViewPager)findViewById(R.id.viewPager);

        LoginAdaptador adapter = new LoginAdaptador(getSupportFragmentManager());
        adapter.addFragment(new Sing_up_fragment(),"Sing Up");
        adapter.addFragment(new LoginFragment(), "Login");
        viewPager.setAdapter(adapter);

        TabLayout tabs = (TabLayout)findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.getTabAt(1).select();

    }
}
