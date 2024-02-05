package kr.co.seoulit.insa.retirementsvc.retirementmgmt.to;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RetirementReceiptTO {
    private String
            empName,
            deptName,
            birthdate,
            position,
            address,
            retirementRange,
            hiredate,
            retiredate,
            retirementPayCheckDate,
            retirementPayDate,
            retirementPay,
            workplaceName,
            workplaceAddress,
            today;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getRetirementPayCheckDate() {
		return retirementPayCheckDate;
	}

	public void setRetirementPayCheckDate(String retirementPayCheckDate) {
		this.retirementPayCheckDate = retirementPayCheckDate;
	}

	public String getRetirementPayDate() {
		return retirementPayDate;
	}

	public void setRetirementPayDate(String retirementPayDate) {
		this.retirementPayDate = retirementPayDate;
	}

	public String getRetirementPay() {
		return retirementPay;
	}

	public void setRetirementPay(String retirementPay) {
		this.retirementPay = retirementPay;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getWorkplaceAddress() {
		return workplaceAddress;
	}

	public void setWorkplaceAddress(String workplaceAddress) {
		this.workplaceAddress = workplaceAddress;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	@Override
	public String toString() {
		return "RetirementReceiptTO [empName=" + empName + ", deptName=" + deptName + ", birthdate=" + birthdate
				+ ", position=" + position + ", address=" + address + ", retirementRange=" + retirementRange
				+ ", hiredate=" + hiredate + ", retiredate=" + retiredate + ", retirementPayCheckDate="
				+ retirementPayCheckDate + ", retirementPayDate=" + retirementPayDate + ", retirementPay="
				+ retirementPay + ", workplaceName=" + workplaceName + ", workplaceAddress=" + workplaceAddress
				+ ", today=" + today + "]";
	}

    
    
}