package com.test.templates;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.IElement;

public class PreviewCreator {

	public static void main(String[] args) throws FileNotFoundException {

		String style = "<style>*{ white-space: pre-wrap; overflow-wrap: break-word; line-height: 1.42; tab-size: 4;"
				+ ".ql-align-justify {\r\n" + "    text-align: justify;\r\n" + "}\r\n" + ".ql-align-center {\r\n"
				+ "    text-align: center;\r\n" + "}\r\n" + ".ql-align-right {\r\n" + "    text-align: right;\r\n"
				+ "}\r\n" + ".ql-font-arial {\r\n" + "    font-family: \"Arial\", sans-serif;\r\n"
				+ "}.ql-font-courier {\r\n" + "    font-family: \"Courier\", sans-serif;\r\n" + "}\r\n"
				+ ".ql-font-times-new-roman {\r\n" + "    font-family: \"Times New Roman\", sans-serif;\r\n" + "}\r\n"
				+ ".ql-font-verdana {\r\n" + "    font-family: \"Verdana\", sans-serif;\r\n" + "}   @page {\r\n"
				+ "        margin: 1cm 2cm 2cm 2cm;\r\n" + " } p{ margin: 0; padding: 0;}</style>";

		/*
		 * HtmlConverter..convertToPdf(Hne.HTML + style, new
		 * FileOutputStream("C:/Projects/test.pdf"));
		 * HtmlConverter.convertToPdf(Hne.HTML2 + style, new
		 * FileOutputStream("C:/Projects/test2.pdf"));
		 */
		HtmlConverter.convertToPdf(Hne.HTML4 + style, new FileOutputStream("C:/Projects/test2.pdf"));
//	
//		ConverterProperties properties = new ConverterProperties();
//		PdfWriter writer = new PdfWriter("C:/Projects/test2.pdf");
//	    PdfDocument pdf = new PdfDocument(writer);
//	    Document doc = HtmlConverter.convertToDocument(Hne.HTML4 + style, pdf,properties);
//		doc.close();

		System.out.print("Ready!");

	}

}
