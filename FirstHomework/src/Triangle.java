import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("�������һ���߳���");
        a=input.nextInt();
        System.out.print("������ڶ����߳���");
        b=input.nextInt();
        System.out.print("������������߳���");
        c=input.nextInt();
        input.close();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("����һ��������");
        }
        else{
            System.out.println("�ⲻ�������Σ�����������");
        }
    }
}
