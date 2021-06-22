class Solution{

    public boolean[] visit;

    public void DFS(int[][] graph){

        visit = new boolean[graph.length-1];

        for(int i=0; i<graph.length; i++){
            visit[i]=false;
        }

        for(int i=0; i<graph.length; i++){
            if(!visit[i]){

                explore(graph, i);
            }
        }


    }

    public void explore(int[][] graph, int node){
        visit[node]=true;

        System.out.println(node);

        for(int i : graph[node]){

            if(!visit[i]){
                explore(graph, i);
            }
        }
    }

}