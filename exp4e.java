/*Given a 2D matrix representing a map where '1's represent land and '0's represent water, write a program to count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.*/
package lp2;
public class exp4e{
    public static void main(String[] args) {
        int[][] map = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
        };
        System.out.println("Number of islands is: " + countIslands(map));
    }

    public static int countIslands(int[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    dfs(map, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] map, int i, int j) {
        if (i < 0 || j < 0 || i >= map.length || j >= map[i].length || map[i][j] != 1) {
            return;
        }
        map[i][j] = 0; 
        dfs(map, i + 1, j);
        dfs(map, i - 1, j);
        dfs(map, i, j + 1);
        dfs(map, i, j - 1);
    }
}

