package com.example.recudani.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.recudani.R;
import com.example.recudani.databinding.FragmentHomeBinding;

import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ViewPager viewPager = binding.viewPager;
        ImageSliderAdapter adapter = new ImageSliderAdapter(getImages());
        viewPager.setAdapter(adapter);

        return root;
    }

    private List<Integer> getImages() {
        // Return a list of image resources
        return Arrays.asList(R.drawable.image1, R.drawable.image2, R.drawable.image3);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}