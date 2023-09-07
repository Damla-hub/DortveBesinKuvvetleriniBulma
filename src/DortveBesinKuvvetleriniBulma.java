import java.util.Scanner;
public class DortveBesinKuvvetleriniBulma {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır saysıını giriniz:");
        number=input.nextInt();
        for(int i=1,j=1; i<=number && j<=number ;i*=4, j*=5 ){
            System.out.println("4'ün kuvveti ="+i+"\n5'in kuvveti ="+j);
        }
    }
}
