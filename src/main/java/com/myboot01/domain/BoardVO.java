package com.myboot01.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//@Data : @Getter, @Setter, @RequiredArgsConstructor(모든 멤버 변수를 초기화하는 생성자를 만들어준다.), 
//		  @ToString, @EqualsAndHashCode(equals(), hashCode() 메서드를 만들어준다.) 모두를 포함한다.

@Getter //getter 메소드를 만들어 준다.
@Setter //setter 메소드를 만들어 준다.
@ToString //모든 멤버변수의 값을 문자열로 연결하여 리턴하는 toString 메소드를 만들어 준다.
public class BoardVO {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private int cnt=0;
	
//	public int getSeq() {
//		return seq;
//	}
//	public void setSeq(int seq) {
//		this.seq = seq;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public Date getCreateDate() {
//		return createDate;
//	}
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//	public int getCnt() {
//		return cnt;
//	}
//	public void setCnt(int cnt) {
//		this.cnt = cnt;
//	}
	
	
}
