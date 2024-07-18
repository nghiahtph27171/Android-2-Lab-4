package fpoly.acount.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btn2;
EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.button2);
        edt2 = findViewById(R.id.edtFra2);
        //xu ly su kien
        btn2.setOnClickListener(v -> {
            //Doi tuong quan ly fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            //anh xa fragment
            BlankFragment41 fragment41 = (BlankFragment41) fragmentManager.findFragmentById(R.id.fragmentContainerView);
            //truyen du lieu tu activity sang fragment
            fragment41.edt1.setText(edt2.getText().toString());
        });
    }
}