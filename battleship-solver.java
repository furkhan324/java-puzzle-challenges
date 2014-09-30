public class BattleShipSolver2 {
	//0 is water
	int[][] array1=new int[20][20];
	int[][] array2=new int[20][20];
	int[][] array3=new int[20][20];
	int[][] array4=new int[20][20];
	int[][] array5=new int[20][20];
	int[][] array6=new int[20][20];
	int[][] array7=new int[20][20];
	int[][] array8=new int[20][20];
	// 1 indicates vessel
	//5 is not yet determined
	int[][] copyarray=new int[20][20];
	int[] copyx=new int[10];
	int[] copyy=new int[10];
	int[] copyx1=new int [10];
	int[] copyy1=new int [10];
	int[] xaxis={1,3,1,4,3,1,2,2,1,2};
	int[] yaxis={2,1,0,3,2,0,3,1,1,7};//!!!!!! Custom Configure for given Battlefield Puzzle
	int c=0;
	
	public static void main(String[] args){
		
BattleShipSolver2 obj=new BattleShipSolver2();
obj.runner();
}
	public void runner(){
		
		for(int x=0;x<10;x++){
			copyx[x]=xaxis[x];
			copyy[x]=yaxis[x];
			copyx1[x]=xaxis[x];
			copyy1[x]=yaxis[x];
				for(int y=0;y<10;y++){
				copyarray[x][y]=5;
			}
		}
		//Given Submarines:
		copyarray[0][2]=1;
		copyarray[1][0]=1;
		
		CreatePerim(copyarray);
		Detractor(copyarray);//after this both x and y axis have been modified 
		WaterPositioner(copyarray);// method only needs to be called once
	System.out.println("I'm Thinking...");
		// this is where the real action begins
		System.out.println();
		fourpositioner();
	}
	public void fourpositioner(){
		
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				//horizontal
				restore(copyarray,array1);
				if(array1[a][b]==5&&array1[a][b+1]==5&&array1[a][b+2]==5&&array1[a][b+3]==5){
					array1[a][b]=1;array1[a][b+1]=1;array1[a][b+2]=1;array1[a][b+3]=1;//positions horizontally
					CreatePerim(array1);
					threepositioner1();
					}restore(copyarray,array1);// vertical
				if(array1[a][b]==5&&array1[a+1][b]==5&&array1[a+2][b]==5&&array1[a+3][b]==5){
					array1[a][b]=1;array1[a+1][b]=1;array1[a+2][b]=1;array1[a+3][b]=1;//positions horizontally
					CreatePerim(array1);
					threepositioner1();
				}}}}
	public void threepositioner1(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				//horizontal
				restore(array1,array2);
				if(array2[a][b]==5&&array2[a][b+1]==5&&array2[a][b+2]==5){
					array2[a][b]=1;array2[a][b+1]=1;array2[a][b+2]=1;;//positions horizontally
					CreatePerim(array2);
					threepositioner2();
					}restore(array1,array2);// vertical
				if(array2[a][b]==5&&array2[a+1][b]==5&&array2[a+2][b]==5){
					array2[a][b]=1;array2[a+1][b]=1;array2[a+2][b]=1;//positions horizontally
					CreatePerim(array2);
					threepositioner2();
				}}}
	}
	public void threepositioner2(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				//horizontal
				restore(array2,array3);
				if(array3[a][b]==5&&array3[a][b+1]==5&&array3[a][b+2]==5){
					array3[a][b]=1;array3[a][b+1]=1;array3[a][b+2]=1;;//positions horizontally
					CreatePerim(array3);
					twopositioner1();
					}restore(array2,array3);// vertical
				if(array3[a][b]==5&&array3[a+1][b]==5&&array3[a+2][b]==5){
					array3[a][b]=1;array3[a+1][b]=1;array3[a+2][b]=1;//positions horizontally
					CreatePerim(array3);
					twopositioner1();
				}}}
	}	
	public void twopositioner1(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				//horizontal
				restore(array3,array4);
				if(array4[a][b]==5&&array4[a][b+1]==5){
					array4[a][b]=1;array4[a][b+1]=1;//positions horizontally
					CreatePerim(array4);
					twopositioner2();
					}restore(array3,array4);// vertical
				if(array4[a][b]==5&&array4[a+1][b]==5){
					array4[a][b]=1;array4[a+1][b]=1;//positions horizontally
					CreatePerim(array4);
					twopositioner2();
				}}}
	}
	public void twopositioner2(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				//horizontal
				restore(array4,array5);
				if(array5[a][b]==5&&array5[a][b+1]==5){
					array5[a][b]=1;array5[a][b+1]=1;//positions horizontally
					CreatePerim(array5);
					twopositioner3();
					}restore(array4,array5);// vertical
				if(array5[a][b]==5&&array5[a+1][b]==5){
					array5[a][b]=1;array5[a+1][b]=1;//positions horizontally
					CreatePerim(array5);
					twopositioner3();
				}}}
	}
	public void twopositioner3(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				//horizontal
				restore(array5,array6);
				if(array6[a][b]==5&&array6[a][b+1]==5){
					array6[a][b]=1;array6[a][b+1]=1;//positions horizontally
					CreatePerim(array6);
					onepositioner1();
					}restore(array5,array6);// vertical
				if(array6[a][b]==5&&array6[a+1][b]==5){
					array6[a][b]=1;array6[a+1][b]=1;//positions horizontally
					CreatePerim(array6);
					onepositioner1();
				}}}
	}
	public void onepositioner1(){
		for(int a =0;a<10;a++){
			for(int b=0;b<10;b++){
				restore(array6,array7);
				if(array7[a][b]==5){
					array7[a][b]=1;
					CreatePerim(array7);
					onepositioner2();
				}
			}}}
		
	public void onepositioner2(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
			restore(array7,array8);
			if(array8[a][b]==5){
				array8[a][b]=1;
				CreatePerim(array8);
				c++;
			
				if(check(array8)==true){
					System.out.println(c+" permutations tested in a ten by ten grid ");
					System.out.println("Puzzle Solved" +
							"!!!!!!!!!" +
							"");
					Printer(array8);System.exit(0);
					}
							
			}	
			}}}
	public void CreatePerim(int array[][]){
		for(int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				if(array[x][y]==1){
					try{if(array[x+1][y]==5){
						array[x+1][y]=0;}
					}catch(Exception e){}
					try{if(array[x-1][y]==5){
						array[x-1][y]=0;}
					}catch(Exception e){}
					try{if(array[x][y+1]==5){
						array[x][y+1]=0;}
					}catch(Exception e){}
					try{if(array[x][y-1]==5){
						array[x][y-1]=0;}
					}catch(Exception e){}
					try{if(array[x+1][y+1]==5){
						array[x+1][y+1]=0;}
					}catch(Exception e){}
					try{if(array[x-1][y-1]==5){
						array[x-1][y-1]=0;}
					}catch(Exception e){}
					try{if(array[x+1][y-1]==5){
						array[x+1][y-1]=0;}
					}catch(Exception e){}
					try{if(array[x-1][y+1]==5){
						array[x-1][y+1]=0;}
					}catch(Exception e){}
			}}}}
	public void Detractor(int array[][]){
				for(int x=0;x<10;x++){
					for(int y=0;y<10;y++){
						if(array[x][y]==1){
							yaxis[x]--;
							xaxis[y]--;
						}}}
			}
	public void WaterPositioner(int array[][]){
			for(int x=0;x<10;x++){
			if(xaxis[x]==0){
				for(int y =0;y<10;y++){
					if(array[y][x]==5){  
						array[y][x]=0;
					}
				}}if(yaxis[x]==0){
					for(int y=0;y<10;y++){
						if(array[x][y]==5){
							array[x][y]=0;
						}
					}
				}
			

			}}
	public void Printer(int[][] array){

				for(int x=0;x<10;x++){
					if(x!=0){
						System.out.println("|"+copyy[x-1]);}
					for(int y=0;y<10;y++ ){
						System.out.print(array[x][y]+ " ");
						if(y==9&&x==9){
							System.out.print("|"+copyy[x]);
						}
					}	
				}
				System.out.println();
				System.out.println("---------------------" +
						"");
				for(int x=0;x<10;x++){
				System.out.print(copyx[x]+" ");
				}
				System.out.println();
			}
	public void restore(int copythis[][],int tothis[][]){
	//restore point 1
				for(int x=0;x<10;x++){for(int y=0;y<10;y++){tothis[x][y]=copythis[x][y];}}//
}
	public boolean check(int[][] array){
				//reset
				for(int a =0;a<10;a++){
					copyy[a]=copyy1[a];
					copyx[a]=copyx1[a];
				}
				for(int x=0;x<10;x++){
					for(int y=0;y<10;y++){
						if(array[x][y]==1){
							copyy[x]--;
							copyx[y]--;
						}}}
				if(copyy[0]==0&&copyy[1]==0&&copyy[2]==0&&copyy[3]==0&&copyy[4]==0&&copyy[5]==0&&copyy[6]==0&&copyy[7]==0&&copyy[8]==0&&copyy[9]==0&&
						copyx[0]==0&&copyx[1]==0&&copyx[2]==0&&copyx[3]==0&&copyx[4]==0&&copyx[5]==0&&copyx[6]==0&&copyx[7]==0&&copyx[8]==0&&copyx[9]==0
						){
				return true;}
				else{
					return false;
				}
			}
}
