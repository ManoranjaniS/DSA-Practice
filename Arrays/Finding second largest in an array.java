Finding second largest in an array



int largest=Integer.MIN_VALUE;
     int slargest=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]>largest){
             slargest=largest;
             largest=arr[i];

         }
         else if(arr[i]>slargest && arr[i]!=largest){
             slargest=arr[i];
         }

     }
     System.out.println(slargest);
