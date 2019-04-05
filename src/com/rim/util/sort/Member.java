package com.rim.util.sort;

public class Member implements Comparable<Member> {

	private String id;
	private int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}

	@Override
	public int compareTo(Member o) {
		int result=0;
		
		if(this.age>o.age) {
			result=1; //둘이 자리를 바꾼다
		}else if(this.age<o.age) {
			result=-1; //안바꿈
		}else {
			result = this.id.compareTo(o.getId());//이름순 정렬
			if(result>0)
				result=1;
			else
				result=-1;
				
		}
		
		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
