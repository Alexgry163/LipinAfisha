import org.example.MoviesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void FindFilms() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShowFilms() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Bladshot");
        manager.addMovie("Forward");
        manager.addMovie("Hotel Belgrad");
        manager.addMovie("Gentlemens");
        String[] expected = {"Bladshot", "Forward", "Hotel Belgrad", "Gentlemens"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShowFilmsConversely() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Bladshot");
        manager.addMovie("Forward");
        manager.addMovie("Hotel Belgrad");
        manager.addMovie("Gentlemens");
        String[] expected = {"Gentlemens", "Hotel Belgrad", "Forward", "Bladshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShowFilmsOverLimit() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Bladshot");
        manager.addMovie("Forward");
        manager.addMovie("Hotel Belgrad");
        manager.addMovie("Gentlemens");
        manager.addMovie("Invisible Man");
        manager.addMovie("Trolls");
        String[] expected = {"Trolls", "Invisible Man", "Gentlemens", "Hotel Belgrad", "Forward"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
