import java.io.*; 

public class FileCopyNoBuffer{ 
	public static void main(String[] args) throws IOException{ 
		String inFileStr= "java.png"; 
		String outFileStr= "test-out.jpg"; 
		long startTime, elapsedTime; // for speed benchmarking 
		// Print file length 
		File fileIn= new File(inFileStr);
		System.out.println("File size is " + fileIn.length()+ " bytes"); 
		try(BufferedInputStream in = new BufferedInputStream (new FileInputStream (inFileStr));
				BufferedOutputStream out = new BufferedOutputStream (new FileOutputStream (outFileStr ))) { 
					
			startTime= System.nanoTime(); 
			// with 4k buffer
			byte[] byteBuf = new byte[ 4096];// 4K byte buffer
			int byteRead; 
			// Read a no of byte as per size, returns no.of bytes read or -1
			while ((byteRead= in.read(byteBuf)) != -1)
			// Read raw byte and return int of 0-255
			//while ((byteRead= in.read()) != -1)
			{ 
				// write no of byte, from begin of number of bytes
				out.write(byteBuf,0,byteRead);
				// Write the least-significant byte of int, drop the upper 3 bytes 
				
				//out.write(byteRead);
			}
			elapsedTime= System.nanoTime() -startTime; 
			System.out.println("Elapsed Time is " + (elapsedTime/ 1000000.0)  
					+ " msec"); 
		}
	}
}
