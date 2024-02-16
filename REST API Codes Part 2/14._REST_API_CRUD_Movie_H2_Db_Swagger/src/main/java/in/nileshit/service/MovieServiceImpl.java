package in.nileshit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nileshit.entity.Movie;
import in.nileshit.repo.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	private MovieRepository repository;

	
	public MovieServiceImpl(MovieRepository repository) {

		this.repository = repository;
	}

	@Override
	public String upsertMovie(Movie movie) {
		Integer movieId = movie.getMovieId();
		repository.save(movie);
		if (movieId == null) {
			return "Movie added";
		} else {
			return "Movie updated";
		}

	}

	@Override
	public String removeMovie(Integer movieId) {

		repository.deleteById(movieId);

		return "Movie Removed";
	}

	@Override
	public List<Movie> getallMovies() {
		List<Movie> all = repository.findAll();
		return all;
	}

}
