package com.github.predicador37.fplite

/** Domain class which models software requirements.
 *  Follows Government of Cantabria's DRF document.
 * @author predicador
 * @version 1.0
 */

class Requirement {

    static constraints = {
    }
	
	String title
	String description
	String scope
	Priority priority
	RequirementType type
	Project project
	FunctionalElement functionalElement
	Date dateCreated
	Date lastUpdated
	
}
