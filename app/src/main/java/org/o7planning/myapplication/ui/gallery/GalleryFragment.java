package org.o7planning.myapplication.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import org.o7planning.myapplication.MainActivity2;
import org.o7planning.myapplication.MainActivity3;
import org.o7planning.myapplication.R;
import org.o7planning.myapplication.databinding.FragmentGalleryBinding;
import org.o7planning.myapplication.login;

public class GalleryFragment extends Fragment {
Button button_dn,button_dk;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //onpen dang nhap
        button_dn= binding.buttonDn;
        button_dn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
// khai bảo intent
                Intent myintent=new Intent(getActivity(), login.class);
//mở, khởi động activity
                startActivity(myintent);
            }
        });
//        final TextView textView = binding.textGallery;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}