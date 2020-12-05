package com.example.times;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.times.dummy.TeamContent;

public class ItemDetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";
    private TeamContent.TeamItem mItem;

    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mItem = TeamContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
                ((ImageView) appBarLayout.findViewById(R.id.imageDetailLogo)).setImageResource(mItem.image);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail_alt, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.textViewDetail)).setText(mItem.details);
            ((TextView) rootView.findViewById(R.id.textViewLocation)).setText(mItem.city + " - " + mItem.state);
            ((TextView) rootView.findViewById(R.id.textViewTitles)).setText(mItem.titles);
        }

        return rootView;
    }
}