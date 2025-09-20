package exercicioIntroducaoOO;

public class Rectangle {

	public Double width;
	public Double height;

	public Double Area(Double h, Double w) {

		return h * w;
	}

	public Double Perimeter(Double h, Double w) {

		return  (h + w) * 2;
	}
	
	public Double Diagonal(Double h, Double w) {
		Double d = Math.pow(w, 2) + Math.pow(h, 2);
		return Math.sqrt(d);
	}
	
}
