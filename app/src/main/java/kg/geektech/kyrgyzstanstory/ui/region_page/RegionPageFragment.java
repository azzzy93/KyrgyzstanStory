package kg.geektech.kyrgyzstanstory.ui.region_page;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kg.geektech.kyrgyzstanstory.databinding.FragmentRegionPageBinding;

public class RegionPageFragment extends Fragment {
    private FragmentRegionPageBinding binding;
    private Bundle bundle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegionPageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {
        if (getArguments() != null){
            bundle = getArguments();
            binding.tvRegionPage.setText(bundle.getString("key"));
        }
    }
}