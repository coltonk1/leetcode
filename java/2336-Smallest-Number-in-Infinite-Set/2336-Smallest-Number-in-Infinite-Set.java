class SmallestInfiniteSet {
    Map<Integer, Integer> info = new HashMap<Integer, Integer>();
    public SmallestInfiniteSet() {

    }
    
    public int popSmallest() {
        int a = 1;
        for (int i = 0; i < info.size(); a++) {
            if(info.get(a) == null || info.get(a) != 0) break;
        }
        info.put(a, 0);
        return a;
    }
    
    public void addBack(int num) {
        info.put(num, 1);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */