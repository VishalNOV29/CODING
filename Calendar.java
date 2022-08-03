class MyCalendar {
    class Event {
        int start;
        int end;
        Event next;

        Event(int s, int e) {
            start = s;
            end = e;
        }
    }

    Event head;

    public MyCalendar() {
        head = null;

    }

    public boolean book(int start, int end) {
        Event newEvent = new Event(start, end);
        if (head == null) {

            head = newEvent;
            return true;
        }
        Event temp = head;

        while (temp.next != null) {

           
            if (newEvent.end <= temp.start || temp.end <= newEvent.start) {
                temp = temp.next;
            } else {

                return false;
            }
        }
        if (newEvent.end <= temp.start || temp.end <= newEvent.start) {
            temp.next = newEvent;
            temp = temp.next;
            return true;
        }
        return false;

        
    }


}
