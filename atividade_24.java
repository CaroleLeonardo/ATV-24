import java.util.Scanner;

public class atividade_24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, i, n1;
        System.out.println("Informe a quantidade de repeticoes: ");
        n=read.nextInt();
        for (i = 1;i <= n;i++){
            System.out.println("Informe um numero");
            n1=read.hasnextint();
            if (n1>0){
                System.out.println("O numero "+n1+" e positivo");
            }else if (n1==0){
                System.out.println("Voce digitou zero");
            }else{
                System.out.println("O numero "+n1+" é negativo");
            }
        }
        System.out.println();
    }
}