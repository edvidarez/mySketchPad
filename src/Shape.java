import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
public class Shape implements Serializable{

	private static final long serialVersionUID = -221835367838094699L;
	public int x0,y0;
	public float alfa=0.0f;
	public boolean isActive=false;
	public void Draw(Graphics c,boolean isActive,boolean rotation,int total_caminos){}
	public void Move(int x, int y){}
	public boolean HitTest(int x, int y)
	{return false;}
	public void Resize(int n){};
	public void Resize(int x,int y){};
        public String type = "";
        public boolean estadoinicial= false;
        public boolean estadofinal= false;
        public ArrayList<String> aristas = new ArrayList<String>();
        public ArrayList<Shape> aristas_shape = new ArrayList<Shape>();
        public String a;
        public int caminos=0;
        public Shape ini;
        public Shape fin;
       
}
