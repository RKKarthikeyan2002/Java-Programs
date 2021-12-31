import java.io.*;
public class FileHandling{
	static DataInputStream in = new DataInputStream(System.in);
	public static void main(String args[]) throws IOException{
		int ch;
		while(true){
			System.out.println("\n1. Get File Details.");
			System.out.println("2. Write into a File.");
			System.out.print("Enter your choice: ");
			ch = Integer.parseInt(in.readLine());
			switch(ch){
				case 1: GetFileDetails(); break;
				case 2: WriteIntoFile(); break;
				default: System.exit(0);
			}
		}
	}
	public static void GetFileDetails() throws IOException{
		System.out.print("Enter File Name: ");
		File file = new File(in.readLine());
		if(file.exists()){
			System.out.println("File Name: "+ file.getName());
			System.out.println("File Exists: "+ file.exists());
			System.out.println("File Readable: "+ file.canRead());
			System.out.println("File Writable: "+ file.canWrite());
			System.out.println("File Type: "+ file.getName().substring(file.getName().indexOf(".")+1));
			System.out.println("File Length: "+ file.length() +" Bytes");
		}
		else{
			System.out.println("File not found!!");
		}
	}
	public static void WriteIntoFile(){
		System.out.println("Enter your file name : ");
		try (FileWriter bw = new FileWriter(in.readLine())){
			System.out.print("Enter the string: ");
			bw.write(in.readLine());
			System.out.println("Success...");
			//return true;
		}
		catch (IOException e) {
			System.out.println("IO Error occured : " + e.getMessage());
		}
		//return false;
	}

}


/*public static boolean WriteIntoFile() {

	System.out.println("Enter your file name : ");
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(scanner.nextLine()))){
	System.out.println("Enter the string : ");
	bw.write(scanner.nextLine());
	return true;
	}
	catch (IOException e) {
	System.out.println("IO Error occured : " + e.getMessage());
	}
	return false;
	}
	}
*/