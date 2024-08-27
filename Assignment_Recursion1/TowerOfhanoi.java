package Assignment_Recursion1;

public class TowerOfhanoi {
public static void towerOfHanoi(int disks, char source, char auxiliary, char destination)
	{
// AC
// AB
// 
		if(disks==0) {
			return;
		}  
		if(disks == 1) {
			System.out.println(source + " " + destination); // A C
			return;
		}

		towerOfHanoi(disks-1, source, destination, auxiliary); // 1 , A , B , C
		System.out.println(source + " " + destination); // A C
				towerOfHanoi(disks-1, auxiliary, source, destination); // 0 

		}
        public static void main(String args[]) {
        int disks = 3;
        towerOfHanoi(disks, 'A', 'B', 'C');
        }
    
}
