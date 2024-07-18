package fpoly.acount.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DemoMainActivity43 extends AppCompatActivity {
ViewPager viewPager;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_main43);
        viewPager = findViewById(R.id.demo43ViewPager);
        tabLayout = findViewById(R.id.demo43TabLayout);
        addTabLayout(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void addTabLayout(ViewPager viewPager){
        //Tao moi adpter
        Demo43Adapter adapter = new Demo43Adapter(getSupportFragmentManager());
        //them fragment vao adapter
        adapter.addFrag(new BlankFragment41(),"ONE");
        adapter.addFrag(new BlankFragment42(),"TWO");
        adapter.addFrag(new BlankFragment43(),"THREE");
        //dua adpter vao viewpager
        viewPager.setAdapter(adapter);
    }
}