package com.github.predicador37.fplite

/** Domain class that models type of requirement. 
 *  Following Government of Cantabria's DRF, could be one of these: functional, non-functional.
 *  Must be extended with IEEE Std 830-1998 
 * @author predicador
 * @version 1.0
 */

class RequirementType {

    static constraints = {
    }
	
	String title
	String description
	Date dateCreated
	Date lastUpdated
}
