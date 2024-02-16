package in.nileshit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Serializable> {

}
