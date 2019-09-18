import java.util.Scanner;
class Polynomial{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int deg1,deg2,pol1[],pol2[],pro[],deg[],c;
        System.out.println("enter degree of pol 1 & 2");
        deg1=sc.nextInt();
        deg2=sc.nextInt();
        pol1=new int[deg1+1];
        pol2=new int[deg2+1];
        pro=new int[(deg1+1)*(deg2+1)];
        deg=new int[(deg1+1)*(deg2+1)];
        System.out.println("enter polynomial 1 coeffs in acending order of degree");
        for(int i=0;i<=deg1;i++) {
            pol1[i]=sc.nextInt();
        }
        System.out.println("enter polynomial 2 coeffs in acending order of degree");
        for(int i=0;i<=deg2;i++) {
            pol2[i]=sc.nextInt();
        }
        c=0;
        for (int i = 0; i <= deg1; i++) {
            for (int j = 0; j <= deg2; j++,c++) {
                pro[c]=pol1[i]*pol2[j];
                deg[c]=i+j;
            }
        }
        int limit=(deg1+1)*(deg2+1);
        int sum;
        for (int i = deg1+deg2; i <= 0; i--) {
            sum=0;
            for (int j = 0; j < limit; j++) {
                if (deg[j]==i)
                    sum+=pro[j];
            }
            System.out.print(sum+"x^"+i+"+");
        }
    }
}