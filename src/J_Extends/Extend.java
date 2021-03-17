package J_Extends;

	class Extend extends Super{
		private String style;
		
		// class Constructor
		Extend(String s, double w, double h) {
			super(w, h);
			
			setHeight(h);
			setWidth(w);
			
			style = s;
		}
		
		// class constructor
		Extend(double w, double h) {
			// Super class constructor. It must be the first operator.
			super(w, h);
		}
		
		double area() {
			return getWidth() * getHeight() / 2;
		}
		
		void showStyle() {
			System.out.println("Triangle: " + style);
			
			// call method from super class.
			super.showDim();
			super.extend = 0;
		}
}
