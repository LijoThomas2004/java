import java.util.Scanner;
public class multimatrix {
    public static void main(String[] args) {
    int i,j,r1,r2,k,c1,c2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows of matrix A");
    r1=sc.nextInt();
    System.out.println("Enter the number of coloumns of matrix A");
    c1=sc.nextInt();
    System.out.println("Enter the number of rows of matrix B");
    r2=sc.nextInt();
    System.out.println("Enter the number of coloumns of matrix B");
    c2=sc.nextInt();
    if(c1!=r2){
        System.out.println("Matrix multiplication is not possible c1!=r2");
        sc.close();
        return;
    }
    int A[][]=new int[r1][c1];   
    int B[][]=new int[r2][c2];
    int C[][]=new int[r1][c2];  
    System.out.println("Read matrix A");
    for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            System.out.println("A["+i+"]["+j+"]=");
            A[i][j]=sc.nextInt();
        }
    }
    System.out.println("Read matrix B");
    for(i=0;i<r2;i++){
        for(j=0;j<c2;j++){
            System.out.println("B["+i+"]["+j+"]=");
            B[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            C[i][j]=0;
            for(k=0;k<c1;k++){
                C[i][j]+=A[i][k]*B[k][j];
            }
        }
    }
    System.out.println("\nMatrix A");
    for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            System.out.print(A[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("\nMatrix B");
    for(i=0;i<r2;i++){
        for(j=0;j<c2;j++){
            System.out.print(B[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("\nProduct Matrix C");
    for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            System.out.print(C[i][j]+"\t");
        }
        System.out.println();
    }
}
}

        


