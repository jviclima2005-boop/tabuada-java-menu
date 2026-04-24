import java.util.Scanner;

public class Ex03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int opcao = 1;
        while(opcao != 0){
            System.out.println("===MENU===");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
        if(opcao == 1){
            System.out.println("Digite o número que vamos usar para gerar a tabuada: ");
            int num = sc.nextInt();
            
            for(int i =1; i <= 10 ;i++){
                System.out.println("Vamos fazer a tabuada do "+ num + ": "+ num + " X " + i + " = " + (num*i));
            }
        }else{
            System.out.println("Inválido");
        }
    }
    }
}