package p3;
class Even
{
    void displayeven(int a)
    {
        if( a%2==0)
        {
            System.out.println(" the given number is even :"+ a);
        }
        else
            System.out.println(" no is odd");
       
    }
}
public class test4 {
    public static void main(String[] args) {
        Even even =new Even();
        even.displayeven(32);

    }
}
