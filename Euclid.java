public class Euclid{
public static int euc(int x,int y)
{
int temp;
if(x==0 || y==0)
{
return 1;
}
if(x<y)
{
temp=x;
x=y;
y=temp;
}
if (x % y==0){
return y;
}
else {
return euc(y,x%y);
}
}
public static void main(String[] args)
{
System.out.println(euc(48,24));
}
}
