package plinedrome;

public class palindrome {

 public static void main(String[] args){
  String value="151";//"MADAM"
  String remove=value.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
  int length=remove.length();
  int middle=remove.length()/2;
  int count=0;
  for(int i=0;i<middle;i++) {
   if (remove.charAt(i) == remove.charAt(length-1-i)) {
      count=count+1;
   } else {
    System.out.print("No");
    break;
   }
  }
  //System.out.print(count+""+middle);
  if(count==middle){
   System.out.print("Yes");
  }
 }
 }


