package testIO;

import java.io.*;

public class main {
	public static void main(String[] arg){
		//testFile();
		try{
			testFile();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		testFileLength("1.png"); //项目目录下需要存在文件“1.png”
	}



static void testFile() throws IOException{
	String FILE_NAME = "testFile";
	
	File file = new File(FILE_NAME);
	try{
		file.createNewFile();
		System.out.println("getTotalSpace："+file.getTotalSpace()/(1024*1024*1024)+"G");
		System.out.println("getName:"+file.getName());
		System.out.println("getParent:"+file.getParent());
		System.out.println("getpath:"+file.getPath());
		file.delete();
	}catch(Exception e){
		e.printStackTrace();
	}
	

}

static void testFileLength(String filename){
	int count = 0;
	FileInputStream streamReader = null;
	try{
		try{
			streamReader = new FileInputStream(new File(filename));
			while(streamReader.read() != -1){
				count++;
			}
			System.out.println("文件长度是："+count+"字节");
			System.out.println("getClass:"+streamReader.getClass()+"   getName:"+streamReader.getClass().getName());
		}finally{
			streamReader.close();
		}

	}catch(final IOException e){
		e.printStackTrace();
	}
}

}