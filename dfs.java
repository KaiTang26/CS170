class Solution{

    public boolean[] visit;
    public int[] pre;
    public int[] post;
    public int clock;

    public void DFS(int[][] graph){

        visit = new boolean[graph.length];
        pre = new int[graph.length];
        post = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            visit[i]=false;
            pre[i]=0;
            post[i]=0;
        }

        clock = 1;

        for(int i=0; i<graph.length; i++){
            if(!visit[i]){

                explore(graph, i);
            }
        }

        for(int i=0; i<graph.length; i++){

            System.out.println("V: "+i+" "+" pre: "+pre[i]);
            System.out.println("V: "+i+" "+" post: "+post[i]);
        }


    }

    public void explore(int[][] graph, int node){
        visit[node]=true;

        pre[node]=clock;
        clock++;

        for(int i : graph[node]){

            if(!visit[i]){
                explore(graph, i);
            }
        }

        post[node]=clock;
        clock++;
    }

}

// O(V+E)