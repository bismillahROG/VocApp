package tech.infinitedev.shifu.vocapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shifu on 7/12/17.
 */

public class CustomAdapter extends BaseAdapter {
    String[] jurusan = {};
    String[] deskripsi = {};
    int[] gambar = {};

    Context context;
    List<RowItem> rowItems;

    CustomAdapter(Context context, List<RowItem> rowItems, String[] jurusan, String[] deskripsi, int[] gambar) {
        this.context = context;
        this.rowItems = rowItems;
        this.jurusan = jurusan;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

    /* private view holder class */
    private class ViewHolder {
        ImageView gambar;
        TextView namaJurusan;
        TextView deskripsi;
        RelativeLayout view;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_jurusan, null);
            holder = new ViewHolder();

            holder.namaJurusan = (TextView) convertView
                    .findViewById(R.id.tv_jurusan);
            holder.gambar = (ImageView) convertView
                    .findViewById(R.id.iv_gambar);
            holder.deskripsi = (TextView) convertView.findViewById(R.id.tv_deskripsi);
            holder.view = (RelativeLayout) convertView.findViewById(R.id.rlJurusan);

            RowItem row_pos = rowItems.get(position);

            holder.gambar.setImageResource(row_pos.getGambar_id());
            holder.namaJurusan.setText(row_pos.getNama_jurusan());
            holder.deskripsi.setText(row_pos.getDeskripsi());

            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pindah = new Intent(parent.getContext(), DetailJurusan.class);
                    pindah.putExtra("jurusan", jurusan[position]);
                    pindah.putExtra("deskripsi", deskripsi[position]);
                    parent.getContext().startActivity(pindah);
                }
            });

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

}
