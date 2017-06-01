/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rucsac;

import java.util.Scanner;

/**
 *
 * @author Iolanda
 */

public class Vector {
    public int []v;
    public int n,g;
    public int []w;
    public int []p;
    Vector()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("n=");
        n=sc.nextInt();
        System.out.println("g=");
        g=sc.nextInt();
        v=new int [100];
        w=new int [100];
        p=new int [100];
        for(int i=1;i<=n;i++)
        {
            System.out.printf("Greuatatea si valoarea obiectului %d este: ", i);
            w[i]=sc.nextInt();
            p[i]=sc.nextInt();
        }
    }
        public int maxi(int a,int b)
        {
            if(a>b)
                return a;
            else
                return b;
        }
        public int rucsac()
        {
            int i,j;
            for(i=1;i<=n;i++)
                for(j=g;j>=w[i];j--) //cand se repeta for de la 0 la g-w[i]
                    v[j]=maxi(v[j],v[j-w[i]]+p[i]);
            return v[g];
        }
    
    
}
