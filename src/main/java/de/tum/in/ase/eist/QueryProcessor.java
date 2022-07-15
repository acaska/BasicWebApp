package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Zuza";
        } else if (query.contains("numbers")) {
            return "131";
        } else if (query.contains ("13")) {
            return "20";
        } else if (query.contains ("19")) {
            return "25";
        } else if (query.contains ("what is 4 plus 16")) {
            return "20";
        } else {
            // TODO extend the programm here
            return "";
        }
    }
}
