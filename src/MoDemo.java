public class MoDemo {
    public static void main(String[] args) {
//        int iresult, irem;
//        double dresult, drem;
//
//        iresult = 10 / 3;
//        irem = 10 % 3;
//
//        dresult = 10.0 / 3.0;
//        drem = 10.0 % 3.0;
//
//        System.out.println("Rezultate si ostatok ot delenia 10 / 3: " + iresult + " " + irem);
//        System.out.println("Rezultate si ostatok ot delenia 10.0 / 3.0: " + dresult + " " + drem);

        int x = 0, y = 0;
        System.out.println("initialy x was " +x);
        x = x + 1;
        System.out.println("after x = x + 1 x=" + x);
        x++;
        System.out.println("after x++ x=" + x);
        x+=1;
        System.out.println("after x+=1 x=" + x);

        System.out.println("initialy y was " +y);
        y = y - 1;
        System.out.println("after y = y - 1 y=" + y);
        y--;
        System.out.println("after y-- y=" + y);
        y-=1;
        System.out.println("after y-=1 y=" + y);

        int x1 = 10;
        int y1 = x1++;
        System.out.println("y1=" +y1);
        System.out.println("x1=" +x1);
    }
}
