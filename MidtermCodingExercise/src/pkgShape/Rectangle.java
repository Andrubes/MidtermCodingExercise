package pkgShape;


public class Rectangle extends Shape{
	
	protected int iWidth;
	protected int iLength;
	
	public Rectangle(int w, int l) {
		iWidth = w;
		iLength = l;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		if(iLength <= 0 || iWidth <= 0) {
			throw new IllegalArgumentException();
		}
		else
			return iLength*iWidth;
	}
	
	public double perimeter() {
		if(iLength <= 0 || iWidth <= 0) {
			throw new IllegalArgumentException();
		}
		else
			return (2*iLength + 2*iWidth);
	}
	
	public int compareTo(Rectangle b) {
		if(this.area() > b.area()) return 1; 
	    if(this.area() < b.area()) return -1;
	    else
	    	return 0;
	}

}
