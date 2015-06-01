package org.sarfaraz.parser;

import java.io.IOException;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
	public static void main(String[] args) {
		
		try {
			
//			Connection conn = Jsoup.connect("https://qpid01.qwest.com/cgi-bin/login.exe")
//		            .data("user_id", "LBTLAC")
//		            .data("password", "^WOsXB/ph");
//			Document doc = conn
//	            .post();
//			
//			ParseHTML parser = new ParseHTML();
//			List<CTLFiles> ctlFiles = parser.getFileListFromDoc(doc);
//			System.out.println(ctlFiles);
//			String fileName= ctlFiles.get(0).getFilename();
//			System.out.println("trying to download file : "+ fileName);
//			Document doc1=conn
//		            .data("action", "/cgi-bin/xfile.exe?c2RndXNyPUxCVExBQyZzZGdpbnQ9UlNMJnRtb2RlPVJFQ1ZPTkxZJnZlcnNpb249NC4wNCZJbmZvPUswUTFwQjZaR1ZJT2tYRWFRZks1eHpaS0Y5WSUzRA==")
//		            .data("mode", "BROWSER")
//		            .data("sdgint", "RSL")
//		            .data("sdgusr", "LBTLAC")
//		            .data("Info", "K0Q1pB6ZGVIOkXEaQfK5xzZKF9Y%3D")
//		            .data("version", "4.04")
//		            .data("selectedfile", fileName)		            
//		            .post();
//			
//			System.out.println(doc1);
			
			ParseFile fp= new ParseFile();
			System.out.println(
					fp.parseFile("D:\\data", "L20.datarsll20150513.txt")
					
			);
			

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
