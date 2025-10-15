public class Block{

Plot plots[][];
int rows=5;

String name;
int noOfBlocks;

Block(String name, int noOfBlocks){

this.name=name;
this.noOfBlocks=noOfBlocks;


plots=new Plot[rows][];

for(int i=0; i<plots.length; i++){
plots[i]=new Plot[i+10];

}

for(int i=0; i<plots.length; i++){

	for(int j=0; j<plots[i].length; j++){

	plots[i][j]=new Plot(String.format("%d-%d",i,j),PlotType.RES_5_MARLA,Shape.RECTANGULAR,200,true);
}
}

}


public String toString(){

StringBuilder str=new StringBuilder();

str.append(name+"\n");

for(int i=0; i<plots.length; i++){
	for(int j=0; j<plots[i].length; j++){
	str.append("[").append((plots[i][j])).append("]\n");
}

}
return str.toString();

}


}