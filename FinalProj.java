// Dummy class for FinalProject
// Outputs a simple message when implementing begin()
//ASCII art from https://www.asciiart.eu/

public class Lopez implements FinalProject {
  public Lopez() {

  }

  public void begin() {
    
    String Input, Input2;
    System.out.println("Welcome to the garden simulator");
    System.out.println("Do you want butterflies?");
    Input = Itse2417Main.myScan.next();
    System.out.println("What about flowers?");
    Input2 = Itse2417Main.myScan.next();
    
    try {
      System.out.println("""
        \t      . ' .
        \t        o
        \t      .   .\n""");

      if (Input.equalsIgnoreCase("yes") || Input.equalsIgnoreCase("y")) {
        butterfly();
      }
      else if (Input.equalsIgnoreCase("no") ||       Input.equalsIgnoreCase("n"))
      {System.out.println("/n/n/n/n");}

      if (Input2.equalsIgnoreCase("yes") || Input2.equalsIgnoreCase("y")) {
        flowers();
      }
      else if (Input2.equalsIgnoreCase("no") || Input2.equalsIgnoreCase("n"))
      {  grass();
      }
      grass();
      java.util.concurrent.TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
    }

  }

  public static void butterfly() {
    System.out.println("""
        (\\o/)\t\t \t(\\o/)\t
        (/|\\)\t\t\t(/|\\)\t\t

        \t(\\o/)
        \t(/|\\)  """);
  };

  public static void flowers(){
      System.out.println("""
                        \t        _(_)_                         
                         @@@@        (_)@(_)   vVVVv      _    
                        @@()@@  wWWWw  (_)\\    (___)    _(_)_  
                         @@@@   (___)     `|/    Y     (_)@(_) 
                          /       Y       \\|    \\|/     /(_) 
                        \\ |     \\ |/       | / \\ | /  \\|/  
                        \\\\|//   \\\\|///  \\\\\\|//\\\\\\|/// \\|/// 
                       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^""");
  };
  public static void grass(){
System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
};
}
