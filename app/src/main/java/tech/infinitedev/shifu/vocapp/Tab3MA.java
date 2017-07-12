package tech.infinitedev.shifu.vocapp;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shifu on 7/12/17.
 */

public class Tab3MA extends ListFragment {

    /**
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
     Bundle savedInstanceState) {
     View rootView = inflater.inflate(R.layout.tab3ma, container, false);

     return rootView;
     }
     */

    String[] namaJurusan;
    String[] deskripsi;
    TypedArray gambar;
    List<RowItem> rowItems;
    ListView listJurusan;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_jurusan, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rowItems = new ArrayList<RowItem>();

        namaJurusan = getResources().getStringArray(R.array.jurusanMA);
        gambar = getResources().obtainTypedArray(R.array.gambarMA);
        deskripsi = getResources().getStringArray(R.array.deskripsiMA);

        for (int i = 0; i < namaJurusan.length; i++) {
            RowItem item = new RowItem(namaJurusan[i],
                    gambar.getResourceId(i, -1), deskripsi[i]);
            rowItems.add(item);
        }

        CustomAdapter adapter = new CustomAdapter(getActivity(), rowItems, namaJurusan, deskripsi, null);
        setListAdapter(adapter);
        gambar.recycle();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

}

