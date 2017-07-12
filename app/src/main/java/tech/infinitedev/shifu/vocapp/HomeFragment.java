package tech.infinitedev.shifu.vocapp;

/**
 * Created by shifu on 7/7/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private SliderView sliderView;
    private LinearLayout mLinearLayout;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        setupSlider();

        //cvInfoJurusan = (CardView) rootView.findViewById(R.id.cvInfo);
        //ibSatu = (ImageButton) rootView.findViewById(R.id.gambarsatu);

        ImageButton ibTes = (ImageButton) rootView.findViewById(R.id.menu_tes);
        ImageButton ibInfo = (ImageButton) rootView.findViewById(R.id.menu_info);

        ibTes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeFragment.this.getActivity(), TesKemampuan.class));
            }
        });

        ibInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeFragment.this.getActivity(), InfoJurusan.class));
            }
        });

        /*cvInfoJurusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeFragment.this.getActivity(), InfoJurusan.class));
            }
        });*/

        return rootView;
    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-1.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-2.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-3.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-4.jpg"));

        SliderPagerAdapter mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        SliderIndicator mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

}
