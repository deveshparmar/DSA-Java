class MyCalendar {
    TreeMap<Integer,Integer>cal;
    public MyCalendar() {
        cal = new TreeMap();
    }
    
    public boolean book(int start, int end) {
        Integer floor = cal.floorKey(start);
        Integer ceil = cal.ceilingKey(start);
        
        if(floor!=null && cal.get(floor)>start || ceil!=null && end>ceil)
            return false;
        
        cal.put(start,end);
        
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
