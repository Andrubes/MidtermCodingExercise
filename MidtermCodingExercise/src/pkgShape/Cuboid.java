package pkgShape;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	public Cuboid(int w, int l, int d) {
		super(w,l);
		iDepth = d;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		if(iLength <= 0 || iWidth <= 0 || iDepth <= 0) {
			throw new IllegalArgumentException();
		}
		return super.area()*iDepth;
	}
	
	public double area() {
		if(iLength <= 0 || iWidth <= 0 || iDepth <= 0) {
			throw new IllegalArgumentException();
		}
		return (2*iLength*iWidth + 2*iLength*iDepth + 2*iWidth*iDepth);
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Cuboid b) {
		if(this.area() > b.area()) return 1; 
	    if(this.area() < b.area()) return -1;
	    else
	    	return 0;
	}
	
	class SortByArea{
		
		public int compare(Cuboid a, Cuboid b) {
			if(a.area() > b.area()) return 1; 
		    if(a.area() < b.area()) return -1;
		    else
		    	return 0;
		}
	}
	
	class SortByVolume{
		
		public int compare(Cuboid a, Cuboid b) {
			if(a.volume() > b.volume()) return 1; 
		    if(a.volume() < b.volume()) return -1;
		    else
		    	return 0;
		}
	}
}
