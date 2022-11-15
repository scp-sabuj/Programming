package pkgfinal.variable;

public class FinalVariable {
    final int speedlimit=50;
    
    void run(){
        System.out.println("Speed Limit="+speedlimit);
    }
     
    public static void main(String[] args) {
        
        FinalVariable s = new FinalVariable();
        s.run();
    }
    
}
