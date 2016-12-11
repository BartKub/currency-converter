package service;

public class CurrencyCalculator {
	private String base;
	private String date;
	private String rates;

	public CurrencyCalculator() {
		
	}

	public CurrencyCalculator(String base, String date, String rates) {

		this.base = base;
		this.date = date;
		this.rates = rates;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRates() {
		return rates;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}

}
