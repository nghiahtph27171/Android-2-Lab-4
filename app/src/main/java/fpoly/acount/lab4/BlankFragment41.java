package fpoly.acount.lab4;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class BlankFragment41 extends Fragment {
    Button btn1;
    EditText edt1;

@SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank41,container,false);
        //anh xa
    btn1 =  view.findViewById(R.id.btnFra1);
    edt1 = view.findViewById(R.id.edtFra1);
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getContext(),edt1.getText(), Toast.LENGTH_SHORT).show();
        }
    });
        return view;
    }
}