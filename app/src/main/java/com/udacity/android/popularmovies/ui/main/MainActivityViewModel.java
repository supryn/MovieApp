package com.udacity.android.popularmovies.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.udacity.android.popularmovies.data.MoviesRepository;
import com.udacity.android.popularmovies.model.Movie;

import java.util.List;

/**
 * View Model class for Main Activity.
 *
 */
public class MainActivityViewModel extends ViewModel {

    private static MoviesRepository mRepository;
    private LiveData<List<Movie>> mMovies;


    public MainActivityViewModel(MoviesRepository repository, String sortCriteria) {
        mRepository = repository;
        mMovies = mRepository.getLatestMovies(sortCriteria);
    }

    public void getLatestMovies(String sortCriteria) {
        mMovies = mRepository.getLatestMovies(sortCriteria);
    }

    public LiveData<List<Movie>> getMovies() {
        return mMovies;
    }
}
