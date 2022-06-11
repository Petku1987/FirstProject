public class LiteralsDemo {
    public static void main(String[] args) {

        boolean isActive = false;
        boolean isAlive = true;

        byte a = 3;
        byte b = -127;

        short c = 3276;
        short d = -32767;

        int e = 2_147_483_64;
        int f = -2_147_483_64;

        long g = 9_223_327_036_854_775_808L;
        long h = -9_223_327_036_854_775_807L;

        double x = 8.5;
        double y = -2.7;

        float z = 8.5f;
        float q = -2.7f;

        char ch = 65535;
        char ch1 = '\t';

        String hello = "Hello name: \\ user \\ ";
        System.out.println(hello);

        String helloWorld = "Hello world\tHello man";
        System.out.println(helloWorld);


    }
}
