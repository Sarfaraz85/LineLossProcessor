package org.sarfaraz.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseFile {

	public File getFile(String fileName){
		String url="https://qpid01.qwest.com/cgi-bin/xfile.exe?c2RndXNyPUxCVExBQyZzZGdpbnQ9UlNMJnRtb2RlPVJFQ1ZPTkxZJnZlcnNpb249NC4wNCZJbmZvPUswUTFwQjZaR1ZJT2tYRWFRZks1eHpaS0Y5WSUzRA==";

         fileName = url.substring(url.lastIndexOf('/') + 1);
         return null;
	}
	
	public List<String>  parseFile(String path, String fileName) throws IOException
	{
	    Path fpath = Paths.get(path, fileName);
	    		
	    	return	Files.lines(fpath)
//	    			.filter(s -> s.contains("password"))
	    			.collect(Collectors.toList());
	    	
	     
	    
	}
}
