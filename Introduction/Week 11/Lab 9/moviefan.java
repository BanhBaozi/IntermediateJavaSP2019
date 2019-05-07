package moviefan;

public class FavoritesManager {


    String sFaveMovie;
    String sFaveActor;

    public boolean checkFavoriteMovie(String sFaveMovie) {
        if (sFaveMovie.equals("favoritemovie")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFavoriteActor(String sFaveActor) {
        if (sFaveActor.equals("favoriteactor")) {
            return true;
        } else {
            return false;
        }
    }
}
