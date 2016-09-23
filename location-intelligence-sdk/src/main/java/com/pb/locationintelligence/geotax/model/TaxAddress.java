package com.pb.locationintelligence.geotax.model;

public class TaxAddress extends TaxRateAddress{


	protected String purchaseAmount;

	public String getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(String value) {
		this.purchaseAmount=value;
	}
}
