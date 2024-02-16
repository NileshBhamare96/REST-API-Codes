package in.nileshit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Bank_ACOUNTS")
public class Account {
    
	@Column(name = "BRANCH-NAME")
	private String branchName;
	
	@Column(name = "MIN-BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accPk;

}
