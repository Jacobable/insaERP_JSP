package kr.co.seoulit.insa.retirementsvc.retirementmgmt.to;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RetirementPayTO {
    private String empName, retirementPay,retirementRange, hiredate, retiredate, retirementBonus, retirementAwards;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getRetirementPay() {
		return retirementPay;
	}

	public void setRetirementPay(String retirementPay) {
		this.retirementPay = retirementPay;
	}

	public String getRetirementRange() {
		return retirementRange;
	}

	public void setRetirementRange(String retirementRange) {
		this.retirementRange = retirementRange;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getRetiredate() {
		return retiredate;
	}

	public void setRetiredate(String retiredate) {
		this.retiredate = retiredate;
	}

	public String getRetirementBonus() {
		return retirementBonus;
	}

	public void setRetirementBonus(String retirementBonus) {
		this.retirementBonus = retirementBonus;
	}

	public String getRetirementAwards() {
		return retirementAwards;
	}

	public void setRetirementAwards(String retirementAwards) {
		this.retirementAwards = retirementAwards;
	}
    
}