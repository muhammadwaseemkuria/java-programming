public enum PlotType{

RES_5_MARLA("RES_5_MARLA",3000000),RES_10_MARLA("RES_10_MARLA",7500000),RES_1_KANAL("RES_1_KANAL",30000000),COMM_SHOP("COMM_SHOP",3000000),COMM_OFFICE("COMM_OFFICE",5000000),PARKING("PARKING",200000);


String name;
int price;

PlotType(String name,int price){
this.price=price;
this.name=name;
}
public int getPrice(){
return price;
}

public String getName(){
return name;
}


public String toString(){
return String.format("Plot Type: %s Price: %d",name,price);
}

}


