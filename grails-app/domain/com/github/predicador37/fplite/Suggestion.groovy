package com.github.predicador37.fplite

/** Domain class that models static rules applicable to functional elements as stated in FP Lite methodology.
 * Could be shared rules. Gives some help to the analyst.
 * @author predicador
 *
 */

class Suggestion {

    static constraints = {
    }
	
	String description
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [FunctionalElement]
}
