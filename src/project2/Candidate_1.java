package project2;

public class Candidate_1 {

	Integer id;
	String candidate_name;
	Integer vote_count;
	
	public Candidate_1() {
		// TODO Auto-generated constructor stub
	}

	public Candidate_1( String id, String candidate_name,String vote_count) {
		// TODO Auto-generated constructor stub
		this.candidate_name = candidate_name;
		this.id = Integer.parseInt(id);
		this.vote_count = Integer.parseInt(vote_count);
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public Integer getVote_count() {
		return vote_count;
	}

	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}

	public void increaseVote(){
		this.vote_count++;
	}

	
	
}
