public class ColorDemo {
  public static final String CLEAR_SCREEN = "\u001b[2J";
  public static final String HIDE_CURSOR = "\u001b[?25l";
  public static final String SHOW_CURSOR = "\u001b[?25h";
  public static final String RESET = "\u001b[0m";

  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int BLUE = 34;
  
  public static void main(String[] args) {
    
    
    System.out.print("\u001b[33mYellow");
    System.out.print("\u001b[35mMagenta");
    for(int r = 0; r < 256; r+=32) {
      for(int g = 0; g <= 256; g+=32) {
        for(int b = 0; b <= 256; b+=32) {
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }
    System.out.print("\u001b[0m");
    System.out.print("\u001b[31mRed");
    System.out.print(" \u001b[0mfish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" \u001b[0mfish ");
    System.out.print("\u001b[0m");
  }
}
