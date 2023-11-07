package org.springframework.example;

import org.springframework.stereotype.Component;

@Component
public class BObj {
	private AObj aObj;

	public AObj getaObj() {
		return aObj;
	}

	public void setaObj(AObj aObj) {
		this.aObj = aObj;
	}
}
