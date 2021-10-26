public class MovieManager {

    private int maxLatestMoviesCount = 10;
    private Movie[] movies = new Movie[0];


    public MovieManager() {
    }

    public MovieManager(int maxLatestMoviesCount) {
        this.maxLatestMoviesCount = maxLatestMoviesCount;
    }


    public Movie[] getMovies() {
        return movies;
    }


    public void addMovie(Movie item) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }


    public Movie[] getLatestMovies() {
        int count = movies.length < maxLatestMoviesCount ? movies.length : maxLatestMoviesCount;
        Movie[] result = new Movie[count];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }


}
