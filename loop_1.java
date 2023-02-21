import java.util.Scanner;

public class loop_1 {
    public static void main(String args[]){
       for(int i=1;i<=5;i++){
            System.out.println("Hello World");
       }
        for(int i=1;i<=5;i++){
            System.out.println(i*2);
        }
        for(int line=1;line<=4;line++){
            System.out.println("****");
        }


        int sum=0;
        int i=1;
        while(i<=6){
            sum=sum+i;
            
            i++;
        }
        Scanner sc=new Scanner(System.in);
        do{
            
            int n=sc.nextInt();

            if(n%10==0);{
                break;
            }
            System.out.println(n);
            sc.close();

        
    }
}
        
        
        






        






    
    

