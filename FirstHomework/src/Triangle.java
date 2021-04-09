import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入第一条边长：");
        a=input.nextInt();
        System.out.print("请输入第二条边长：");
        b=input.nextInt();
        System.out.print("请输入第三条边长：");
        c=input.nextInt();
        input.close();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("这是一个三角形");
        }
        else{
            System.out.println("这不是三角形，请重新输入");
        }
    }
}
