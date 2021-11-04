package kg.geektech.kyrgyzstanstory.ui.story_page;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kg.geektech.kyrgyzstanstory.R;
import kg.geektech.kyrgyzstanstory.databinding.FragmentStoryBinding;
import kg.geektech.kyrgyzstanstory.databinding.FragmentStoryPageBinding;

public class StoryPageFragment extends Fragment {
    private FragmentStoryPageBinding binding;
    private Bundle bundle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStoryPageBinding.inflate(inflater, container, false);
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
            binding.tvStoryPage.setText(bundle.getString("key"));
        }
    }
}