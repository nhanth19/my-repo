package enumeration;

public class Ex01 {
	public static void main(String[] args) {
		int xA = 2;
		int yA = 4;
		int xO = 1;
		int yO = 2;
		int r = 1;
		
		Position pos = getPos(xA, yA, xO, yO, r);
		System.out.println(pos.value);
	}
	
	private static Position getPos(int xA, int yA, int xO, int yO, int r) {
		double distance = Math.sqrt(Math.pow((xA - xO), 2) + Math.pow((yA - yO), 2));
		
		if(distance == r) {
			return Position.ONSIDE;
		}
		if(distance > r) {
			return Position.OUTSIDE;
		}
		return Position.INSIDE;
	}
}
