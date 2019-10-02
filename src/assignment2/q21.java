package assignment2;
	
	 
	class q21{
	    int size = 50 ;             
	    int m = 1;
	    int c = -10;
	    int y = m*size + c ;         

	    String[][] Matrix(){
	        String[][] a = new String[size][y];
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < y; j++) {
	                if(i == m*j + c){
	                    if(i>=0 && j>=0) a[i][j] = "**";
	                }
	                else{
	                    if(i>=0 && j>=0) a[i][j] = " 0";
	                }  
	            }
	        }
	        return a;
	    }
	    void printMatrix(String[][] a){
	        for (int i = size-1; i >= 0; i--) {
	            for (int j = 0; j < y; j++) {
	                System.out.print(a[i][j]);
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        q21 l = new q21();
	        l.printMatrix(l.Matrix());
	    }
	}
	
	
	
	
	
	
	
	 
	/*public final class q21 extends JFrame
	{
	    private static Graphics gBuf = null;
	    private static GraphPaperCanvas canvas = null;
	    private static Image vm = null;
	    private int x, y;
	    private int w, h;
	     
	public static void main( String[] args )
	    {
	        double y;
	         
	        sine gp1 = new sine(10,10);
	        for ( double x = -10; x<=10; x+=0.01 )
	        {
	             
	            y = Math.sin(x); 
	            gp1.drawPoint(x,y);
	        }
	 
	         
	    }
	    public void sine( int x, int y )
	    {
	        if ( canvas == null )
	        {
	            setTitle("Sine Curve");
	            setSize(340,370);
	            setLocation(20,50);
	 
	            canvas = new GraphPaperCanvas(null);
	            getContentPane().add(canvas);
	            setVisible(true);
	 
	            vm = canvas.createImage(1100,950);
	            gBuf = vm.getGraphics();
	            canvas.setVm(vm);
	 
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        }
	 
	        this.x = x;
	        this.y = y;
	        w = 300;
	        h = 300;
	         
	        drawBounds();
	        gBuf.setColor( Color.GREEN );
	    }
	     
	    public void drawBounds()
	    {
	        Color cur = gBuf.getColor();
	        gBuf.setColor( Color.LIGHT_GRAY );
	        for ( int d=0; d<w; d+=w/20 )
	            gBuf.drawLine( x+d, y+0, x+d, y+h );
	        for ( int d=0; d<h; d+=h/20 )
	            gBuf.drawLine( x+0, y+d, x+h, y+d );
	 
	        gBuf.setColor( Color.BLACK );
	        gBuf.drawRect( x, y, w+1, h+1 );
	        gBuf.drawLine( x+w/2, y+0, x+w/2, y+h );
	        gBuf.drawLine( x+0, y+h/2, x+w, y+h/2 );
	        gBuf.setColor( cur );
	        canvas.repaint();
	    }   
	    public void setColor( Color c )
	    {
	        gBuf.setColor(c);
	    }
	     
	    public void drawPoint( double px, double py )
	    {
	        if ( px > 10 || px < -10 || py > 10 || py < -10 )
	            return;
	 
	        px *= w/20;
	        py *= h/20;
	        px += w/2 + 1;
	        py = h/2 - py + 1;
	 
	        gBuf.drawLine( x+(int)px, y+(int)py, x+(int)px, y+(int)py );
	        canvas.repaint();
	    }
	}
	class GraphPaperCanvas extends Canvas
	{
	    private Image vm;
	     
	    public GraphPaperCanvas( Image vm )
	    {
	        this.vm = vm;
	        setBackground( Color.white );
	    }
	     
	    public void setVm( Image vm )
	    {
	        this.vm = vm;
	    }
	     
	        @Override
	    public void paint( Graphics g )
	    {
	        g.drawImage(vm,0,0,this);
	    }
	     
	        @Override
	    public void update(Graphics g) { paint(g); }    
	 
	
	
}
*/