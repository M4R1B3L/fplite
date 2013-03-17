package com.github.predicador37.fplite

/** Domain class that models a software project. 
 *  Relevant metadata about the project can be stored here.
 * @author predicador
 * @version 1.0
 */

class Project {

    static constraints = {
    }
	
	String title
	String description
	Date startDate
	Date endDate 
	Date estimatedEndDate
	
	Date dateCreated
	Date lastUpdated
	
}
