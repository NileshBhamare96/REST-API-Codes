package in.nileshit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nileshit.entity.Movie;
import in.nileshit.service.MovieService;

@RestController
public class MovieRestController {

	

	@Autowired
	private MovieService service;

	// public String upsertMovie(Movie movie)

	@PostMapping("/movie")
	public ResponseEntity<String> upsertMovie(@RequestBody Movie movie) {
		String msg = service.upsertMovie(movie);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@PutMapping("/movie")
	public ResponseEntity<String> updateMovie(@RequestBody Movie movie) {
		String msg = service.upsertMovie(movie);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	// public String removeMovie(Integer movieId)
	@DeleteMapping("/movie/{movieId}")
	public ResponseEntity<String> removeMovie( @PathVariable Integer movieId) {
		String msg = service.removeMovie(movieId);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
    
	// public List<Movie> getallMovies()
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllMovies() {
		List<Movie> allMovies = service.getallMovies();
		return new ResponseEntity<>(allMovies, HttpStatus.OK);
	}
}
