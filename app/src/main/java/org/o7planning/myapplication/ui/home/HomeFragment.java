package org.o7planning.myapplication.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import org.o7planning.myapplication.MainActivity2;
import org.o7planning.myapplication.MainActivity3;
import org.o7planning.myapplication.R;
import org.o7planning.myapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    GridView gridView;;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        String[]name={"One Piece","Jujutsu Kaisen","Jojo's","Dragon Ball","Shokugeki No Soma"};
        int[]image={R.drawable.dao3,R.drawable.jujutsukaisen
                ,R.drawable.cuocphieuluubian552226338,R.drawable.vienngocron1552225535,R.drawable.vuabepsoma1552231864};
        girdData girdData = new girdData(getContext(),name,image);
        binding.girdview .setAdapter(girdData);

        binding.girdview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapterView,View view,int position,long id){
                Intent myintent=new Intent(getActivity(), MainActivity3.class);
//mở, khởi động activity
                startActivity(myintent);
            }
        });
        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }
}