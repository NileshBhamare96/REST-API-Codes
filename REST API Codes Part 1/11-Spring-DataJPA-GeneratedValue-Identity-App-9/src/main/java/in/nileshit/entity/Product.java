package in.nileshit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT_STORE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	@Column(name = "PRODUCT_NAME")
	private String pname;

	@Column(name = "PRODUCT_PRICE")
	private Double price;

	@CreationTimestamp
	@Column(name = "createdDate", updatable = false)
	private LocalDateTime createdDate;

	@UpdateTimestamp
	@Column(name = "UpdatedDate" , insertable = false)
	private LocalDateTime updatedDate;

}
