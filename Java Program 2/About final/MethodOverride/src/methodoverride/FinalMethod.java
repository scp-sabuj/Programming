package methodoverride;

public class FinalMethod {
    
    int Speedlimit=40;

    final void run(){
        System.out.println("Speed of Bike ="+Speedlimit);
    }
    
}
class Ex extends FinalMethod{
    
    void run(){
        System.out.println("Speed of Bike1 ="+Speedlimit);
    }
    
    public static void main(String[] args) {
        FinalMethod obj1 = new Ex();
        obj1.run();
        
    }
    
}

