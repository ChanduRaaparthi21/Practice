//program to demonstrate instanceof in java
class Ex
{
    int p=10;
}


class instanceofex
{
    public static void main(String arr[])
    {
        String str = "telugu web guru";
        
        if(str instanceof String)
        System.out.println("yes");
        else 
        System.out.println("no");

        Ex ob = new Ex();

        if(ob instanceof Ex)
        System.out.println("p value is :"+ob.p);

        else 
        System.out.println("access not allowed");
    }
}