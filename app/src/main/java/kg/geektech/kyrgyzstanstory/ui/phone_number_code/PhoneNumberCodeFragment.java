package kg.geektech.kyrgyzstanstory.ui.phone_number_code;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import kg.geektech.kyrgyzstanstory.databinding.FragmentPhoneNumberCodeBinding;
import kg.geektech.kyrgyzstanstory.ui.data.PhoneNumberData;

public class PhoneNumberCodeFragment extends Fragment {

    private FragmentPhoneNumberCodeBinding binding;
    private PhoneNumberCodeAdapter adapter;
    private PhoneNumberData data;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPhoneNumberCodeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
    }

    private void initAdapter() {
        adapter = new PhoneNumberCodeAdapter();
        data = new PhoneNumberData();
        adapter.setList(data.getList());
        binding.rvPhoneNumberCode.setAdapter(adapter);
    }
}