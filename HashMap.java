package DsaAlgo;

import java.util.LinkedList;

public class HashMap<K,V>{
    private class HMNode{
        K key;
        V value;

        public HMNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        public String toString(){
            return this.key + "@" + this.value;
        }
    }

    //MaKing an array of linked List
    private LinkedList<HMNode>[] bucketArray;

    private int size;
    public HashMap(){
        this(5);
    }

    public HashMap(int cap){
        this.bucketArray = (LinkedList<HMNode> []) new LinkedList[cap];
        this.size = 0;

        for (int i =0; i < bucketArray.length; i++){
            bucketArray[i] = new LinkedList<HMNode>();
        }
    }

    public void put(K key,V value){
        //This key will unique index in array
        int bi = hashFunction(key);

        //get the linkedList at the index bi
        LinkedList<HMNode> bucket = bucketArray[bi];

        //check if the value is present in the hashmap on not
        int fi = findInBucket(bucket, key);
        if (fi==-1){
            HMNode nn = new HMNode(key, value);
            this.size++;

            //adding new node to the end of the list
            bucket.addLast(nn);
        }
        else {
            //getting the node
            HMNode ntbu = bucket.get(fi);
            //if value is present then simply update the value
            ntbu.value  = value;

            //calculate the loadfactor
            //if the value of loadfactor is >1 the n rehashing will done

                    
        }
    }

    private int findInBucket(LinkedList<HashMap<K, V>.HMNode> bucket, K key) {
        //iterating over the given linkedList
        //to check if the given key
        // is already present or not

        for (int i =0; i<bucket.size(); i++){
            HMNode pn = bucket.get(i);

            if (pn.key.equals(key))
                return i;
        }
        return -1;
    }

    private int hashFunction(K key){
        int hc = key.hashCode();
        int bi = Math.abs(hc) % bucketArray.length;
        return  bi;
    }
}
