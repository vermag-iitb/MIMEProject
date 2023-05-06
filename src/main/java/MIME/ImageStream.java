package MIME;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;


//@WebServlet("/mimeEx")
public class ImageStream extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public ImageStream() 
    {
        super();
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		
		// Note: bcz jpeg can be shown by browser, we don't need to describe MIME type.
		
//		// Case 1: Reading a JPEG image and displaying on browser
//		// ------------------------------------------------------
//		// to open a stream to read a file (the image is stored in server)
//		FileInputStream fis = new FileInputStream("/Users/vermag5/Downloads/freddie.jpeg");
//		
//		// count number of bytes required to read the file (or size of the file)
//		int n = fis.available();
//		
//		// allocation of space in RAM for file
//		byte b [] = new byte[n];
//		
//		// reading from the file and closing the stream
//		fis.read(b);
//		fis.close();
//		
//		//generating a response to be sent to client-browser
//		ServletOutputStream sos = response.getOutputStream();
//		sos.write(b);
		
		
//		// Case 2: Downloading a msword file sent from server
//		// --------------------------------------------------
//		
//		//Changing MIME type
//		response.setContentType("application/msword");
//		
//		// to open a character stream to read a file (the file is stored in server)
//		PrintWriter pw = response.getWriter();
//		pw.println("Welcome and see EXCEL file!!!");
		
		// Case 3: Reading an excel file from server
		// -----------------------------------------
		
		response.setContentType("application/vnd.ms-excel");
		FileInputStream fis = new FileInputStream("/Users/vermag5/Downloads/waste.xlsx");
		int n = fis.available();
		byte b [] = new byte[n];
		fis.read(b);
		fis.close();
		ServletOutputStream sos = response.getOutputStream();
		sos.write(b);
	}
}