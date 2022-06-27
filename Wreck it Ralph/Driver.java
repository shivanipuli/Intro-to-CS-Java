   import javax.swing.JFrame;
    public class Driver
   {
       public static void main(String[] args) throws Exception
      { 
         JFrame frame = new JFrame("Wreck it Ralph");
         frame.setSize(350, 500);
         frame.setLocation(400, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new GamePanel());
         frame.setVisible(true);
      }
   }