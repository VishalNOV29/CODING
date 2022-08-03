import java.util.Calendar;

class Main{
    class Event{
        Event node;
        int first;
        int last;
        Event(int f,int l){
            first=f;
            last=l;
        }
    }
    Event current;
    Main(){
        current=null;
    }
    boolean book(int start, int end){
        Event newEvent=new Event(start, end);
        if (current==null){
            current=newEvent;
            return true;
        }
        if (current.last<=newEvent.first){
            current=newEvent;
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        System.out.println("Code is runnig well.");
        Main obj=new Main();
        boolean result=obj.book(10, 20);
        System.out.println(result);
        System.out.println(obj.book(15, 25));
        System.out.println(obj.book(20, 30));
    }
}
// [[], [10, 20], [15, 25], [20, 30]]