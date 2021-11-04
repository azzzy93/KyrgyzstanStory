package kg.geektech.kyrgyzstanstory.ui.phone_number_code;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.kyrgyzstanstory.databinding.ListPhoneNumberCodeBinding;
import kg.geektech.kyrgyzstanstory.ui.models.PhoneNumberModel;

public class PhoneNumberCodeAdapter extends RecyclerView.Adapter<PhoneNumberCodeAdapter.ViewHolder> {
    ArrayList<PhoneNumberModel>list;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<PhoneNumberModel> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListPhoneNumberCodeBinding binding = ListPhoneNumberCodeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ListPhoneNumberCodeBinding binding;

        public ViewHolder(@NonNull ListPhoneNumberCodeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(PhoneNumberModel phoneNumberModel) {
            binding.tvPhoneNumberCode.setText(phoneNumberModel.getCode());
            binding.tvPhoneNumberCodeCity.setText(phoneNumberModel.getCity());
            binding.tvPhoneNumberCodeCountry.setText(phoneNumberModel.getCountry());
        }
    }
}
