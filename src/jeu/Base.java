package Commandes;

public class Base {
	private String[][] goban;
	
	public Base(int l, int h) {
		goban = new String[h][l];
		for (int i=0;i<h;++i) {
			for(int j=0;j<l;++j) {
				goban[i][j] = ".";
			}
		}
	}
	
	public String show() {
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<goban.length;++i) {
			sb.append(i);
			for(int j=0;j<goban[i].length;++j) {
				sb.append(" .");
			}
			sb.append("\n");
		}
		sb.append("  ");
		for(int i=0;i<goban[0].length;++i) {
			sb.append(Character.toString(65+i)+" ");
		}
		return sb.toString();
	}
}
