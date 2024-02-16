package in.nileshit.bindings;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Person {

	@NotNull
	@Size(min = 3, max = 8)
	private String name;

	@NotNull
	@Min(18)
	@Max(75)
	private Integer age;

}