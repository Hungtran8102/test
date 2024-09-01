package org.o7planning.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.o7planning.myapplication.databinding.ActivityMainBinding;
import org.o7planning.myapplication.item.gridDatachap;

public class MainActivity2 extends AppCompatActivity {
  ActivityMainBinding binding;
  GridView gridView;
  TextView buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
//        binding =ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        int[]image={R.drawable.dao_hai_tac_1552224567,R.drawable.onepic1
                ,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6
                ,R.drawable.d7,R.drawable.d8
                ,R.drawable.d9,R.drawable.d10,R.drawable.d11,R.drawable.d12,R.drawable.d13};
        gridDatachap gridDatachap = new gridDatachap(MainActivity2.this,image);
        gridView =findViewById(R.id.GridView);
        gridView.setAdapter(gridDatachap);
        //button back
        buttonback=findViewById(R.id.bttback);
        buttonback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
// khai bảo intent
                Intent myintent=new Intent(MainActivity2.this, MainActivity3.class);
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