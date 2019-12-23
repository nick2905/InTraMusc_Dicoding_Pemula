package com.dicoding.intramusc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class ListMusikAdapter extends RecyclerView.Adapter<ListMusikAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Musik> listMusik;

    private ArrayList<Musik> getListMusik() {
        return listMusik;
    }

    void setListMusik(ArrayList<Musik> listMusik) {
        this.listMusik= listMusik;
    }

    ListMusikAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_musik, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        final Musik p = getListMusik().get(position);

        categoryViewHolder.tvName.setText(getListMusik().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListMusik().get(position).getRemarks());
        categoryViewHolder.imgPhoto.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Image_url",p.getPhoto());
                intent.putExtra("Name",p.getName());
                intent.putExtra("Remarks",p.getRemarks());
                intent.putExtra("Deskri",p.getDesc());
                context.startActivity(intent);
            }
        }));
        Glide.with(context)
                .load(getListMusik().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListMusik().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvDesc;
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}