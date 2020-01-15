
class test
{
	public static void main(String[] args){

		int a[][]={{2,7,9},{3,6},{1,3,4,5}};

			/*for(int i=0;i<a.length;i++){
				System.out.println(a);
			}*/

			// for(int x[]:a){
			// 	for(int y:x){
			// 	System.out.println(y);
			// 	}
			// }


			 int z[][][]={{{2,7},{9}},{{1,9},{3,6}},{{9,7,6},{4}}};
			// for(int i=0;i<z.length;i++){
			// 	for(int j=0;j<z[i].length;j++){
			// 		for(int k=0;k<z[i][j].length;k++){
			// 			System.out.println(z[i][j][k]);
			// 		}
			// 	}
			// }

			 for(int i[][]:z){
			 	for(int j[]:i){
			 		for(int k:j){
			 			System.out.println(k);
			 		}
			 	}
			 }	




	}
}