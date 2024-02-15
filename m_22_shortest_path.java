public class m_22_shortest_path {
    public static void ShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            if(path.charAt(i)=='S'){
                y--;
            }
            if(path.charAt(i)=='E'){
                x++;
            }
            if(path.charAt(i)=='W'){
                x--;
            }
        }

        // System.out.println(x);
        // System.out.println(y);

        double a = Math.sqrt((x*x)+(y*y));
        System.out.println(a);

    }
    public static void main(String[] args) {
        String path ="WNEENESENNN";
        ShortestPath(path);

    }
}
