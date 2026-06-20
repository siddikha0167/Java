public class Arrays{
    public static void main(String[] args){
        int age=20;
        double height=1.674d;
        String Name="Ammu";
        char Blood='A';
        int numbers[]={1,2,3,4,5,6,7};
        int evev_num[]=new int[5];
        int even_count=0;
        int odd_num[]=new int[5];
        int odd_count=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evev_num[even_count]=numbers[i];
                even_count+=1;
            }
            else{
                odd_num[odd_count]=numbers[i];
                odd_count+=1;
            }
        }
        System.out.println(age);   
    }
}