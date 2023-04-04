import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class javaLesson1 {
    //метод main
    public static void main(String[] args) { //оголошення нового метода

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter value: "); //вивід строки на консоль
//        String text = in.nextLine();
//        System.out.print("Enter int: ");
//        int a = in.nextInt();
//        System.out.printf("%s %d",text,a);
//        in.close();

//        int c = 8;
//        int b = ++c;
//        int d = b + c + ++c;
//        System.out.println(c);  // 9
//        System.out.println(b);
//        System.out.println(d);
        int i = 10;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n>0 && n<100);
//        while (n>-5)  {
//            System.out.println(n);
//            n--;
//        }
        for (i=0;i<15;i++) {
            if (i == 10)
                continue;
            System.out.println(i);
        }
    } //кінець оголошення нового метода
}
