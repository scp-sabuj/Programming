package javaprojectex;

class JavaProjectex {
    public void display()
    {
        System.out.println("This is main method..");
    }
    public static void main(String[] args){
        JavaProjectex obj = new NewClass();
        obj.display();
    }

}

class NewClass extends JavaProjectex{
    public void max(){
        System.out.println("this is extends class.");
    }
}
