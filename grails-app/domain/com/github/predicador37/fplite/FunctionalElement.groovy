package com.github.predicador37.fplite

/** Domain class that models functional elements as defined by FP Lite methodology.
 *  Possible values are: ILF, ELF, EI, EO, EQ
 * @author predicador
 * @version 1.0
 */

class FunctionalElement {

    static constraints = {
    }
	
	String title
	String acronym
	String description
	Integer meanComplexity
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [rules:Rule]
}
