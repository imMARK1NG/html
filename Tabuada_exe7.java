import java.util.Scanner;
public class Tabuada_exe7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valores;
        System.out.println("INFORME QUAL TABELA DE MULT VOCÊ QUER(1 a 10):");
        valores = entrada.nextInt();
        String t1, t2, t3,t4,t5,t6,t7,t8,t9,t10;
        t1 = ("TABUDA DE 1:\n1x0=0\n1x2=2\n1x3=3\n1x4=4\n1x5=5\n1x6=6\n1x7=7\n1x8=8\n1x9=9\n1x10=10");
        t2 = ("TABUDA DE 2:\n2x0=0\n2x1=2\n2x3=6\n2x4=8\n2x5=10\n2x6=12\n2x7=14\n2x8=16\n2x9=18\n2x10=20");
        t3 = ("TABUDA DE 3:\n3x0=0\n3x1=3\n3x2=6\n3x3=9 \n3x4=12\n3x5=15\n3x6=18\n3x7=21 \n3x8=24\n3x9=27\n3x10=30");
        t4 = ("TABUDA DE 4:\n4x1=4\n4x2=8\n4x3=12\n4x4=16\n4x5=20\n4x6=24\n4x7=28\n4x8=32\n4x9=36\n4x10=40");
        t5 = ("TABUDA DE 5:\n5x0=0\n5x1=5\n5x2=10\n5x3=15\n5x4=20\n5x5=25\n5x6=30\n5x7=35\n5x8=40\n5x9=45\n5x10=50");
        t6 = ("TABUDA DE 6:\n6x1=6\n6x2=12\n6x3=18\n6x4=24\n6x5=30\n6x6=36\n6x7=42\n6x8=48\n6x9=54\n6x10=60");
        t7 = ("TABUDA DE 7:\n7x1=7\n7x2=14\n7x3=21\n7x4=28\n7x5=35\n7x6=42\n7x7=49\n7x8=56\n7x9=63\n7x10=70");
        t8 = ("TABUDA DE 8:\n8x1=8\n8x2=16\n8x3=24\n8x4=32\n8x5=40\n8x6=48\n8x7=56\n8x8=64\n8x9=72\n8x10=80");
        t9 = ("TABUDA DE 9:\n9x1=9\n9x2=18\n9x3=27\n9x4=36\n9x5=45\n9x6=54\n9x7=63\n9x8=72\n9x9=81\n9x10=90");
        t10 = ("TABUDA DE 10:\n10x1=10\n10x2=20\n10x3=30\n10x4=40\n10x5=50\n10x6=60\n10x7=70\n10x8=80\n10x9=90\n10x10=100");
        if(valores == 1){
            System.out.println(t1);
        } else if (valores == 2) {
            System.out.println(t2);
        } else if (valores == 3) {
            System.out.println(t3);
        }else if (valores == 4) {
            System.out.println(t4);
        }else if (valores == 5) {
            System.out.println(t5);
        }else if (valores == 6) {
            System.out.println(t6);
        }else if (valores == 7) {
            System.out.println(t7);
        }else if (valores == 8) {
            System.out.println(t8);
        }else if (valores == 9) {
            System.out.println(t9);
        }else if (valores == 10) {
            System.out.println(t10);
        }else if (valores >= 10) {
            System.out.println("VALOR INCORRETO.");
        }

    }
}
