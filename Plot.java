public class Plot{

String id;
PlotType type;
Shape shape;
double area;
boolean availbility;


Plot(String id, PlotType type,Shape shape, double area, boolean availbility){

this.id=id;
this.type=type;
this.shape=shape;
this.area=area;
this.availbility=availbility;


}

public String getId(String id){
return id;
}

public PlotType getPlotType(){
return type;
}

public double getArea(){
return area;
}

public boolean getAvailbility(){
return availbility;

}

public Shape getShape(){
return shape;
}

public void setId(String id){
this.id=id;
}

public void setPlotType(PlotType type){
this.type=type;
}

public void setShape(Shape shape){
this.shape=shape;
}

public void setArea(double area){
this.area=area;
}
public void setAvailbility(boolean availbility){
this.availbility=availbility;
}








public String toString(){

return String.format("Id: %s  %s  Shape: %s Area: %.2f Status: %b",id,type,shape,area,availbility);

}


}