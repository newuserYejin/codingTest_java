public class App {
    public int findCenter(int[][] edges) {
        int center = edges[0][0];           // 값 초기화
        
                // 1 2 || 2 3
                // 1 2 || 3 2       2번
                // 2 1 || 2 3       1번
                // 2 1 || 3 2
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            center = edges[0][0];
        } else if(edges[0][1] == edges[1][1] || edges[0][1] == edges[1][0]){
            center = edges[0][1];
        }

        return center;
    }
    public static void main(String[] args) throws Exception {
        int[][] edges =new int[][] {{1,2},{5,1},{1,3},{1,4}};
        App ap = new App();
        System.out.println(ap.findCenter(edges));
    }
}
