package boardGame;

public class Piece {
	protected Position postition;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		postition = null;
	}

	protected Board getBoard() {
		return board;
	}	
	
}
