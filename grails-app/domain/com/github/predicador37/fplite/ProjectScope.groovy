package com.github.predicador37.fplite

/** Domain class that models the project scope.
 *  Possible scopes: development, maintenance. 
 * @author predicador
 * @version 1.0
 */

class ProjectScope {

    static constraints = {
    }
	
	String title
	String description
	Date dateCreated
	Date lastUpdated
}
