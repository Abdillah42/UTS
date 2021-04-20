package UTS_2A;
import java.util.Scanner;
public class nomor2 {
public static void main (String [] args){
    int i,j,m,n;
    int matriks [][] = new int [10][10];    
    int transpose[][] = new int [10][10];
    Scanner scan =new Scanner(System.in);
    
    System.out.print("masukan jumlah baris matriks B: ");
    m=scan.nextInt();
    System.out.print("Masukan jumlah kolom matriks B: ");
    n=scan.nextInt();
    System.out.println("Masukan elemen matriks B :");
    for(i=0;i<m;i++){
        for(j=0;j<n; j++){
            matriks[i][j]= scan.nextInt();
        }
    }
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            transpose[j][i]=matriks[i][j];
        }
        System.out.println("Hasil transpose matriks A :");
        for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            System.out.print(transpose[i][j]+"\t");
        }
        }
    }
}
}

     

    

