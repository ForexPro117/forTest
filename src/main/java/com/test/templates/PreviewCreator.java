package com.test.templates;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.html2pdf.HtmlConverter;

public class PreviewCreator {

	public static void main(String[] args) throws FileNotFoundException {


		String style = "<style>*{width:195mm;  white-space: normal;overflow-wrap: break-word;"
				+ ".ql-align-justify {\r\n" + "    text-align: justify;\r\n" + "}\r\n" + ".ql-align-center {\r\n"
				+ "    text-align: center;\r\n" + "}\r\n" + ".ql-align-right {\r\n" + "    text-align: right;\r\n"
				+ "}\r\n" + ".ql-font-arial {\r\n" + "    font-family: \"Arial\", sans-serif;\r\n"
				+ "}.ql-font-courier {\r\n" + "    font-family: \"Courier\", sans-serif;\r\n" + "}\r\n"
				+ ".ql-font-times-new-roman {\r\n" + "    font-family: \"Times New Roman\", sans-serif;\r\n" + "}\r\n"
				+ ".ql-font-verdana {\r\n" + "    font-family: \"Verdana\", sans-serif;\r\n" + "}</style>";
		
		
		
		HtmlConverter.convertToPdf(Hne.HTML + style, new FileOutputStream("C:/Projects/test.pdf"));
		HtmlConverter.convertToPdf(Hne.HTML2 + style, new FileOutputStream("C:/Projects/test2.pdf"));
		
		
		
		System.out.print("Ready!");
		
	}

}
