import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Panel extends JPanel
{
private GamePanel panel;
private Scoreboard scores;
public Panel() throws Exception
{
setLayout(new BorderLayout());

panel = new GamePanel();
add(panel, BorderLayout.CENTER);

scores = new Scoreboard();
add(scores,BorderLayout.NORTH);

scores.setScoreFelix(
}
}