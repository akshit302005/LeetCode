class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(0, graph.length - 1, graph, path, res);

        return res;
    }
    public void dfs(int node , int dest ,int[][] graph , List<Integer> path , List<List<Integer>> res){
        path.add(node);
        if(node == dest){
            res.add(new ArrayList<>(path));
        }
        else
        {
            for(int i : graph[node]){
                dfs(i,dest,graph,path,res);
            }
        }
        path.remove(path.size()-1);
    }
}