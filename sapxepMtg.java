import java.util.Scanner;
import java.util.Random;
 public class Hamsinhmang{ 
     public static Scanner scanner = new Scanner(System.in);  
     public static void nhap() {   
         // TODO Auto-generated method stub   
           System.out.print("Nhập số phần tử của mảng: ");   
             int n = scanner.nextInt();   
               // khởi tạo mảng arr   
                 int[] arr = new int[n];   
                 
              for (int i = 0; i < n; i++) {      
             
              Random rand = new Random(); 
              arr[i]= rand.nextInt(100)+1;
              
               }
                  System.out.print("Các phần tử của mảng: ");     
                   show(arr);
                   ht(arr);
                   sxt(arr);
                   sxg(arr);
                     } 
                  public static void show(int[] arr) {    
              for (int i = 0; i < arr.length; i++) {   
               System.out.print(arr[i] + " ");   
                              }    }   
              public static void ht(int[] arr)

    {

        System.out.println("Nhập vào số lương phần tử của mảng:");    
        int num = scanner.nextInt();
        int[] array = new int[num];
        int counter;
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (counter = 0; counter < num; counter++)
            {int k = counter+1;
              System.out.println("phần tử thứ:" + k);
              array[counter] = scanner.nextInt();}            
System.out.println("mang vua nhap");
for (counter = 0; counter < num; counter++)
            {
              System.out.println(array[counter]);
              }                
    }
    
    public static void sxt(int[] arr)

    {

        System.out.println("Nhập vào số lương phần tử của mảng:");    
        int num = scanner.nextInt();
        int[] array = new int[num];
        int counter;
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (counter = 0; counter < num; counter++)
            {int k = counter+1;
              System.out.println("phần tử thứ:" + k);
              array[counter] = scanner.nextInt();}            
     System.out.println("mang vua nhap");
     for (counter = 0; counter < num; counter++)
            {
              System.out.println(array[counter]);
              }   
                        
       for (int i = 0; i < num; i++) { 
            for (int j = i + 1; j < num; j++) { 
          if (array[i] > array[j]) {   
             // If arr[i] > arr[j], swap the value of
             // arr[i] and arr[j]   
              int temp = array[i];   
               array[i] = array[j];    
               array[j] = temp;    }    }    }

          System.out.println("mang sap xep tang dan:");
     for (counter = 0; counter < num; counter++)
            {
              System.out.println(array[counter]);
              }      
    }
    
    public static void sxg(int[] arr)

    {

        System.out.println("Nhập vào số lương phần tử của mảng:");    
        int num = scanner.nextInt();
        int[] array = new int[num];
        int counter;
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (counter = 0; counter < num; counter++)
            {int k = counter+1;
              System.out.println("phần tử thứ:" + k);
              array[counter] = scanner.nextInt();}            
     System.out.println("mang vua nhap");
     for (counter = 0; counter < num; counter++)
            {
              System.out.println(array[counter]);
              }   
                        
       for (int i = 0; i < num; i++) { 
            for (int j = i + 1; j < num; j++) { 
          if (array[i] < array[j]) {   
             // If arr[i] > arr[j], swap the value of
             // arr[i] and arr[j]   
              int temp = array[j];   
               array[j] = array[i];    
               array[i] = temp;    }    }    }

          System.out.println("mang sap xep giam dan:");
     for (counter = 0; counter < num; counter++)
            {
              System.out.println(array[counter]);
              }      
    }
    
    
                  public static void main(String[] args) {  
                     nhap();
                     
                         }}
