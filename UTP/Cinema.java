import java.lang.reflect.Array;

public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema (String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
    }
    private void init () {
    }
    public boolean registerUser (User user) {
        return registerUser(user);
    }
    public void authenticateUser (String email, String password) {
        
    }
    public void displayListStudio () {

    }
    public void displayStudioDetail (int studioNumber) {

    }
    public boolean addSTudioWithMovies (String Type, String movieTitle, double movieRating, String movieGenres) {
        return addSTudioWithMovies(Type, movieTitle, movieRating, movieGenres);
    }
    public boolean bookTicket (User user, int studioNumber, char row, int col) {
        return bookTicket(user, studioNumber, row, col);
    }
    public String getName() {
        return name;
}   
}
