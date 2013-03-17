package com.github.predicador37.fplite

/** Domain class that models software project types. 
 *  For now, agile or cascade.
 * @author predicador
 * @version 1.0
 */

class ProjectType {

    static constraints = {
    }
	
	String title
	String description
	Date dateCreated
	Date lastUpdated
}
