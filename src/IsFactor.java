class Factor {
    boolean isFact (int a,int b){
        if ((b%a)==0) return (boolean)true;
        else return (boolean) false;
    }
}
public class IsFactor {
    public static void main (String args[]){
        Factor e = new Factor();
         if(e.isFact(2,20)) System.out.println("2 - делитель");
         if (e.isFact(3,20)) System.out.println("Эта строка не будет видна");
    }


}
