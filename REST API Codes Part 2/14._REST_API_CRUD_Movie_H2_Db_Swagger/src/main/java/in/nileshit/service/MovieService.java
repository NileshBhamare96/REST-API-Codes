package in.nileshit.service;

import java.util.List;

import in.nileshit.entity.Movie;
import in.nileshit.repo.MovieRepository;

public interface MovieService {
	
	 public String upsertMovie(Movie movie);
	 public String removeMovie(Integer movieId);
	 public List<Movie> getallMovies();

}
