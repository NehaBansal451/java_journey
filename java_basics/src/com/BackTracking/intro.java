package com.BackTracking;

import java.util.Arrays;

public class intro {
    public static  void main(String[] args) {

        //maze problem no. of path
        System.out.println(count(3, 3));
        System.out.println();

        //printing path --> same theory as processed and unprocessed
        path("",3,3);
        System.out.println();

        //now we can go diagonally
        pathWithDia("",3,3);
        System.out.println();

        //path with obstacles
        boolean[][] board = {
                {true , true , true},
                {true , true , true},
                {true , true , true},

        };
        pathWithObstacles("",board,0,0);
        System.out.println();

        // all path
        AllPath("",board,0,0);

        //matrix with path
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);
    }



    static int count( int r, int c){
            if (r == 1 || c ==1){
                return 1;
            }
            int left = count(r-1,c);
            int right = count(r,c-1);
            return left + right;
        }


        static void path(String p , int r , int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
          if(r > 1){
          path(p + "D",r-1 , c);
          }
          if(c > 1) {
              path(p + "R", r, c - 1);
          }
        }


        static void pathWithDia(String p , int r , int c) {
            if (r == 1 && c == 1) {
                System.out.println(p);
                return;
            }
            if (r > 1 && c > 1) {
                pathWithDia(p + "D", r - 1, c - 1);
            }
            if (r > 1) {
                pathWithDia(p + "N", r - 1, c);
            }
            if (c > 1) {
                pathWithDia(p + "R", r, c - 1);
            }

        }

    static void pathWithObstacles(String p , boolean[][] maze,int r , int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return ;
        }
        if(r < maze.length -1){
            pathWithObstacles(p + "D",maze,r+1 , c);
        }
        if(c < maze[0].length -1) {
            pathWithObstacles(p + "R", maze,r, c + 1);
        }
    }

    static void AllPath(String p ,boolean[][] maze,int r , int c){
        if(r == maze.length -1 && c == maze.length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return ;
        }

        //i am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length -1){
            AllPath(p + "D",maze,r+1 , c);
        }
        if(c < maze[0].length -1) {
            AllPath(p + "R", maze,r, c + 1);
        }
        if(r > 0 ){
            AllPath(p + 'U',maze ,r-1 , c);
        }
        if(c > 0){
            AllPath(p + 'L',maze , r , c-1);
        }
        //this line is where the function will be over
        // so before the function gets removed , also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathPrint(String p ,boolean[][] maze,int r , int c ,int[][] path , int step){
        if(r == maze.length -1 && c == maze.length - 1){
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return ;
        }

        //i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length -1){
            allPathPrint(p + "D",maze,r+1 , c ,path,step+1);
        }
        if(c < maze[0].length -1) {
            allPathPrint(p + "R", maze,r, c + 1,path,step+1);
        }
        if(r > 0 ){
            allPathPrint(p + 'U',maze ,r-1 , c,path,step+1);
        }
        if(c > 0){
            allPathPrint(p + 'L',maze , r , c-1,path,step+1);
        }
        //this line is where the function will be over
        // so before the function gets removed , also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }


}
