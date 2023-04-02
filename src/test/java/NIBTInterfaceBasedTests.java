import org.example.NotInBothTeamsClass;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.junit.Assert.*;

public class NIBTInterfaceBasedTests {
    NotInBothTeamsClass notInBothTeamsClass = new NotInBothTeamsClass();

    @BeforeEach
    public void setUp()
    {
        notInBothTeamsClass= new NotInBothTeamsClass();
    }
    //Base case FFFF
    @Test
    public void testBothNotEmptyNotNull()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> team2 = new HashSet<>(Arrays.asList("3","4"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","2","3","4"));
        assertEquals(result,expected);
    }
    //FFTF
    @Test
    public void testTeam1Empty()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList());
        Set<String> team2 = new HashSet<>(Arrays.asList("3","4"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("3","4"));
        assertEquals(result,expected);
    }
    //FFFT
    @Test
    public void testTeam2Empty()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> team2 = new HashSet<>(Arrays.asList());
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","2"));
        assertEquals(result,expected);
    }

}
