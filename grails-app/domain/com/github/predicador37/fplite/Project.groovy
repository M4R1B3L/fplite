package com.github.predicador37.fplite

import java.util.List;

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
	
	static hasMany = [kissProjectScores:KissProjectScore]
	
	/** Method that lists KISS Quick methodology questions related to this project
	 * 
	 * @return List of related kissQuickQuestions
	 */
	def kissQuickQuestions() {
		return kissProjectScores.collect{it.kissQuickQuestion}
	}
	
	/** Method that implements addTo operation in Project class.
	 *  Allows to add a kissQuickQuestion-to-project relationship
	 * @param kissQuickQuestion
	 * @return List of related kissQuickQuestions
	 */
	List addToKissQuickQuestions(KissQuickQuestion kissQuickQuestion) {
		KissProjectScore.link(this, kissQuickQuestion)
		return kissQuickQuestions()
		 }
	
	/** Method that implements removeFrom operation in Project class.
	 *  Allows to remove a kissQuickQuestion-to-project relationship
	 * @param kissQuickQuestion 
	 * @return List of related kissQuickQuestions
	 */
	List removeFromKissQuickQuestions(KissQuickQuestion kissQuickQuestion) {
		 KissProjectScore.unlink(this, kissQuickQuestion)
		 return kissQuickQuestions()
		   }
}
