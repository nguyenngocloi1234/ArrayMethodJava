public class MineSweeper {
    public static void main(String[] args) {
        String[][] map ={
                {"*",".","*",".","."}
        };

        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[1][MAP_WIDTH];

        for(int x=0; x< MAP_WIDTH;x++){
            String currentCell = map[0][x];
            if(currentCell.equals("*"))
                mapReport[0][x]="*";
            else {
                int minesAround =0;
                boolean left = x-1 >=0;
                boolean hasMineAtLeft = left && map[0][x-1].equals("*");
                if(hasMineAtLeft)
                    minesAround++;

                boolean right = x+1 < MAP_WIDTH;
                boolean hasMineAtRight = right && map[0][x+1].equals("*");
                if (hasMineAtRight)
                    minesAround++;

                mapReport[0][x] = String.valueOf(minesAround);
            }
        }


        for(int x=0;x<MAP_WIDTH;x++){
            String currentCellReport = mapReport[0][x];
            System.out.print(currentCellReport);

        }
    }
}
