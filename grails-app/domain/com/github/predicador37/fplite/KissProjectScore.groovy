package com.github.predicador37.fplite



/** Domain class that models the relationship between projects and KISS Quick estimation methodology questions
 *  Stores number of ocurrences of functions identified in questions
 *  Could be thought as an artificial many-to-many relationship between Project and KissQuickQuestion
 *  More information about this can be found here: http://grails.org/Many-to-Many+Mapping+without+Hibernate+XML
 * @author predicador
 * @version 1.0
 */
class KissProjectScore {

    static constraints = {
    }
	
	Project project
	KissQuickQuestion kissQuickQuestion
	Integer number
	
	/** Method which creates a new record/association in artificial many-to-many relationship
	 * 
	 * @param project: project to link in artificial many-to-many relationship
	 * @param kissQuickQuestion: kiss quick question to link in artificial many-to-many relationship
	 * @return linked record of type KissProjectScore
	 */
	static KissProjectScore link(project, kissQuickQuestion) {
		def m = KissProjectScore.findByProjectAndKissQuickQuestion(project, kissQuickQuestion)
		 if (!m) {
			 m = new KissProjectScore()
			 project?.addToKissProjectScores(m)
			 kissQuickQuestion?.addToKissProjectScores(m)
			 m.save(failOnError:true) }
		 return m }
	/** Method which deletes an existing record/association in artificial many-to-many relationship
	 *
	 * @param project: project to link in artificial many-to-many relationship
	 * @param kissQuickQuestion: kiss quick question to link in artificial many-to-many relationship
	 * @return void
	 */
   static void unlink(project, kissQuickQuestion) {
		def m = KissProjectScore.findByProjectAndKissQuickQuestion(project,kissQuickQuestion)
		if (m) {
			project?.removeFromKissProjectScores(m)
			kissQuickQuestion?.removeFromKissProjectScores(m)
			m.delete() }
		 }
}
