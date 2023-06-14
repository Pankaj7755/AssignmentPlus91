public class findMax{  
static public int maximunWeight (int array[],int k) {
   Arrays.sort(array);
   int n = arrays.length;
   int a=0, b=0, c=0;
  for (int i =0 ; i<n; i++) {
    a+= array[i]; 
}
for(int i=0; i<k; i++) {
  b+=array[i];
}
int q = n-k;
 for(int i=k; i<q; i++) {
 c+=array[i];
}
 return Math.max(Math.abs(b - (n-b)),Math.abs(c - (n-c)));
}
public static void main(String []args)  {
  int k=2;
  int array[] = {8,4,5,2,10};
  System.out.println(maximunWeight(array,k));
}
}