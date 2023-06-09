package dantruong.dev.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//data base ascces
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
  

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
