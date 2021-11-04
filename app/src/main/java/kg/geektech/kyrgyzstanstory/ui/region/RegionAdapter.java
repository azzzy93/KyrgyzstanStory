package kg.geektech.kyrgyzstanstory.ui.region;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.kyrgyzstanstory.databinding.ListRegionBinding;
import kg.geektech.kyrgyzstanstory.interfaces.MineOnItemClickListener;
import kg.geektech.kyrgyzstanstory.ui.models.RegionModel;

public class RegionAdapter extends RecyclerView.Adapter<RegionAdapter.ViewHolder> {
    private ArrayList<RegionModel> list;
    private MineOnItemClickListener mineOnItemClickListener;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<RegionModel> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListRegionBinding binding = ListRegionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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

    public void setMineOnItemClickListener(MineOnItemClickListener mineOnItemClickListener) {
        this.mineOnItemClickListener = mineOnItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ListRegionBinding binding;

        public ViewHolder(@NonNull ListRegionBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.tvRegion.setOnClickListener(v -> {
                mineOnItemClickListener.onClick(getAdapterPosition());
            });
        }

        public void onBind(RegionModel regionModel) {
            binding.tvRegion.setText(regionModel.getText());
        }
    }
}
