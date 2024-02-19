import java.util.*;

class Itinerary {

    public static void main(String[] args) {
        System.out.println("sdjqnsd");
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start + " --> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }

    private static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}

// 1-> find start point by convert hashmap in to reverse map and check rev map
// has the same key if not then it is the start point
// 2-> loop in first map and change the start as map.get(start)