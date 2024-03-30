package Week2;
import java.util.ArrayList;

class Event {
    int time;
    boolean isArrival;

    public Event(int time, boolean isArrival) {
        this.time = time;
        this.isArrival = isArrival;
    }
}

public class P3 {
    public static void main(String[] args) {
        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event(1, true));
        events.add(new Event(4, false));
        events.add(new Event(2, true));
        events.add(new Event(5, false));
        events.add(new Event(5, true));
        events.add(new Event(7, false));

        System.out.println(minimumGates(events)); // Output: 2
    }

    public static int minimumGates(ArrayList<Event> events) {
        // Bubble sort
        for (int i = 0; i < events.size() - 1; i++) {
            for (int j = 0; j < events.size() - i - 1; j++) {
                if (events.get(j).time > events.get(j + 1).time ||
                        (events.get(j).time == events.get(j + 1).time && events.get(j).isArrival)) {
                    Event temp = events.get(j);
                    events.set(j, events.get(j + 1));
                    events.set(j + 1, temp);
                }
            }
        }

        int largest = 0;
        int gates = 0;

        for (Event event : events) {
            if (event.isArrival) {
                gates++;
            } else {
                gates--;
            }
            largest = Math.max(largest, gates);
        }

        return largest;
    }
}

