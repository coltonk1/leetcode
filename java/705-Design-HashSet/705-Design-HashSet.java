class MyHashSet {
    int[] hash = new int[0];

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(contains(key))
            return;
        int[] newHash = new int[hash.length+1];
        for(int i = 0; i < hash.length; i++){
            newHash[i] = hash[i];
        }
        newHash[newHash.length-1] = key;
        hash = newHash;
    }
    
    public void remove(int key) {
        if(contains(key)){
            boolean removed = false;
            int[] newHash = new int[hash.length-1];
            for(int i = 0; i < hash.length; i++){
                if(!removed && hash[i] == key){
                    removed = true;
                    continue;
                }
                if(removed){
                    newHash[i-1] = hash[i];
                }
                else{
                    newHash[i] = hash[i];
                }
            }

            hash = newHash;

        }
    }
    
    public boolean contains(int key) {
        for(int i = 0; i < hash.length; i++){
            if(hash[i] == key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */