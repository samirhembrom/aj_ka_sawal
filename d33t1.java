//729. My Calendar I
class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    MyCalendar() {
        calendar = new TreeMap();
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        System.out.println(prev+ " " +next);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}
/*
Time Complexity:  O(nlogn) For insertion but O(log n)
			for searching
Space Compleixty: O(n) We need n extra space for data structure
*/