package contribuintes;

public class TaxPayer {
	Double salaryIncome;
	Double serviceIncome;
	Double capitalIncome;
	Double healthSpending;
	Double educationSpending;
	
	
	public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}


	public Double getSalaryIncome() {
		return salaryIncome;
	}


	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}


	public Double getServiceIncome() {
		return serviceIncome;
	}


	public void setServiceIncome(Double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}


	public Double getCapitalIncome() {
		return capitalIncome;
	}


	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}


	public Double getHealthSpending() {
		return healthSpending;
	}


	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}


	public Double getEducationSpending() {
		return educationSpending;
	}


	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}


	public Double salaryTax() {
		Double salary = salaryIncome / 12.0;
		Double percent;
		
		if (salary < 3000.0) {
			percent = 0.0;
		} else if (salary >= 3000.0 && salary < 5000) {
			percent = 10.0;
		} else {
			percent = 20.0;
		}
		return salaryIncome * (percent / 100.0); 
	}
	
	public Double serviceTax() {
			return serviceIncome * (15.0 / 100.0);
	}
	
	public Double capitalTax() {
		return capitalIncome * (20.0 / 100.0);
	}
	
	public Double grossTax() {
		return salaryTax() + serviceTax() + capitalTax();
	}
	
	public Double taxRebate() {
		Double sumHealthEducation = healthSpending + educationSpending;
		Double percentRebate = grossTax() * (30.0 / 100.0);
		
		if (percentRebate < sumHealthEducation) {
			return percentRebate;
		} else {
			return sumHealthEducation;
		}
	}
	
	
	public Double netTax() {
		return grossTax() - taxRebate();
	}
}
