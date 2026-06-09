import java.util.Scanner;
public class MobileDataplanBilling {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double[]usage=new double[10];
for(int i=0;i<10;i++)usage[i]=sc.nextDouble();
double totalRevenue=0;
for(int i=0;i<10;i++){
double rate;String plan;
if(usage[i]<5){rate=100;plan="Basic";}
else if(usage[i]<=20){rate=80;plan="Standard";}
else{rate=60;plan="Premium";}
double bill=usage[i]*rate;
System.out.println("Customer "+(i+1)+" Usage:"+usage[i]+"GB Bill:"+bill+" Plan:"+plan);
totalRevenue+=bill;
}
System.out.println(totalRevenue);
sc.close();
}
}
