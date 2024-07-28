package DailyQuiz715;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

	private String name;
	private String email;
	private boolean isAdmin;
	private String password;

}
