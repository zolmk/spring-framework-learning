package org.springframework.example;

import org.springframework.stereotype.Component;

@Component
public class AObj {

	private BObj bObj;

	public AObj() {
	}

	public BObj getbObj() {
		return bObj;
	}

	public void setbObj(BObj bObj) {
		this.bObj = bObj;
	}
}
