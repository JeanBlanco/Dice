import org.example.Dice;
import org.example.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    private Dice dice;
    private  Player player;
    @BeforeEach
    void before(){
        dice = Mockito.mock(Dice.class);
        player = new Player(dice, 4);
    }
   @Test
   void  playerWins(){
       Mockito.when(dice.roll()).thenReturn(5);
       assertTrue(player.play());
   }

   @Test
   void playerLoses() {
       Mockito.when(dice.roll()).thenReturn(3);
       assertFalse(player.play());
   }
}
