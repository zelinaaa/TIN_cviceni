package pr5;

import java.util.Arrays;
import java.util.Objects;

public class Board {
	
	public static final int NAHORU = 1;
	public static final int DOLU = 2; 
	public static final int DOLEVA = 3; 
	public static final int DOPRAVA = 4; 
	
	
	int[][] matrix = {{7, 2, 4}, {5, 0, 6}, {8, 3, 1}};
	int x = 1;
	int y = 1;
	
	
	public void posun(int smer) {
		switch (smer) {
			case NAHORU:
				if (y <= 0) break;
				matrix[y][x] = matrix[y-1][x];
				matrix[y-1][x] = 0;
				y--;	
				break;
			case DOLU:
				if (y >= 2) break;
				matrix[y][x] = matrix[y+1][x];
				matrix[y+1][x] = 0;
				y++;
				
				break;
			case DOLEVA:
				if (x <= 0) break;
				matrix[y][x] = matrix[y][x-1];
				matrix[y][x-1] = 0;
				x--;
				break;
			case DOPRAVA:
				if (x >= 2) break;
				matrix[y][x] = matrix[y][x+1];
				matrix[y][x+1] = 0;
				x++;
				break;
		}
	}
	
	public void vypisPole() {
		for (int i = 0; i < matrix.length; i++)
		  {
		    // length returns number of rows
		    for (int j = 0; j < matrix[i].length; j++)
		    {
			System.out.print( matrix[i][j]  + "\t");
		     }
		     System.out.println();
		   }
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(matrix);
		result = prime * result + Objects.hash(x, y);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Arrays.deepEquals(matrix, other.matrix) && x == other.x && y == other.y;
	}
	
	
	
}
