package lombok;

import java.util.Date;

// @ : 어노테이션
@Data 							// 모든 어노테이션
// @NoArgsConstructor			// 기본 생성자
// @AllArgsConstructor			// 모든 매개변수 생성자
// @RequiredArgsConstructor		// 필수 생성자
// @Getter							// getter
// @Setter							// setter
// @ToString						// toString
// @EqualsAndHashCode
// 교재 510페이지
public class Board {	
	
	// private final byte t;
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updDate;
	
	
	
	

}
