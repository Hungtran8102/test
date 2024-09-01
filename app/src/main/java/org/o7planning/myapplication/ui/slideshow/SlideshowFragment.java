package org.o7planning.myapplication.ui.slideshow;

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

import org.o7planning.myapplication.databinding.FragmentSlideshowBinding;
import org.o7planning.myapplication.login;

public class SlideshowFragment extends Fragment {
    Button button_dn,button_dk;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
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
//        final TextView textView = binding.textSlideshow;
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}