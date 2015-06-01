package org.sarfaraz.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ParseHTML {
	final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	private  Predicate<Element> isFileRow() {
	    return p -> !p.getElementsByAttributeValue("name", "filename").isEmpty();
	}
	
	private Function<Element, CTLFiles> extractFileAttr(){
		return tr -> {
			try {
				return new CTLFiles(
						tr.getElementsByTag("td").get(1).text(), 
						sdf.parse(tr.getElementsByTag("td").get(2).text().trim()),
						tr.getElementsByTag("td").get(3).text());
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		};
	}
	
	public List<CTLFiles> getFileListFromDoc(Document doc) throws Exception {
		return doc.getElementsByAttributeValue("name", "recvForm").get(0)
						.getElementsByTag("tr").stream()
						.filter(isFileRow())
						.map(extractFileAttr())
						.collect(Collectors.toList());
	}



}
