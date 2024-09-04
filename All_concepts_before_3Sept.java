// 1]Learn how to print any statement 
/*public class tabish {   // Yaha par class ka naam wohi dena jo file ka diye hoo
    public static void main(String args[]) { //ye line compulsory as it is hai
        System.out.println("My name is Tabish"); //syso type karke enter press karne pe bhi System.out.println ajayga
    }
}
*/


// 2] Learn datatypes
/*public class tabish{
    public static void main(String[] args) {
        int a = 5;
        float b = 9;
        String c = "Tabish";
        System.out.println(a*b);
        System.err.println(c);
    }
}
*/


// 3] Learing to take input (input lene ke liye 'java.util.*' ko import karna padta hai)
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// I/O operation ke liye ye line jaruri hai
        // different datatypes ka input lene ke liye:
        // sc.nextint() integer input lene ke liye
        // sc.nextfloat() float input lene ke liye
        // sc.nextLine() string input lene ke liye
        String a = sc.nextLine();
        System.out.println("The value of a is: "+a);
        int b = sc.nextInt();
        System.out.println("The value of b is:"+b);
        sc.close();
    }
    
}*/


// 4] Learn Conditional Statements      //Two types 1.If else, 2.Switch
/* import java.util.*;
public class tabish {
public static void main(String[] args) { //if else
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = sc.nextInt();
    System.out.println("Enter the value of B: ");
    int b = sc.nextInt();            
    if (a<b) {
        System.out.println("A is smaller");
    } else if(b<a){
        System.out.println("B is smaller");
    } else{
        System.out.println("A is equal to B");
    }
    // Switch [isko run karne ke liye upar if else wale ko comment out karein]
    System.out.println("Enter alphabet between a to d");
    String x = sc.nextLine();
    switch (x) {
        case "a":
            System.out.println("its is first alphabet");
            break;
        case "b":
            System.out.println("It is second alphabet");
            break;
        case "c":
            System.out.println("It is third alphabet");
            break;
        case "d":
            System.out.println("It is fourth alphabet");
            break;
        default:
            System.out.println("You didnt entered a to d");
            break;
    } } } */


// 5] Learn Loops       3 loops hote hai 1.For loop, 2.While loop, 3.do-while loop
//for loop
/*class tabish{
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println(i);
            System.out.println("My name is Tabish");
        }
    }
}  */
//while loop
/**
 * tabish
 */
/*public class tabish {
    public static void main(String[] args) {
        int x = 0;
        while (x<=20) {
            System.out.print("Tabish is not a Good Coder");
            x++;
        } } }*/
// do while loop
/*public class tabish {
    public static void main(String[] args) {
        int x = 0;
        do { 
            System.out.println(x);
            System.out.println("First 'do' will work what we tell to do it, the it will check 'while' condition");
            x=x+1;
        } while (x<=9); 
    } }*/
// Lets solve some questions
//Q1: Print the sum of first n numbers i.e. 1+2+3+4 using loops
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        for (int i=0;i<=x;i++){
            sum=sum+i; 
        }
         System.out.println(sum);
    } }*/
//Q2 Print table of users given number
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(x + "x" + i + "=" + i*x);
        } } }*/
//Q3 Print patterns [Square,rectangle]
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        for(int i = 1; i<=row; i++){
        for(int j = 1; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        } } }*/
// print patterns [triangle-upside+downside]
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i=1;i<=row;i++){   //inverted triangle ke liye i=row;i>=1;i-- kardo
            for(int j=1;j<=i;j++){      //inverted number triangle ke liye j-i+1 
                System.out.print("*");      //Numbers wale triangle ke liye '*' ki jagah 'j' likhdo 
            }
            System.out.println();
        } } }*/
//Print patterns [Hollow square,rectangle]
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || j==1 || i==row || j==cols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } } } */
//print patterns [right side triangle]
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int x=1;x<=i;x++){
                System.out.print("*");
            }
        System.out.println();
        } } }*/
// 10 Exercise Question
//Q1 Take 3 inputs from user and print their average.
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: "); int a = sc.nextInt();
        System.out.println("Enter second no: "); int b = sc.nextInt();
        System.out.println("Enter third no: "); int c = sc.nextInt();
        int result = a + b + c / 3;
        System.out.println("The Average of numbers is: "+result);
    }
};
*/
//Q2 write a program to find sum of odd n numbers
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:"); int a = sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            if(i%2!=0){
               sum=sum+i; 
            }
        }
        System.out.println(sum);
    } }*/
//Q3 write a program to take inputs till the users want, and then display the count of positive, negative and zero
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers, enter alphabets to stop:");
        int pos=0; int neg=0; int zer=0;
        int num;
        while(sc.hasNextInt()){    //hasnextint() true return karta hai jab tk input me integers value hai, yaha while loop tab tk run hoga jb tk input me integer diya jara hai
            num = sc.nextInt();
            if(num>0){ pos++; }
            else if(num<0){ neg++; }
            else{ zer++; }
        }
        System.out.println("The no. of positive int are: "+pos);
        System.out.println("The no. of negative int are: "+neg);
        System.out.println("The no. of zero are: "+zer);

    } }*/
//Q4 write a program to take two numbers as base and exponential and print their answer
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:"); int a = sc.nextInt();
        System.out.println("Enter the power:"); int x = sc.nextInt();
        int result=1;
        for(int i=0;i<x;i++){
            result=result*a;
        } 
        System.out.print("The answer is:\n"+result); 
} }*/
//Q5 write a program that finds greatest common divisor of two numbers.
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        System.out.println("The GCD is: "+a);
    } }*/


//Arrays 
//Arrays ko 2 tariqo se likha ja skta hai 1. type arrayname[]=new type[size] values insert karne ke liye arrayname[index]=value
// 2. type arrayname[]={values}
/*public class tabish {
    public static void main(String[] args) {
        int array[]= new int[3]; //method 1
        array[0]=47;
        array[1]=32;
        array[2]=98;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]); //syso 3 baar na likhna pade isliye for loop use kiya
        }
        int array2[]={47,32,98}; //method 2
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        } } }*/
//Q. Take an array from user and find the index number of element which user tell
/*import  java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int a = sc.nextInt();
        int array[]= new int[a];
        System.out.println("Now Enter the elements:");
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Now enter the element you want to find: ");
        int x = sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                System.out.println("The Common element is at index: "+i);
            } } } } */
// 2D Arrays (ye array me rows and columns hote hai jaise matrix ke form me)
// type arrayname[][]=new type[row ki size][column ki size]
/*public class tabish {
    public static void main(String[] args) {
        int arr[][]= new int[2][3];  //row ki size 3 or column ki 4
        arr[0][0]=87;
        arr[0][1]=54;
        arr[0][2]=78;
        arr[1][0]=45;
        arr[1][1]=69;
        arr[1][2]=44;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } } }*/
//Q Take an 2D array from user and find the index number of element which user tell
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of row: ");
        int row = sc.nextInt();
        System.out.println("Enter lenght of column: ");
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
             }
        System.out.println();
        }
        System.out.println("Enter the number");
        int z = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==z){
                    System.out.println("The index number is: "+i+","+j);
                } } } } } */
//Strings Operations
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Length find karna [.lenght() ka use karke]
        // System.out.println("Enter ur first name:");
        // String fname = sc.nextLine();
        // System.out.println("Enter ur last name:");
        // String lname = sc.nextLine();
        // String result = fname+lname;
        // System.out.println("The lenght of ur name is: "+result.length());

        // 2. Specific character ko return karta hai string ke [.charat()  ka use karke]
        // System.out.println("Enter ur full name: ");
        // String fulname = sc.nextLine();
        // System.out.println("Now Enter the index number: ");
        // var z = sc.nextInt(); 
        // var result = fulname.charAt(z);   //.setcharat() ka use karke specific index wale letter ko change kiya jaa skta hai or .insert se existing string me kuch bhi add karsKe hI .delete vice versa karta hai
        // System.out.println("The letter at index"+z+" is "+result);

        // 3. two strings ko compare karna [.compareto() ka use karke]
        // consider humare pas 2 strings hai s1 and s2
        // agar s1 > s2 to .compareto() positive return karega
        // agar s1 < s2 se to negative return karega
        // agar s1 == s2 to zero return karega
        // ye strings ko lenght me nahi alphabetical order me compare karta hai
        // System.out.println("Enter first sentence:");
        // String s1 = sc.nextLine();
        // System.out.println("Enter second sentence:");
        // String s2 = sc.nextLine();
        // if(s1.compareTo(s2) == 0){
        //     System.out.println("The Strings are equal");
        // } else if(s1.compareTo(s2) > 0){
        //     System.out.println("String 1 is greater");
        // } else if(s1.compareTo(s2) < 0){ 
        //     System.out.println("String 2 is greater");
        // } 
} }*/
// Q Write a program that takes string input from user and prints its reverse order
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String a = sc.nextLine();
        StringBuilder z = new StringBuilder(a); //string ke operations karne ke liye ye line jaruri hai
        for(int i=0;i<a.length()/2;i++){
            int x  = i;
            int y = a.length()-1-i;
            char fchar = z.charAt(x);
            char lchar = z.charAt(y);
            z.setCharAt(x, lchar);
            z.setCharAt(y, fchar);
        }
        System.out.println(z);
    } }*/
// Bit manipulation
/*public class tabish {
    public static void main(String[] args) {
        int a = 7;  //0111
        int position = 3; //0010
        int z = 1<<position;  // 0100
        if((a&z)==0){
            System.out.println("The bit is 0");
        } else{
            System.out.println("The bit is one");
        } } }*/

// Sorting in java
// arrays sort karna assending me ya dessending me. 3 Types ke sorting hoti hai [bubble sort] , [selection sort] , [insertion sort]

/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take array from user
         System.out.println("Enter the lenght of array");
         int a = sc.nextInt();
         int arr[] = new int[a];
         System.out.println("Now enter the elements");
         for(int i=0;i<arr.length;i++) {
             arr[i] = sc.nextInt(); }
         System.out.print("The sorted array is:  ");
         // 1.Bubble sort------------------------------
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //         int temp=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //     } } }
        // // print the sorted array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" "); }
        // 2. Selection method------------------------------
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[smallest]>arr[j]){
        //             smallest = j;
        //         }
        //     }
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }
        //print the sorted array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // 3. Insertion Sort------------------------------
        // for(int i=1;i<arr.length;i++){
        //     int curent = i;
        //     int j = i-1;
        //     while(j>=0 && curent < arr[j]){
        //          arr[j+1]=arr[j];
        //          j--;
        //     }
        //     arr[j+1]=curent;
        // }
        //print the sorted array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");}
     } } */
//Recursion :D
//joo function apne aap ko hi call kare koi bhi action perform karne ke liye 
//ek hi class me multiple functions create krna hai
/*public class tabish {
    public static void main(String[] args) {
        int n = 5;
        printnum(n);
        System.out.println();
        // int z = 10;
        // printnum(z);
    }
    public static void printnum(int n) {
        if(n==0){
            return; //jb n ki value zero tk pahuchegi to return ki wajah se ye function ruk jayga 
        }
        System.out.println(n);
        printnum(n-1); //yaha hum function ke andar reh kr hi same function ko call kare hai
    } }*/
// Q print sum of n natural number
/*import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int x = sc.nextInt();
        sumn(1,x,0);
    }
    public static void sumn(int n,int x,int sum) {
        if(n==x){
            sum+=n; //10+5=15
            System.out.println(sum);
            return;
        }
        sum+=n; //1/3/6/10
        sumn(n+1,x,sum); //2/3/4/5
    } } */ 
//  Q print the factorial of a number
/*import  java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        fact(x, 1);
    }
    public static void fact(int x, int z){
        if(x<=1){
            System.out.println("The factorial is: "+z);
            return;
        }
        z = z*x; //5/20/60/120
        fact(x-1,z);
    } 
}*/
// Q. Build tower of hanoi using recursion
/*public class tabish {
    public static void tower(int a, String src, String help, String dest){
        if(a==1){
            System.out.println("Disk "+a+" is transfered from "+src+" to "+dest);
            return;
        }
        tower(a-1, src, dest, help);
        System.out.println("Disk "+a+" is transfered from "+src+" to "+dest);
        tower(a-1,help,src,dest);
    }
    public static void main(String[] args) {
        int a = 3;
        tower(a,"Source","Helper","Destination");
    }
}*/
// Q. Write a program using recursion to print reverse of a user entered string.
/*import java.util.*;
public class tabish {
    public static void reverse(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverse(str,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        reverse(str,str.length()-1);
    }
}*/
// Q. write a program using recursion to find first and last occurance of an element in a string input by user
// import java.util.*;
// public class tabish {
//     public static int first = -1; //-1 se qki string 0 se start hoti hai
//     public static int last = -1;
//     public static void occ(int idx,String str,char elem){
//         if(idx == str.length()){
//             System.out.println("The starting index occurs at: "+first);
//             System.out.println("The ending index occurs at: "+last);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(currchar == elem){
//             if(first == -1){
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         occ(idx+1,str,elem);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str = sc.nextLine();
//         System.out.println("Enter the Character:");
//         char elem = sc.next().charAt(0);
//         occ(0,str,elem);
//     }
// }
// 1)Merge Sort
/* 
public class tabish {

    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conq(arr,si,mid,ei);
    }

    public static void conq(int arr[],int si,int mid,int ei){
        int merger[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merger[x] = arr[idx1];
                x++;idx1++;
            } else {
                merger[x] = arr[idx2];
                x++; idx2++;
            }
        }
        while(idx1<=mid){
            merger[x++] = arr[idx1++];
        }
        while(idx2<=ei){
            merger[x++] = arr[idx2++];
        }
        for(int i=0,j=si;i<merger.length;i++,j++){
            arr[j] = merger[i];
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int arr[] = {8,7,6,5,4,3,2,1};
        int n = arr.length;
        divide(arr, 0, n-1);
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//Q) Write a program that finds duplicate in an array
/*public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int count =1;
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Now enter the elements: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]==arr[i]){
                    count++;
                    System.out.println("The duplicate found is: "+ arr[j]);
                    break;
                }
            }
        }
        System.out.println("The Total number duplaicate arrived is: "+ count);
    }
}
    */
