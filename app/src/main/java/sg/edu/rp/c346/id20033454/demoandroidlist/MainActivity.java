package sg.edu.rp.c346.id20033454.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> alAndroid;
//    ArrayAdapter<AndroidVersion> adapter;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.lvAndroid);
        alAndroid = new ArrayList<>();
//        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, alAndroid);
        adapter = new CustomAdapter(this, R.layout.row, alAndroid);

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alAndroid.add(item1);
        alAndroid.add(item2);
        alAndroid.add(item3);


        lvAndroid.setAdapter(adapter);

    }
}