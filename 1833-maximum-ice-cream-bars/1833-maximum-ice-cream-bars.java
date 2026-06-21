class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : costs){
            pq.add(i);
        }
        int count=0;
        while(!pq.isEmpty() && coins - pq.peek()>=0){
            count++;
            coins-=pq.poll();
        }
        return count;
    }
}