class Path {
    String from;
    String to;
    int checkIn;
    int checkOut;
}
class UndergroundSystem {
    Map<Integer, Path> newTrips = new HashMap<Integer, Path>();
    List<Path> completedTrips = new ArrayList<>();

    UndergroundSystem(){}

    void checkIn(int id, String stationName, int t){
        Path p = new Path();
        p.from = stationName;
        p.checkIn = t;
        newTrips.put(id, p);
    }

    void checkOut(int id, String stationName, int t){
        Path p = newTrips.get(id);
        p.to = stationName;
        p.checkOut = t;
        completedTrips.add(p);
    }

    double getAverageTime(String startStation, String endStation){
        double sum = 0;
        int amount = 0;
        for(Path p : completedTrips){
            if(!p.from.equals(startStation) || !p.to.equals(endStation))
                continue;
            amount++;
            sum+=p.checkOut-p.checkIn;
        }
        return sum/amount;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */