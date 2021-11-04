package kg.geektech.kyrgyzstanstory.ui.story;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.kyrgyzstanstory.databinding.ListStoryBinding;
import kg.geektech.kyrgyzstanstory.interfaces.MineOnItemClickListener;
import kg.geektech.kyrgyzstanstory.ui.models.StoryModel;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {
    private ArrayList<StoryModel>list;
    private MineOnItemClickListener mineOnItemClickListener;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<StoryModel> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListStoryBinding binding = ListStoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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
        private ListStoryBinding binding;

        public ViewHolder(@NonNull ListStoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.tvListStory.setOnClickListener(v -> {
                mineOnItemClickListener.onClick(getAdapterPosition());
            });
        }

        public void onBind(StoryModel storyModel) {
            binding.tvListStory.setText(storyModel.getText());
        }
    }
}
