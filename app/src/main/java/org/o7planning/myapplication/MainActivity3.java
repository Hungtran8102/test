package org.o7planning.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.o7planning.myapplication.item.girdDatanumber;

public class MainActivity3 extends AppCompatActivity {
    GridView gridView;
    TextView buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        String[]name={"Chương 1","Chương 2","Chương 3","Chương 4","Chương 5","Chương 6",};
        girdDatanumber girdDatanumber = new girdDatanumber(MainActivity3.this,name);
        gridView =findViewById(R.id.GridView);
        gridView.setAdapter(girdDatanumber);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapterView,View view,int position,long id){
                Intent myintent=new Intent(MainActivity3.this, MainActivity2.class);
//mở, khởi động activity
                startActivity(myintent);
            }
        });
        //button back

        buttonback=findViewById(R.id.bttback);
        buttonback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
// khai bảo intent
                Intent myintent=new Intent(MainActivity3.this, MainActivity.class);
//mở, khởi động activity
                startActivity(myintent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}