package com.apress.gerber.homework;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerFragment extends Fragment {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.recyclerview,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

return view;



    }


    private void prepareMovieData() {
        Movie movie = new Movie(R.drawable.ic_iitrlogo,"RJB", "Rating - 1/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"Cautley Bhavan Canteen", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"Govind Bhavan", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"---", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"----", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"----", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"----", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"Rajiv Canteen", "Rating - 4/5", "");
        movieList.add(movie);

        movie = new Movie(R.drawable.ic_iitrlogo,"The CBRI Canteen", "Rating - 4/5", "");
        movieList.add(movie);



        mAdapter.notifyDataSetChanged();
    }
}
