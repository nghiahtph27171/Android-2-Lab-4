package fpoly.acount.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class Demo42MainActivity extends AppCompatActivity {
Button btnAn,btnHien;
BlankFragment41 frg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo42_main);
        btnAn =findViewById(R.id.buttonAn);
        btnHien = findViewById(R.id.buttonHien);
        btnAn.setOnClickListener(v -> {
            //tao doi tuong quan ly fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            //anh xa fragment
            frg = (BlankFragment41) fragmentManager.findFragmentById(R.id.fragmentContainerView2);
            //an
            fragmentManager.beginTransaction().hide(frg).commit();
        });
        btnHien.setOnClickListener(v -> {
            //tao doi tuong quan ly fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            //anh xa fragment
            frg = (BlankFragment41) fragmentManager.findFragmentById(R.id.fragmentContainerView2);
            //an
            fragmentManager.beginTransaction().show(frg).commit();
        });
    }
}