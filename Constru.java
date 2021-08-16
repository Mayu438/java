import java.io.IOException;

class Constru
{
void Constru()
{
System.out.println("non parameterized constructor..");
}

void Constru(int a , int b)
{
System.out.println("parameterized constructor..");
}

public static void main(String args[])throws IOException
{
Constru ct=new Constru();
ct.Constru();
ct.Constru(10,20);
}
}