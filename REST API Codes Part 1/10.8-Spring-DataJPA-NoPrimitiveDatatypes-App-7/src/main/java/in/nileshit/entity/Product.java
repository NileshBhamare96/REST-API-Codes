package in.nileshit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT_MASTER_1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@Column(name = "PRODUCT_ID")
	private int pid;

	@Column(name = "PRODUCT_NAME")
	private String pname;

	@Column(name = "PRODUCT_PRICE")
	private double price;

	@CreationTimestamp
	@Column(name = "createdDate", updatable = false)
	private LocalDateTime createdDate;

	@UpdateTimestamp
	@Column(name = "UpdatedDate" , insertable = false)
	private LocalDateTime updatedDate;

}
