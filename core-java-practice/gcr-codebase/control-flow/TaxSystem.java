import java.util.Scanner;
public record TaxSystem(){
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.print("Enter the Amounts: ");
double[]income=new double[10];
for(int i=0;i<10;i++)income[i]=sc.nextDouble();
double totalTax=0;
for(int i=0;i<10;i++){
double rate;String bracket;
if(income[i]<10000){rate=0.05;bracket="5%";}
else if(income[i]<=50000){rate=0.15;bracket="15%";}
else{rate=0.30;bracket="30%";}
double tax=income[i]*rate;
System.out.println("Citizen "+(i+1)+" Amount:"+income[i]+" Tax:"+tax+" Bracket:"+bracket);
totalTax+=tax;
}
System.out.println("Total tax : " + totalTax);
sc.close();
}
}