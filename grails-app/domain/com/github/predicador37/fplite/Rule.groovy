package com.github.predicador37.fplite

/** Domain class that models suggestions applicable to functional elements as stated in FP Lite methodology.
 * Could be shared suggestions. Gives some help to the analyst.
 * @author predicador
 *
 */

class Rule {

    static constraints = {
    }
	
	String description
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [FunctionalElement]
}
