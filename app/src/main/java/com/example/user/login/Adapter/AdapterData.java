package com.example.user.login.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.login.Data_Diri;
import com.example.user.login.Model.ModelData;
import com.example.user.login.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private List<ModelData> mItems ;
    private Context context;

    public AdapterData (Context context, List<ModelData> items)
    {
        this.mItems = items;
        this.context = context;
    }

    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row,parent,false);
        HolderData holderData = new HolderData(layout);
        return holderData;
    }

    @Override
    public void onBindViewHolder(HolderData holder, int position) {
        ModelData md  = mItems.get(position);
        holder.tvnama.setText(md.getNama());
        holder.tvnik.setText(md.getNik());
        holder.tvalamat.setText(md.getAlamat());
        holder.tvnohp.setText(md.getNohp());

        holder.md = md;


    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    class HolderData extends RecyclerView.ViewHolder
    {
        TextView tvnama,tvnik,tvalamat,tvnohp;
        ModelData md;

        public  HolderData (View view)
        {
            super(view);

            tvnama = (TextView) view.findViewById(R.id.nama);
            tvnik = (TextView) view.findViewById(R.id.nik);
            tvalamat = (TextView) view.findViewById(R.id.alamat);
            tvnohp = (TextView) view.findViewById(R.id.nohp);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent update = new Intent(context, Data_Diri.class);
                    update.putExtra("update",1);
                    update.putExtra("nama",md.getNama());
                    update.putExtra("nik",md.getNik());
                    update.putExtra("alamat",md.getAlamat());
                    update.putExtra("nohp",md.getNohp());

                    context.startActivity(update);
                }
            });
        }
    }
}

