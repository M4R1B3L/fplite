package com.github.predicador37.fplite

import java.util.List;

/** Domain class that models KISS Quick estimation methodology associated questions
 *  Only IFPUG multipliers at the moment
 * @author predicador
 *
 */
class KissQuickQuestion {

    static constraints = {
    }
	
	String  description
	Integer ifpugMultiplier
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [kissProjectScores:KissProjectScore]
	
	/** Method that lists projects related to this KISS Quick methodology question
	 *
	 * @return List of related projects
	 */
	def projects() {
		return kissProjectScores.collect{it.project}
	}
	
	/** Method that implements addTo operation in KissQuickQuestion class.
	 *  Allows to add a project-to-kissQuickQuestion relationship
	 * @param project
	 * @return List of related projects once added the association
	 */
	List addToProjects(Project project) {
		KissProjectScore.link(project, this)
		return projects()
		 }
	
	/** Method that implements removeFrom operation in KissQuickQuestion class.
	 *  Allows to remove a project-to-kissQuickQuestion relationship
	 * @param project
	 * @return List of related projects once removed the association
	 */
	List removeFromProjects(Project project) {
		 KissProjectScore.unlink(project, this)
		 return projects()
		   }
}
