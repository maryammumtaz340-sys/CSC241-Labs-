public class Date{
       int d;
       int m;
       int y;
   Date(int d, int m , int y){
          this.d = d;
          this.m= m;
          this.y= y;
  }
    public String tostring(){
       return String.format("%02d-%02d-%04d",d,m,y);
 }
}
