// WIP

public class MyClass {
    private int var1;
    private double var2;
    private String var3;
    private static int count = 0;

    public MyClass(int var1, double var2, String var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

